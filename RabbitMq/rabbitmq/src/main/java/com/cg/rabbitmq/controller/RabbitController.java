package com.cg.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rabbitmq.entity.MessageProducer;

@RestController
@RequestMapping("/mainpage")
public class RabbitController {
	@Autowired
	MessageProducer producer;
	
	@GetMapping
	public String callMessage(@RequestParam String message)
	{
		producer.message(message);
		return "message is called"+message;
		
	}

}
