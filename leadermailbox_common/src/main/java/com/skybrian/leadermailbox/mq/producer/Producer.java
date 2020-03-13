package com.skybrian.leadermailbox.mq.producer;

import com.skybrian.leadermailbox.mq.config.RabbitMqConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * @Author jovi
 * @Date 2020/3/9 12:01
 * @Description 消息生产者
 **/
@Component
public class Producer implements RabbitTemplate.ConfirmCallback, RabbitTemplate.ReturnCallback {

    final static Logger LOGGER = LoggerFactory.getLogger(Producer.class);

    // 消息的确认模式correlationData: 消息的唯一标识.
    final RabbitTemplate.ConfirmCallback confirmCallback = (correlationData, ack, cause) -> {
        if (!ack) {
            // 对消息的补偿机制.
        }
    };

    // 消息的返回模式
    final RabbitTemplate.ReturnCallback returnCallback = (message, replyCode, replyText, exchange, routingKey) -> {
    };

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public Producer(RabbitTemplate rabbitTemplate) {
        rabbitTemplate.setConfirmCallback(this);
        rabbitTemplate.setReturnCallback(this);
    }

    public void sendMessage(Object message, Map<String, Object> headers) {
        MessageHeaders messageHeaders = new MessageHeaders(headers);
        org.springframework.messaging.Message sendMessage = MessageBuilder.createMessage(message, messageHeaders);

        // 发送消息之前, 需要设置消息的确认模式和返回模式
        rabbitTemplate.setConfirmCallback(confirmCallback);
        rabbitTemplate.setReturnCallback(returnCallback);

        // 设置CorrelationData: 必须全局唯一, 保证消息补偿机制的时候, 能够找到唯一的消息.
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(UUID.randomUUID().toString());
        rabbitTemplate.convertAndSend("exchange-001", "springBoot.#", sendMessage, correlationData);
    }

    public void sendMq() {
        rabbitTemplate.convertAndSend("test_queue", "test_queue" + LocalDateTime.now());
        LOGGER.info("发送消息:{}", "test_queue" + LocalDateTime.now());
    }


    public void sendMqRabbit() {
        //回调id
        CorrelationData cId = new CorrelationData(UUID.randomUUID().toString());
//        rabbitTemplate.convertAndSend(RabbitMqConfig.FANOUT_EXCHANGE, "", "广播者模式测试",cId);
        Object object = rabbitTemplate.convertSendAndReceive(RabbitMqConfig.FANOUT_EXCHANGE, "", "广播者模式测试", cId);
        LOGGER.info("发送消息:{},object:{}", "广播者模式测试" + LocalDateTime.now(), object);
    }

    //发送订阅者模式
    public void sendMqExchange() {
        CorrelationData cId = new CorrelationData(UUID.randomUUID().toString());
        CorrelationData cId01 = new CorrelationData(UUID.randomUUID().toString());
        LOGGER.info("订阅者模式->发送消息:routing_key_one");
        rabbitTemplate.convertSendAndReceive("topic_exchange", "routing_key_one", "routing_key_one" + LocalDateTime.now(), cId);
        LOGGER.info("订阅者模式->发送消息routing_key_two");
        rabbitTemplate.convertSendAndReceive("topic_exchange", "routing_key_two", "routing_key_two" + LocalDateTime.now(), cId01);
    }

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        String messageId = correlationData.getId();
        //返回成功，表示消息被正常投递
        if (ack) {
            LOGGER.info("信息投递成功，messageId:{}", messageId);
        } else {
            LOGGER.error("消费信息失败，messageId:{} 原因:{}", messageId, cause);
        }
    }

    @Override
    public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
        LOGGER.info("消息发送失败id:{}", message.getMessageProperties().getCorrelationId());
        LOGGER.info("消息主体 message : ", message);
        LOGGER.info("消息主体 message : ", replyCode);
        LOGGER.info("描述：" + replyText);
        LOGGER.info("消息使用的交换器 exchange : ", exchange);
        LOGGER.info("消息使用的路由键 routing : ", routingKey);
    }
}
