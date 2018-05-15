package com.example.demo.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

public class ClientCall {
	public static void main(String[] args) {
		deleteCustomer();
	}
	
		public static void deleteCustomer()
		{
			String url="http://localhost:8080/customerdetail/main/delete/{customerId}";
			Map<String, String> map = new HashMap<String, String>();
		    map.put("customerId", "91");
			RestTemplate template=new RestTemplate();
			template.delete(url, map);
		
		}
		
		public static void updateCustomer()
		{
			String urldelete ="http://localhost:8080/customerdetail/main/update/{customerId}";
			Map<String, String> map=new HashMap<String, String>();
			map.put("customerId","31");
			RestTemplate template=new RestTemplate();
			template.postForEntity(urldelete, map, null, map);
			
			
		}
	}
	

