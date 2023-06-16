package com.prowings.exception_handling;

public class FinallyDemo1 {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		m1();
		
		System.out.println("main method ended");
	}

	public static void m1() {
		
		System.out.println("m1 started");
		
		try
		{
			int i =10;
			System.out.println("try 1");
			
			if(i == 10)
//			if(i != 10)
			System.exit(0);
            System.out.println("try 2");
            System.out.println("try 3");
			
		}
		catch (Exception e) 
		{
			System.out.println("inside catch");
		}
		finally
		{
			System.out.println("inside finally");
		}
		
		System.out.println("m1 ended");
		
	}
	

}
