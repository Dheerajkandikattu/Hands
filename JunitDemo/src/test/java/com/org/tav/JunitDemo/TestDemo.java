package com.org.tav.JunitDemo;

import static org.junit.Assume.assumeFalse;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestDemo {
	private  DemoTestClass demotest;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		DemoTestClass demotest = new DemoTestClass();
		System.out.println("Test data setup is done");
	}
	@BeforeEach
	void beforeach()
	{
		System.out.println("Before each excecuted...");
	}
	@Test
	@DisplayName("Adding positive num")
	public void test_add_positive() {
		System.setProperty("EVE", "DEV");
		assumeTrue("DEV".equals(System.getProperty("EVE")));
		int actual=demotest.add(20, 10);
		assertEquals(30,actual);
	}
	@Test
	@DisplayName("Adding negative num")
	public void test_add_negative() {
		System.setProperty("DEV","PROD");
		assumeTrue("DEV".equals(System.getProperty("346")));
		int actual1= demotest.add(-10, -30);
		assertEquals(-40,actual1);
	}

	
//	Assumption class - collection of utility methods that support conditional test execution based on assumptions
//	 * jupiter assumptions are static methods in the org.junit.jupitor.api.Assumptions
//	 *
//	 *  Assumptions.assumeTrue() - if condition is true then run the test else aborting test
//	 *  Assumptions.false()-if condition is false then run the test else abort
//	 *  Assumptions.assumingThat() - flaxible , if condition is true then execute , else do not abort the test continue
//	 *  rest of the code in test
//	 *
//	 *

}
