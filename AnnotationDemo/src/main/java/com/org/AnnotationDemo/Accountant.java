package com.org.AnnotationDemo;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements Employee {

	@Override
	public void dowork() {
		// TODO Auto-generated method stub
		System.out.println("Do all the accounting work");

	}

	@Override
	public void getsalary() {
		// TODO Auto-generated method stub
		System.out.println("Office paid to accountant 50000");

	}

}
