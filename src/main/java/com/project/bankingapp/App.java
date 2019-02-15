package com.project.bankingapp;

import java.util.Scanner;

import com.project.models.User;

public class App {

	public static void main(String[] args) {
		
		
		User testAccount = new User();
		testAccount.withdrawal(100.00);
		testAccount.deposit(50.00);
		testAccount.withdrawal(51.00);
		testAccount.deposit(100.00);
		testAccount.withdrawal(100.00);
		
		//startMenu();

	}

	public static void startMenu() {
		//System.out.println("*****************************************");
		//System.out.println("*                                       *");
		System.out.println("*           Welcome to JDBCBank         *");
		System.out.println("* 1. Login *");
		System.out.println("* 2. Register *");
	}
	
	public static void loginMenu() {
		//Login
		System.out.println("* Username              : ");
		System.out.println("* Password              : ");
	}
	
	public static void registerMenu(){
		//Register
		System.out.println("* Username              : ");
		System.out.println("* Password              : ");
		System.out.println("* First Name            : ");
		System.out.println("* Last Name             : ");
		System.out.println("* Email Address         : ");
		System.out.println("* Phone Number          : ");
	}
	
	public static void adminMenu() {
		//Admin
		System.out.println("* Create new user       : ");
		System.out.println("* View user account     : ");
		System.out.println("* Update user account   : ");
		System.out.println("* Delete user account   : ");
	}
	public static void userMenu() {
		//User
		System.out.println("* 1. Check Account "); 
		//display all accounts and balances
		System.out.println("* 2. Create an Account ");
		//what type of account
		//checking or saving
		System.out.println("* 3. Delete an Account ");
		//can only be done when account is 0
		System.out.println("* 4. Deposit or Withdrawal from an Account ");
		System.out.println("* 5. Logout ");
	}

}
