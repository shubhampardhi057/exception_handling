package com.prowings.exception_handling;

public class FinallyReturnDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		int res = m1();
		
		System.out.println(res);
		
		System.out.println("main method ended");
	}
	
	public static int m1() {
		
		System.out.println("m1 started");
		try
		{
			System.out.println("try 1");
			
			int res =10/0;
			
			System.out.println(res);
			
			System.out.println("try 2");
			System.out.println("try 3");
			
			return 10;
		}
		catch (Exception e) 
		{
			System.out.println("inside catch");
			return 20;
		}
		finally
		{
			System.out.println("inside finally");
//			return 30;
		}
	}

}
