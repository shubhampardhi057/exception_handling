package com.prowings.exception_delegation;

public class ThrowsDemo1 {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		m1();
		
		System.out.println("main ended");
	}

	private static void m1() {
		
		System.out.println("m1 started");
		
		m2();
		
		System.out.println("m1 ended");
		
	}
	
	private static void m2() {
		
		System.out.println("m2 started");
		
		m3();
		
		System.out.println("m2 ended");
		
	}
	
	private static void m3() {
		
		System.out.println("m3 started");
		
		m4();
		
		System.out.println("m3 ended");
		
	}
	
	private static void m4() throws ArithmeticException {
		
		System.out.println("m4 started");
		

		int res = 20/0;
		
		
		System.out.println("m4 ended");
		
	}
	
	

}
