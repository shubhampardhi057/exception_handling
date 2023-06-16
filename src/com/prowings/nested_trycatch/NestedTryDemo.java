package com.prowings.nested_trycatch;

public class NestedTryDemo {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		int res = 0;
		
		try
		{
			System.out.println("outer try started");
			res = a / b;
			
			try
			{
				System.out.println("inner try started");
			}
			catch (ArithmeticException e)
			{
				System.out.println("Arithmatic Exception caught in inner catch!");
			}
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Arithmatic Exception caught in outer catch!");
		}
			
			
		
	}

}
