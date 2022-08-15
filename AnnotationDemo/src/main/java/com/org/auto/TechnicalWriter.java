package com.org.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TechnicalWriter implements Writer {
	@Autowired
	@Qualifier("nationalAward")
	Award award;

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("I am a technical writer");
		
	}

	@Override
	public void getaward() {
		// TODO Auto-generated method stub
		award.award();
		
	}

}
