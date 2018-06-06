package com.example.springsecurityproject.entity;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Commit;
@Component
public class CustomerFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init service call");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter service call");
		HttpServletRequest request2=(HttpServletRequest) request;
		Principal userPrincipal=request2.getUserPrincipal();
		System.out.println("value"+userPrincipal);
		chain.doFilter(request, response);
		
		
	}

	@Override
	public void destroy() {
		System.out.println("destroy service call");
		
	}
}
