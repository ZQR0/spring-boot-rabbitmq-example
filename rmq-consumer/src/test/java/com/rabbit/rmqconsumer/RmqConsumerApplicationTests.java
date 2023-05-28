package com.rabbit.rmqconsumer;

import com.rabbit.rmqconsumer.config.RabbitMQConfig;
import com.rabbit.rmqconsumer.consumer.RabbitMQConsumer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class RmqConsumerApplicationTests {

	@Autowired
	private RabbitMQConfig config;

	@Autowired
	private RabbitMQConsumer consumer;

	@Test
	void contextLoads() {
	}

	@Test
	void isRabbitMQConfigNotNull() {
		assertThat(this.config).isNotNull();
	}

	@Test
	void isRabbitConsumerNotNull() {
		assertThat(this.consumer).isNotNull();
	}


}
