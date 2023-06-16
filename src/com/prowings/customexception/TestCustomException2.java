package com.prowings.customexception;

public class TestCustomException2 {
	
	public static void main(String[] args) {
		
		Mobile mobile = new Mobile(9876543210l);
		
		String res = "";
		try
		{
			res = isValidMobileNumber(mobile)?"ValidMobileNumber":"InValidMobileNumber";
		}
		catch(InvalidMobileNumberException e)
		{
			System.out.println(e.getMessage());
			
			System.out.println(e.getCause());
			
			e.getStackTrace();
		}
	
		System.out.println(res);
		
		
	}

	private static boolean isValidMobileNumber(Mobile mobile) throws InvalidMobileNumberException {
		
        if( mobile.mobileNumber == 9876543210l)
        {
        	return true;
        }
        else
        {
        	throw new InvalidMobileNumberException("Mobile number is not Valid!!!");
        }
	}

}
