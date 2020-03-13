package com.skybrian.leadermailbox.mq.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author jovi
 * @Date 2020/3/9 15:43
 * @Description
 **/
@Configuration
public class RabbitMqConfig {

    public final static String DIRECT_QUEUE = "directQueue";

    public final static String TOPIC_QUEUE_ONE = "topic_queue_one";
    public final static String TOPIC_QUEUE_TWO = "topic_queue_two";
    public final static String FANOUT_QUEUE_ONE = "fanout_queue_one";
    public final static String FANOUT_QUEUE_TWO = "fanout_queue_two";

    public final static String TOPIC_EXCHANGE = "topic_exchange";
    public final static String FANOUT_EXCHANGE = "fanout_exchange";

    public final static String TOPIC_ROUTINGKEY_ONE = "common_key";
    public final static String TOPIC_ROUTINGKEY_TWO = "*.key";

    /**
     * @description direct模式队列
     * @param:
     * @return:
     * @author: jovi
     * @date: 2020/3/9 15:46
     */
    @Bean
    public Queue directQueue() {
        return new Queue(DIRECT_QUEUE, true);
    }

    /**
     * @description topic 订阅者模式队列
     * @param:
     * @return:
     * @author: jovi
     * @date: 2020/3/9 15:46
     */
    @Bean
    public Queue topicQueueOne() {
        return new Queue(TOPIC_QUEUE_ONE, true);
    }

    @Bean
    public Queue topicQueueTwo() {
        return new Queue(TOPIC_QUEUE_TWO, true);
    }

    /**
     * @description fanout 广播者模式队列
     * @param:
     * @return:
     * @author: jovi
     * @date: 2020/3/9 15:46
     */
    @Bean
    public Queue fanoutQueueOne() {
        return new Queue(FANOUT_QUEUE_ONE, true);
    }

    @Bean
    public Queue fanoutQueueTwo() {
        return new Queue(FANOUT_QUEUE_TWO, true);
    }

    /**
     * @description topic 交换器
     * @param:
     * @return:
     * @author: jovi
     * @date: 2020/3/9 15:47
     */
    @Bean
    public TopicExchange topExchange() {
        return new TopicExchange(TOPIC_EXCHANGE);
    }

    /**
     * @description fanout 交换器
     * @param:
     * @return:
     * @author: jovi
     * @date: 2020/3/9 15:47
     */
    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange(FANOUT_EXCHANGE);
    }

    /**
     * @description 订阅者模式绑定
     * @param:
     * @return:
     * @author: jovi
     * @date: 2020/3/9 15:48
     */
    @Bean
    public Binding topExchangeBingingOne() {
        return BindingBuilder.bind(topicQueueOne()).to(topExchange()).with(TOPIC_ROUTINGKEY_ONE);
    }

    @Bean
    public Binding topicExchangeBingingTwo() {
        return BindingBuilder.bind(topicQueueTwo()).to(topExchange()).with(TOPIC_ROUTINGKEY_TWO);
    }

    /**
     * @description 广播模式绑定
     * @param:
     * @return:
     * @author: jovi
     * @date: 2020/3/9 15:48
     */
    @Bean
    public Binding fanoutExchangeBingingOne() {
        return BindingBuilder.bind(fanoutQueueOne()).to(fanoutExchange());
    }

    @Bean
    public Binding fanoutExchangeBingingTwo() {
        return BindingBuilder.bind(fanoutQueueTwo()).to(fanoutExchange());
    }
}
