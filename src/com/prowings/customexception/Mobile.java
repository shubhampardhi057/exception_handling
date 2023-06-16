package com.prowings.customexception;

public class Mobile {
	
	long mobileNumber;

	public Mobile() {
		super();
	}

	public Mobile(long mobileNumber) {
		super();
		this.mobileNumber = mobileNumber;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Mobile [mobileNumber=" + mobileNumber + "]";
	}
	
	
	
	

}
