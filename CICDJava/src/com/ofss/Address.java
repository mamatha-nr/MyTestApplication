package com.ofss;

public class Address {
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(int flatNo, String streetName, String city, long pincode) {
		super();
		this.flatNo = flatNo;
		this.streetName = streetName;
		this.city = city;
		this.pincode = pincode;
	}
	private long pincode;
	private int flatNo;
	private String streetName;
	@Override
	public String toString() {
		return "Hi How are you";
		//return "Address [pincode=" + pincode + ", flatNo=" + flatNo + ", streetName=" + streetName + ", city=" + city
			//	+ "]";
	}
	private String city;
}
