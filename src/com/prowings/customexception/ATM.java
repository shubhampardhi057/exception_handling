package com.prowings.customexception;

public class ATM {
	
	int pin;
	String name;
	String accountType;
	
	public ATM() {
		super();
	}

	public ATM(int pin, String name, String accountType) {
		super();
		this.pin = pin;
		this.name = name;
		this.accountType = accountType;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "ATM [pin=" + pin + ", name=" + name + ", accountType=" + accountType + "]";
	}
	
	
	
	
	

}
