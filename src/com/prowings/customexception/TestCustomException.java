package com.prowings.customexception;

public class TestCustomException {
	
	public static void main(String[] args) {
		
		Citizen citizen = new Citizen(1234,"Ram","India",17);
		
		String res = "";
		try
		{
	     res = isValidVoter(citizen)?"Valid Voter":"InValid Voter";
		}
		catch (InvalidAgeException e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			
			e.printStackTrace();
		}
		
		System.out.println(res);
		
	}
	
	public static boolean isValidVoter(Citizen citizen) throws InvalidAgeException {
		
	
		 if(citizen.age >= 18)
		 {
			 return true;
		 }
		 else
		 {
			 throw new InvalidAgeException("Age is below 18!!!");
		 }
		
		
		
	}
	
	
	

}
