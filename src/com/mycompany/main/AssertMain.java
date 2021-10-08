package com.mycompany.main;

public class AssertMain {

	//1= Active
	//0=In Active
	static boolean encryptionLogic ;
	public static void main(String[] args) {

		String creditCardNumber="844544566600"; //84454456XXXX;
		//Some Logic is implemented which read Your  credit card Number from Database table
		//Apply encryption to your Credit Card Nuber
		 creditCardNumber=envryPtionLOgic(creditCardNumber) ;
		  assert encryptionLogic;  
		
		  System.out.println("Your Credit Card Number"+creditCardNumber);  
	}
	
	
	static String envryPtionLOgic(String creditCardNumner) {
		encryptionLogic =false;
		String last4Digits=creditCardNumner.substring(9);
		  System.out.println("last4Digits "+last4Digits);
		  
		  return creditCardNumner.replace(last4Digits, "XXXX");
		  
		
	}

}
