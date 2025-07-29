package com.junit.test.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.junit.service.CalculatorService;

import junit.framework.Assert;

public class CalculatorServiceTest {
	
	int count = 0;
	
	@BeforeClass
	public static void init() {
		//This method is compulsary static method
		System.out.println("Initialized method called...");
		System.out.println("BeforeClass method called...");
		//used to open a file connection or open a DB connection
	}
	
	@Before
	public void beforeEachTestCase() {
		//suppose we want to reset counter for each test case
		System.out.println("This method before each test case");
		count = 0;
	}

	//We can also add underscore before test in method name, it is good practice
	@Test(timeout = 2000)
	public void additionTest() throws InterruptedException {
		//Thread.sleep(3000); //It will not pass test case because it sleeps 3 sec and timeout for this 2 ec
		for(int i=1;i<=20;i++) {
			count += i;
		}
		System.out.println("Addition of two number is called");
		int result = CalculatorService.addition(10, 20);
		int expected = 30;
		System.out.println("Count in additionTest method: "+count);
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void sumAnyNumberTest() {
		for(int i=1;i<=100;i++) {
			count += i;
		}
		System.out.println("Addition of different number is called");
		double result = CalculatorService.sumAnyNumber(1,2,3,4,5,6,7,8,9,10);
		double expected = 55;
		System.out.println("Count in sumAnyNumberTest method: "+count);
		Assert.assertEquals(expected, result);
	}
	
	@After
	public void afterEachTestCase() {
		System.out.println("This method after each test case");
	}
	
	@AfterClass
	public static void cleanUp() {
		//Static method	
		//Close a connection or DB Connection
		System.out.println("After all test cases...");
		System.out.println("Destroy method is called...");
	}
}
