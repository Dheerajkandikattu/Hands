package com.org.AnnotationDemo;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee {

	@Override
	public void dowork() {
		// TODO Auto-generated method stub
		System.out.println("Manage the branch office and other employees too");

	}

	@Override
	public void getsalary() {
		// TODO Auto-generated method stub
		System.out.println("Office paid to manager 70000");

	}

}
