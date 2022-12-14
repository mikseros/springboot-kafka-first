package com.mikseros.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic mikserosTopic() {
		return TopicBuilder.name("mikseros")
				.build();
	}

	@Bean
	public NewTopic mikserosJsonTopic() {
		return TopicBuilder.name("mikseros_json")
				.build();
	}
}
