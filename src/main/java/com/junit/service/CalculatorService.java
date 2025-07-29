package com.junit.service;

public class CalculatorService {
	
	public static int addition(int a,int b) {
		return a+b;
	}
	
	public static int product(int a, int b) {
		return a*b;
	}
	
	public static double division(int a,int b) {
		return a/b;
	}
	
	public static int sumAnyNumber(int ...numbers) {
		int sum = 0;
		for(int n:numbers) {
			sum += n;
		}
		return sum;
	}
}
