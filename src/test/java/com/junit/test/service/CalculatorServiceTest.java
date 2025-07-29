package com.junit.test.service;

import org.junit.Test;

import com.junit.service.CalculatorService;

import junit.framework.Assert;

public class CalculatorServiceTest {

	//We can also add underscore before test in method name, it is good practice
	@Test
	public void additionTest() {
		int result = CalculatorService.addition(10, 20);
		int expected = 30;
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void sumAnyNumberTest() {
		double result = CalculatorService.sumAnyNumber(1,2,3,4,5,6,7,8,9,10);
		double expected = 55;
		Assert.assertEquals(expected, result);
	}
}
