package com.example.demo.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class ClientCall {
	public static void main(String[] args) {
		try
		{
		URL url = new URL("http://localhost:8080/customerdetail/main/view/33");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		//conn.setRequestProperty("Accept", null);

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));

		String output;
		System.out.println("Your output is .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();

	  } 
	   catch (IOException e) {

		e.printStackTrace();

		
	}
	}


}
