package com.org.autodemo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.org.autodemo2")
public class AppConfig {
	
	@Bean(name="emailservice")
	public EmailService emailservice() {
		return new EmailService();
	}
	@Bean(name="mobile")
	public Mobile mobile()
	{
		return new Mobile();
	}
	@Bean(name="messageprocessor")
	public MessageProcessor messageprocessor()
	{
		return new Mobile();
	}

}
