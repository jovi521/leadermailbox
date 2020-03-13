package com.skybrian.leadermailbox.mq.consumer;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.RpcClient;
import com.skybrian.leadermailbox.mq.config.RabbitMqConfig;
import com.skybrian.leadermailbox.mq.producer.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

/**
 * @Author jovi
 * @Date 2020/3/9 11:56
 * @Description
 **/
@Component
@EnableScheduling
public class Consumer {
    final static Logger LOGGER = LoggerFactory.getLogger(Producer.class);

    @RabbitListener(queues = "foo")
    @RabbitHandler
    public void process1(@Payload String message, @Headers Map<String, Object> headers, Channel channel) throws IOException {
        System.out.println("队列1: 您有新的消息请注意查收" + message);
        Long deliveryTag = (Long) headers.get(AmqpHeaders.DELIVERY_TAG);

        RpcClient.Response response = null;
        String result = null;
        try {
//            response = OkHttp.Post(backPageDTO.getNotifyUrl(), JSON.toJSONString(message));
            result = response.getBody().toString();
        } catch (Exception e) {
            result = e.getMessage();
//            log.error("回调发生异常：{},访问地址：{}",e.getMessage(),backPageDTO.getNotifyUrl());
        } finally {

        }
        /**
         *  取值为 false 时，表示通知 RabbitMQ 当前消息被确认
         *  如果为 true，则额外将比第一个参数指定的 delivery tag 小的消息一并确认
         */
        channel.basicAck(deliveryTag, false);
        System.out.println("--------消费完成--------");
    }

    //如果不存在，自动创建队列
    @RabbitListener(queuesToDeclare = @org.springframework.amqp.rabbit.annotation.Queue("test_queue"))
    public void receiverMq(String msg) {
        LOGGER.info("接收到队列消息:{}", msg);
    }

    //如果不存在，自动创建队列和交换器并且绑定
    @RabbitListener(bindings = {
            @QueueBinding(value = @org.springframework.amqp.rabbit.annotation.Queue(value = "topic_queue01", durable = "true"),
                    exchange = @Exchange(value = "topic_exchange", type = ExchangeTypes.TOPIC),
                    key = "routing_key_one")})
    public void receiverMqExchage(String msg, Channel channel, Message message) {

        long deliveryTag = message.getMessageProperties().getDeliveryTag();

        try {
            LOGGER.info("接收到topic_routing_key_one消息:{}", msg);
            //发生异常
            LOGGER.error("发生异常");
            int i = 1 / 0;
            //告诉服务器收到这条消息 已经被我消费了 可以在队列删掉 这样以后就不会再发了 否则消息服务器以为这条消息没处理掉 后续还会在发
            channel.basicAck(deliveryTag, false);
        } catch (Exception e) {
            LOGGER.error("接收消息失败,重新放回队列");
            //requeu，为true，代表重新放入队列多次失败重新放回会导致队列堵塞或死循环问题，
            // 解决方案，剔除此消息，然后记录到db中去补偿
            //channel.basicNack(deliveryTag, false, true);
            //拒绝消息
            //channel.basicReject(deliveryTag, true);
        }
    }

    @RabbitListener(bindings = {
            @QueueBinding(value = @org.springframework.amqp.rabbit.annotation.Queue(value = "topic_queue02", durable = "true"),
                    exchange = @Exchange(value = "topic_exchange", type = ExchangeTypes.TOPIC),
                    key = "routing_key_two")})
    public void receiverMqExchageTwo(String msg) {
        LOGGER.info("接收到topic_routing_key_two消息:{}", msg);
    }


    @RabbitListener(queues = RabbitMqConfig.FANOUT_QUEUE_ONE)
    public void receiverMqFanout(String msg, Channel channel, Message message) {
        long deliveryTag = message.getMessageProperties().getDeliveryTag();
        try {
            LOGGER.info("接收到队列fanout_queue_one消息:{}", msg);
            channel.basicAck(deliveryTag, false);
        } catch (Exception e) {
            e.printStackTrace();
            //多次失败重新放回会导致队列堵塞或死循环问题 丢弃这条消息
//            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, false);
            LOGGER.error("接收消息失败");
        }
    }

    @RabbitListener(queues = RabbitMqConfig.FANOUT_QUEUE_TWO)
    public void receiverMqFanoutTwo(String msg) {
        LOGGER.info("接收到队列fanout_queue_two消息:{}", msg);
    }
}
