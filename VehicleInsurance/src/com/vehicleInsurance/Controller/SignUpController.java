package com.vehicleInsurance.Controller;

import java.util.Scanner;

import com.vehicleInsurance.exceptions.PincodeExc;
import com.vehicleInsurance.model.Customer;

public class SignUpController {
	
	public void signUpDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name = sc.nextLine();
		System.out.println("Enter PhoneNumber:");
		long num = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter your city: ");
		String city = sc.nextLine();
//		System.out.println("Enter your pincode: ");
//		int pincode = sc.nextInt();
		PincodeExc pe = new PincodeExc();
		int pincode = pe.pincodeExc();
		if(pincode  != (int)pincode) {
			System.out.println("Enter your pincode: ");
			 pincode = sc.nextInt();
		}
		System.out.println("Enter your Salary: ");
		double salary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter your UserId: ");
		String userId = sc.nextLine();
		System.out.println("Enter your Password:");
		String password = sc.nextLine();
		Customer csuc = new Customer();
		csuc.setCustName(name);
		csuc.setMobNum(num);
		csuc.setCity(city);
//		csuc.setPincode(pincode);
		csuc.setEmail(userId);
		csuc.setPassword(password);
		System.out.println("");
		InsuranceController ic = new InsuranceController();
		ic.insuranceController();
		
	} 

}
