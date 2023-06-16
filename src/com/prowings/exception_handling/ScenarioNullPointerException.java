package com.prowings.exception_handling;

public class ScenarioNullPointerException {
	
	public static void m1() {
		
		System.out.println("Inside m1()");
	}
	
	public static void main(String[] args) {
		
		ScenarioNullPointerException a = null;
		
		a.m1();
		
	}

}
