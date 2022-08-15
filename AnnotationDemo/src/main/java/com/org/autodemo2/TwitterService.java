package com.org.autodemo2;

public class TwitterService implements MessageService {

	@Override
	public void sendmessage(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
		System.out.println("Sending message via twitter");
		
	}

}
