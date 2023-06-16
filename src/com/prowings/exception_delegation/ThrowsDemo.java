package com.prowings.exception_delegation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {
	
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		
		System.out.println("main started");
		
		m1();
		
		
		System.out.println("main ended");
	}

	private static void m1() throws FileNotFoundException, IOException {
		
        System.out.println("m1 started");
		
		m2();
		
		System.out.println("m1 ended");
	
	}
	private static void m2() throws FileNotFoundException, IOException {
		
		System.out.println("m2 started");
		
		m3();
		
		System.out.println("m2 ended");
		
	}

	private static void m3() throws FileNotFoundException, IOException {
		
		System.out.println("m3 started");
		
		m4();
		
		System.out.println("m3 ended");
		
	}
	
	private static void m4() throws IOException, FileNotFoundException  {
		
		System.out.println("m4 started");
		
		FileReader fr = new FileReader("a2.txt");
		fr.read();

		
		System.out.println("m4 ended");
		
	}
}
