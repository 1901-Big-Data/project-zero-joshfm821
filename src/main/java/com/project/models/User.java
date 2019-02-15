package com.project.models;

public class User {
	private String number;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	private String customerUserName;
	private String customerPassword;
	
	public User() {
		System.out.println("Empty constructor call");
	}
	public User(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber, String customerUserName, String customerPassword) {
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber =customerPhoneNumber;
		this.customerUserName = customerUserName;
		this.customerPassword = customerPassword;
	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made. Balance is "+ this.balance);
	}
	public void withdrawal(double withdrawalAmount) {
		if(balance - withdrawalAmount < 0) {
			System.out.println("Only " + this.balance + " is available. Withdrawal can't be processed.");
		}else {
			this.balance -= withdrawalAmount;
			System.out.println("Withdrawal of " + withdrawalAmount + " processed. Balance is "+ this.balance);
		}
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void getCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	public String getCustomerUserName() {
		return customerUserName;
	}
	
	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}
	
	public String getCustomerPassword() {
		return customerPassword;
	}
	
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	
	
}
