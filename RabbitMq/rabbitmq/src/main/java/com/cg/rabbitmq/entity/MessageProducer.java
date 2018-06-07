package com.cg.rabbitmq.entity;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.rabbitmq.config.RabbitConfig;
@Component
public class MessageProducer {
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void message(String message)
	{
		System.out.println("hii");
		
		rabbitTemplate.convertAndSend(RabbitConfig.ROUTING_KEY,message);
		System.out.println("Is Listner called::"+rabbitTemplate.isReturnListener());
	}

}
