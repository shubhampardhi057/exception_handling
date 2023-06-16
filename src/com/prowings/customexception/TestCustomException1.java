package com.prowings.customexception;

public class TestCustomException1 {

	public static void main(String[] args) {
		
		ATM atm = new ATM(2839,"Ram","Saving Account");
		
		String res = "";
		try
		{
		res = isValidPin(atm)?"Valid":"InValid";
		}
		catch(InvalidPinException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());

			System.out.println(e.getStackTrace());
		}
		
		
		System.out.println(res);
	}

	private static boolean isValidPin(ATM atm) throws InvalidPinException {
		
		int pin=atm.getPin();
		
		if( pin == 1000 )
		{
		return true;
		}
		else
		{
			throw new InvalidPinException("pin is not Matching!!!");
		}
			
	}
}
