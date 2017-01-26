package com.anjali.training.bean;

public class Employee {
	private String empName;
	private Address address;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public void showDetails(){
		System.out.println("Name: "+empName);
		System.out.println("Address: "+address.getCity());
	}
	
}
