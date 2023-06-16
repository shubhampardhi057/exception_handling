package com.prowings.nested_trycatch;

public class NestedTryDemo1 {
	
	public static void main(String[] args) {
		
		
		try
		{
			int [] num = {10,20,30,40,50};
			System.out.println(num[4]);
			
			try
			{
				int x = num[4]/0;
			}
			catch (ArithmeticException e) 
			{
				System.out.println("ArithmeticException division by zero is not possible");
			}
			catch (ArrayIndexOutOfBoundsException e1)
			{
	            System.out.println("ArrayIndexOutOfBoundsException occurred!");
	            System.out.println("Invalid Index!!");
	        }

			finally 
			{
				System.out.println("inner finally");
			}
		}
		catch (ArrayIndexOutOfBoundsException e1)
		{
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println("Invalid Index!!");
        }
		finally
		{
			System.out.println("outer finally");
		}
	}

}
