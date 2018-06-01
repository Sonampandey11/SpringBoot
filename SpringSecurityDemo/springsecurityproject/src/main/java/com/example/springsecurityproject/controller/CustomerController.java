package com.example.springsecurityproject.controller;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/security")
public class CustomerController {


	@GetMapping
	public String secured(@AuthenticationPrincipal final UserDetails userDetails)
	{
		String username=userDetails.getUsername();
		System.out.println("hiiiu"+username);
		String password=userDetails.getPassword();
		Collection<? extends GrantedAuthority> authorities=userDetails.getAuthorities();
		authorities.forEach(System.out::println);
		return "secured page";
	}

}
