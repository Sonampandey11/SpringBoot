package com.example.demo.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClientCallPost {
public static void main(String[] args) {
	 try {

			URL url = new URL("http://localhost:8080/customerdetail/main/customerdetail");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

		  
			System.out.println("hi");
		    String input="{\"customerId\":92,\"customerName\":\"Ritika\",\"customerAddress\":\"Navi mumbai\",\"paymentMode\":\"card\",\"retailerId\":21}";

			OutputStream os = conn.getOutputStream();
			os.write(input.getBytes());
			os.flush();

			if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
				throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();

		
		  } catch (IOException e) {

			e.printStackTrace();

		 }

		}
}

