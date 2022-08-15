package com.org.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FictionWriter implements Writer {

	@Autowired
	@Qualifier("bookerAward")
	private Award award;
	
	@Override
	public void write() {
		// TODO Auto-generated method stub
	System.out.println("Writes finctional novels");
		
	}

	@Override
	public void getaward() {
		// TODO Auto-generated method stub
		award.award();
		
	}

}
