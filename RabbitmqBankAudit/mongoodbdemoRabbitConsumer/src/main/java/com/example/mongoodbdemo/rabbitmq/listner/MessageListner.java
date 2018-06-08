package com.example.mongoodbdemo.rabbitmq.listner;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.example.mongoodbdemo.model.Audit;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import auditjar.demo.model.AuditMessage;



@Component
public class MessageListner {
	public static Object fromJsonToJava(String json, Class type)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper jsonMapper = new ObjectMapper();
		return jsonMapper.readValue(json, type);
	}
	public void onMessage( String message) {

		AuditMessage value = null;

		try {
			System.out.println("Message Number " + MessageListner.fromJsonToJava(message, AuditMessage.class) + " received.");
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
