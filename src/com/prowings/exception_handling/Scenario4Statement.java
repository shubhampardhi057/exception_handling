package com.prowings.exception_handling;

public class Scenario4Statement {
	
	public static void main(String[] args) {
		
		try 
		{
			int res = 0;
	        int [] num = {10,20,30};
	         res = num[3];
	         
	         System.out.println(res);
	         
	       
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		try
		{
			int res1 =0;
			int [] num1 = {10,20,30};
			res1 = num1[2]/0;
			
			System.out.println(res1);
		}
		catch (ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		
		try
		{
			//String s = null;
	      //  s.charAt(0);
	        
	        
		}
		catch (NullPointerException e)
		{
			System.out.println("NullPointerException");
		}
		
		
		try
		{
			 String s1 = "hello";
		        s1.charAt(6);
		        
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException");
		}
	}

}
