package com.skybrian.leadermailbox;

import com.skybrian.leadermailbox.mq.consumer.Consumer;
import com.skybrian.leadermailbox.mq.producer.Producer;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author jovi
 * @Date 2020/3/9 13:36
 * @Description
 **/
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class RabbitMqTest {

    @Autowired
    private Producer producer;

    @Autowired
    private Consumer consumer;

    @Test
    public void testProducerSendMS() {
        Map<String, Object> ms = new HashMap<>(20);
        ms.put("a", "111");
        producer.sendMessage("hello", ms);
    }

    @Test
    public void testProducerSend() {
        producer.sendMq();
    }

    @Test
    public void testProducerSendRabbit() {
        producer.sendMqRabbit();
    }

    @Test
    public void testProducerSendEx() {
        producer.sendMqExchange();
    }

    @Test
    public void testProducerConfirm() {
        CorrelationData correlationData = new CorrelationData();
        producer.confirm(correlationData, true, "sss");
    }

    @Test
    public void testConsumer() {
//        consumer.process1("sssss");
    }
}
