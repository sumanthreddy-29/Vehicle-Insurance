package com.vehicleInsurance.Controller;

import java.util.Scanner;

import com.vehicleInsurance.businessLogic.LoginValidation;

public class SignInController {
	public void loginDetails() {
		System.out.println("Login Credintials");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserID:");
		String userId = sc.nextLine();
		System.out.println("Enter Password:");
		String pwd = sc.nextLine();
		LoginValidation lv = new LoginValidation();
		boolean val = lv.loginValidation(userId,pwd);
		if(val) {
			System.out.println("=================Successfully completed Sign-In====================");
			InsuranceController icsi = new InsuranceController();
			icsi.insuranceController();
		
		}
		else {
			System.out.println("Please enter the correct values :)");
			loginDetails();
		}
		
	}

}
