package com.ofss;

public class TestCustomer {

	public static void main(String[] args) {
		Address a1= new Address(1234, "Whitefield", "Bangalore", 560068);
		
		Customer c1 = new Customer("Mamatha",a1);
		System.out.println(c1.toString());
	}
	
}
