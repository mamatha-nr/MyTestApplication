package com.ofss;

public class Customer {
	String customerName;
	Address address;
	
	
	
	
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", address=" + address + "]";
	}
	public Customer(String customerName, Address address) {
		super();
		this.customerName = customerName;
		this.address = address;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
