package com.prowings.exception_handling;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		 int res = 0;
		
		 try 
		 {
		 res = 10/0;
		 }
		 catch (ArithmeticException e)
		 {
			System.out.println("ArithmeticException occured,please enter another number!!!!"); 
			 
		 }
		 
		 System.out.println(res);
		 
		 
		 System.out.println("main method ended");
		 
		 
		 
		 
		
		
		
		
		
	}

}
