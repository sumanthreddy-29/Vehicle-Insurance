package com.vehicleInsurance.Controller;

import java.util.Scanner;

import com.vehicleInsurance.businessLogic.CustValidation;
import com.vehicleInsurance.businessLogic.InsurancePolicy;
import com.vehicleInsurance.businessLogic.SalaryValidaton;
import com.vehicleInsurance.model.Customer;

public class CarInsurance {
	private String regNum;
	 private long aaNum;
//	public String getRegNum() {
//		return regNum;
//	}
//	public void setRegNum(String regNum) {
//		this.regNum = regNum;
//	}
//	
//	public void setAaNum(long aaNum) {
//		this.aaNum = aaNum;
//	}
//	public long getAaNum() {
//		// TODO Auto-generated method stub
//		return aaNum;
//	}

	public void carInsurance(Customer c2) {
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
//			
	

		/*Scanner sc = new Scanner(System.in);
		int d;
		
		
		 
		 
		 CustValidation cn = new CustValidation();
		 //Customer c = new Customer();
		 Customer c = new Customer();
		 System.out.println("Enter Aadhar number");
			aaNum = sc.nextLong();
			sc.nextLine();
			System.out.println("Enter Vehicle RC");
			regNum = sc.nextLine();
			c.setAaNum(aaNum);
			c.setRegNum(regNum);*/
		 if(cn.validateAadhar(aaNum)) {
			 System.out.println("Please select the car membership: ");
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
			 }
			 else if(d==2) {
				 System.out.println("Monthly EMI for your Regular Insurance: ");
				double monthlyReg = s.regularInsurance(amount);
				System.out.println(monthlyReg);
				
			 }else {
				 System.out.println("Enter the correct Insurance choice :)");
				 carInsurance(c); 
			 }
			 
			 
		 }else {
			 System.out.println("Enter the correct Aadhar Number");
			 carInsurance(c); 
		 }
//			 
//			 
//			 if(d==1) {
//				 SalaryValidaton s = new SalaryValidaton();
//				 if(s.salaryValidationPre()) {
//				 
//				 
//				 System.out.println("Thankyou "+c2.getCustName()+" for choosing XYZ Premium Insurance ");
//				 System.out.println("Your acknowledgment receipt has been sen to your registered mobile number: "+c2.getMobNum());
//				 }
//				 else {
//					 System.out.println("You are not eligible for the Premium Insurance policy.");
//					 System.out.println("Thankyou :)");
//				 }
//			 }
//			 else if(d==2) {
//				 SalaryValidaton s2 = new SalaryValidaton();
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
//			 }
//			 else {
//				 System.out.println("Enter the correct Insurance choice :)");
//			 }
//			 
//			 
//		 }
//		 else {
//			 System.out.println("Enter the correct Aadhar Number");
//		 }*/
		
		 
	}
		
	

}
