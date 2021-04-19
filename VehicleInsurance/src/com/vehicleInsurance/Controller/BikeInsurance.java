package com.vehicleInsurance.Controller;

import java.util.Scanner;

import com.vehicleInsurance.businessLogic.CustValidation;
import com.vehicleInsurance.businessLogic.InsurancePolicy;
import com.vehicleInsurance.businessLogic.SalaryValidaton;
import com.vehicleInsurance.model.Customer;



public class BikeInsurance {
	 String regNum;
	 long aaNum;
	public void bikeInsurance(Customer c2) {
		
		Scanner sc = new Scanner(System.in);
		int d;
		Customer c = new Customer();
		 CustValidation cn = new CustValidation();

		System.out.println("Enter Aadhar number");
		aaNum = sc.nextLong();
		sc.nextLine();
		boolean v = cn.validateAadhar(aaNum);
		 if(v) {
			 System.out.println("Enter Vehicle RC");
				regNum = sc.nextLine();
				c.setAaNum(aaNum);
				c.setRegNum(regNum);
		 }
//				else {
//			 System.out.println("wrong aadhar");
//		 }
		//sc.nextLine();
		
		
		 
		 
		 if(cn.validateAadhar(aaNum)) {
			 System.out.println("Please select the bike membership: ");
			 System.out.println("1. Premium membership");
			 System.out.println("2. Regular membership");
			 
			 
			 
			 d=sc.nextInt();
			 System.out.println("Enter the amount of vehicle: ");
			 long amount = sc.nextLong();
			 InsurancePolicy s = new InsurancePolicy();
			 if(d==1) {
				 System.out.println("Monthly EMI for your Premium Insurance: ");
				double monthlyPre= s.premiumInsurance(amount);
				System.out.println(monthlyPre);
				
//				 if(s.premiumInsurance(amount)) {
//					 
//				 }
//				 
				 
//				 System.out.println("Thankyou "+c2.getCustName()+" for choosing XYZ Premium Insurance ");
//				 System.out.println("Your acknowledgment receipt has been sen to your registered mobile number: "+c2.getMobNum());
//				 }
//				 else {
//					 System.out.println("You are not eligible for the Premium Insurance policy.");
//					 System.out.println("Thankyou :)");
//				 }
			 }
			 else if(d==2) {
				 System.out.println("Monthly EMI for your Regular Insurance: ");
				double monthlyReg = s.regularInsurance(amount);
				System.out.println(monthlyReg);
				System.out.println("The membership is for one year");
//				 if(s2.salaryValidationReg()) {
//					 System.out.println("Thankyou "+c2.getCustName()+" for choosing XYZ Regular Insurance ");
//					 System.out.println("Your acknowledgment receipt has been sen to your registered mobile number: "+c2.getMobNum());
//					 
//					 
//					 
//				 }
//				 else {
//					 System.out.println("You are not eligible for the Regular Insurance policy");
//					 System.out.println("Thankyou :)");
//				 }
//				 
			 }
			 else {
				 System.out.println("Enter the correct Insurance choice :)");
				 bikeInsurance(c);
			 }
			 
			 
		 }
		 else {
			 System.out.println("Enter the correct Aadhar Number");
			 bikeInsurance(c);
			 
		 }
		
	}
	

}
