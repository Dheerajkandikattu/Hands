package com.org.autodemo2;

import org.springframework.stereotype.Component;

@Component

public class SMSService implements MessageService {

	@Override
	public void sendmessage(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
		System.out.println("Sending message via sms");
		
	}

}
