package com.org.tav.JunitDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestDemo {
	

	@RepeatedTest(3)
	void test_add()
	{
		System.out.println("test_add()");
		assertEquals(5, 3+2);
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
