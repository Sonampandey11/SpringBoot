package com.example.springsecurityproject.config;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@ Override
	protected void configure(HttpSecurity httpSecurity) throws Exception
	{
		httpSecurity.authorizeRequests()
		.antMatchers("/hello/security").hasRole("USER")
		.anyRequest()//.permitAll()
		.fullyAuthenticated()
		.and()
		//.addFilterBefore(CustomerFilter(), BasicAuthenticationFilter.class)
		.httpBasic();

		httpSecurity.csrf().disable();
	}
	
	/*@Bean
	public CustomerFilter CustomerFilter() {

		return CustomerFilter();
	}*/
	@Override
	protected void configure(AuthenticationManagerBuilder builder) throws Exception
	{
		builder.inMemoryAuthentication()
		.withUser("sonam").password("sonam").roles("USER").and()
		.withUser("pooja").password("jain").roles("ADMIN");
	}

}
