package com.org.auto;

import org.springframework.stereotype.Component;

@Component
public class PulitzerAward implements Award {

	@Override
	public void award() {
		// TODO Auto-generated method stub
		System.out.println("It is pulitzer award");
		
	}

}
