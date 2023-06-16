package com.prowings.multi_catch;

public class MultiCatchDemo {
	
	public static void main(String[] args) {
		
		int [] num = {10,20,30};
		
		int res = 0;
		
		try
		{
			res = num[4]/0;
			System.out.println(res);
			
		}
		catch (ArithmeticException  | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception occurred!!");
			System.out.println(e.getMessage());
		
		}
	}

}
