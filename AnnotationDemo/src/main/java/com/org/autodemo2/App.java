package com.org.autodemo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.AnnotationDemo.AppConfig;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext con =new AnnotationConfigApplicationContext(com.org.autodemo2.AppConfig.class);
		Mobile mb=con.getBean("mobile",Mobile.class);
		mb.processmessage("Hey how are you");
		con.close();
	}

}
