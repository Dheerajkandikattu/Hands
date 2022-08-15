package com.org.auto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.AnnotationDemo.AppConfig;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext con =new AnnotationConfigApplicationContext(AppConfig.class);
		Writer writer = con.getBean("FictionWriter",Writer.class);
		writer.write();
		writer.getaward();
		con.close();
		 
		
	}

}
