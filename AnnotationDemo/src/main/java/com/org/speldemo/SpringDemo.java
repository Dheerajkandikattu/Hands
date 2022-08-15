package com.org.speldemo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(com.org.speldemo.AppConfig.class);
//		String conffile="Beans.xml";
//		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext(conffile);
		PaymentGateway gateway = (PaymentGateway) context.getBean("paymentGateway",PaymentGateway.class);
		gateway.processorder();

	}

}
