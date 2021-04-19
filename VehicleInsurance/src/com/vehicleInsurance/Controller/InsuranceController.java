package com.vehicleInsurance.Controller;

import java.util.Scanner;

import com.vehicleInsurance.model.Customer;

public class InsuranceController {
	
	public void insuranceController() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please select the option given below:");
		System.out.println("1. Bike Insurance");
		System.out.println("2. Car Insurance");
		int n = sc.nextInt();
		Customer c = new Customer();
		if(n>2 || n<1) {
			System.out.println("Enter the correct choice :)");
			insuranceController();
		}
		else {
			if(n==1) {
				BikeInsurance b = new BikeInsurance();
				b.bikeInsurance(c);
				
			}
			else {
				CarInsurance ci = new CarInsurance();
				ci.carInsurance(c);
			}
		}
		
	}

}
