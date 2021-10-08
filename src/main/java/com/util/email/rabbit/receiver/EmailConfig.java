package com.util.email.rabbit.receiver;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@Component("sms")
public class EmailConfig {

	
  
    @Bean
    public EmailReceiver receive() {
	return new EmailReceiver();
    }
    
   
	}