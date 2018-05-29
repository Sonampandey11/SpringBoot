package com.example.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.zuul.service.ErrorFilter;
import com.example.zuul.service.PostFilter;
import com.example.zuul.service.PreFilter;
import com.example.zuul.service.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class EurekaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDemoApplication.class, args);
	}

	@Bean
	public PreFilter preFilter()
	{
		return new PreFilter();

	}

	@Bean
	public PostFilter postFilter()
	{
		return new PostFilter();
	}

	@Bean
	public RouteFilter routeFilter()
	{
		return new RouteFilter();
	}
	@Bean
	public ErrorFilter errorfilter()
	{
		return new ErrorFilter();

	}

}
