package com.example.mongoodbdemo.rabbitmq.listner;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.example.mongoodbdemo.model.AuditMessage;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class MessageListnerImpl implements MessageListner{

	@Override
	public void onMessage(String message) {
		System.out.println(new Date());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("message Received"+message);
		
		ObjectMapper mapper = new ObjectMapper();
		AuditMessage convertValue = mapper.convertValue(message, AuditMessage.class);
		
		System.out.println(convertValue);
		
	}

	

}
