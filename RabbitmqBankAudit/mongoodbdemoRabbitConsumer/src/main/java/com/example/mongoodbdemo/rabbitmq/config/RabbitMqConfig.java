package com.example.mongoodbdemo.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.mongoodbdemo.rabbitmq.listner.MessageListner;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;

@Configuration
public class RabbitMqConfig {
	
	
	
	
	//exchange will send the message through ROUTING_KEY to queue
		public static final String ROUTING_KEY="my.queue.key";
		
		//queue will recieve the message and make it durable
		@Bean
		Queue queue()
		{
			System.out.println("in client 2 queue");
			return new Queue(ROUTING_KEY, true);
		}
		
		@Bean
		TopicExchange exchange()
		{
			return new TopicExchange("queue_Consum_exchange");
			
		}
		
		@Bean
		Binding binding(Queue queue, TopicExchange exchange)
		{
			return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
			
		}
		//to listen the message
		@Bean
		SimpleMessageListenerContainer messageListenerContainer(ConnectionFactory connectionFactory, MessageListenerAdapter adapter)
		{
			SimpleMessageListenerContainer container=new SimpleMessageListenerContainer();
			container.setConnectionFactory(connectionFactory);
			container.setQueueNames(ROUTING_KEY);
			container.setMessageListener(adapter);
			container.setMessageConverter(jsonMessageConverter());
			return container;
			
		}
		@Bean
		public MessageConverter jsonMessageConverter(){
		    return new Jackson2JsonMessageConverter();
		}
		//onMessage method will consume the message
		@Bean
		MessageListenerAdapter listner(MessageListner listner)
		{
			System.out.println(listner);
			MessageListenerAdapter mla = new MessageListenerAdapter(listner,"onMessage"); 
			return mla;
		}
}
