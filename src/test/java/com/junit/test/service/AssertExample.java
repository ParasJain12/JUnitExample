package com.junit.test.service;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertExample {

	//Assertion: is process of validating that actual output is same as expected output
	@Test
	public void test1() {
		System.out.println("Testing some assertion methods");
		int actual = 10;
		int expected = 10;
		Assertions.assertEquals(expected, actual);
		
		//we can do it for any type, any primitive or non primitive, or array
		//assertSame method check the object references of expected and actual variable
		/*String actualName = new String("Paras");
		String expectedName = new String("Paras");
		Assertions.assertSame(expectedName, actualName);*/
		// Output: It will fail because both objects are different
		
		String actualName = new String("Paras");
		String expectedName = new String("Paras");
		Assertions.assertEquals(expectedName,actualName);
		
		//for string literals, assertSame pass the test.
		//Assertions.assertNull(actualName);
		//Assertions.assertNotNull(actualName);
		
		boolean value = true;
		//Assertions.assertTrue(value);
		//Assertions.assertFalse(value);
		
		//To match a collection, iterable assertion is available
		//when order get changed, it does not pass test case
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList(1,2,3,4,5);
		Assertions.assertIterableEquals(list2, list1);
		
		//For expection throw
		//Exceutable is a functional interface that contains method execute() that throws Throwable
		//Assertions.assertThrows(RuntimeException.class, Executable);
		Assertions.assertThrows(RuntimeException.class, ()->{
			//throw new RuntimeException("This is testing exception"); //Pass
			//System.out.println("assertThrow"); //fail
		});
		
	}
}
