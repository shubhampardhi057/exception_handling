package com.prowings.exception_delegation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowDemo1 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		System.out.println("main started");
		
		m1();
		
		System.out.println("main ended");
	}

	private static void m1() throws FileNotFoundException,IOException {
		
		System.out.println("m1 started");
		
		try
		{
			FileReader fr = new FileReader("a2.txt");
			fr.read();

		}
		catch (FileNotFoundException e)
		{
			System.out.println("FileNotFoundException occured");
			
			throw new FileNotFoundException();
		}
		
		
	}

}
