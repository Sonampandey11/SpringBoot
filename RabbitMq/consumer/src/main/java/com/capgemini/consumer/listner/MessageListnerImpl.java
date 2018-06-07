package com.capgemini.consumer.listner;

import java.util.Date;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListnerImpl implements MessageListner {

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
	}

}
