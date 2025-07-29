package com.junit.test.service;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.service.CalculatorService;

public class CalculatorServiceTestJunit5 {

	@BeforeAll
	public static void init(){
		//execute the logic before the test cases
		System.out.println("One time logic that runs before each test case!");
	}
	
	@BeforeEach
	public void beforeEachCase(){
		System.out.println("Before each test case");
	}

	//Timeout is not supported in JUnit 5
	@Test
	@DisplayName("Custom Test case")
	public void additionTest() {
		System.out.println("This is first test case");
		int actualResult = CalculatorService.addition(10, 20);
		int expectedResult = 30;
		//also pass failure message
		Assertions.assertEquals(expectedResult, actualResult, "Test failed !!!");
	}
	
	@Test
	@Disabled
	public void sumAnyNumber() {
		System.out.println("This is second test case");
		int actualResult = CalculatorService.sumAnyNumber(1,2,3,4,5,6,7,8,9,10);
		int expectedResult = 55;
		Assertions.assertEquals(expectedResult,actualResult);
	}
	
	@AfterEach
	public void afterEachCase(){
		System.out.println("After each test case");
	}
	
	@AfterAll
	public static void cleanUp(){
		System.out.println("Run after test cases, cleanup method is called");
	}
}
