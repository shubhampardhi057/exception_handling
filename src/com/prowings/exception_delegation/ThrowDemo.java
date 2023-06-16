package com.prowings.exception_delegation;

public class ThrowDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main Started");
		
		m1();
		
		System.out.println("main Ended");
	}

	private static void m1() {
		
	System.out.println("m1 started");
	
	try {
		
		System.out.println("try started");
	
	      int res = 20/0;
	}
	catch (ArithmeticException e) {
		
		System.out.println("ArithmeticException occurred  but converting it to NPE!!");
		
		throw new NullPointerException();
		
	}
	
	
	System.out.println("m1 ended");
	}

}
