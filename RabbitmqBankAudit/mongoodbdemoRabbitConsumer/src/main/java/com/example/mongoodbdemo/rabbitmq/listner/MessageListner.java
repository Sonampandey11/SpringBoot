package com.example.mongoodbdemo.rabbitmq.listner;

import org.springframework.stereotype.Component;

@Component
public interface MessageListner {
	
	public void onMessage(String message);

}
