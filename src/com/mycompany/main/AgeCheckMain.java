package com.mycompany.main;

import java.util.Scanner;

public class AgeCheckMain {

	public static void main(String[] args) {

		
		System.out.println("Enter your age");
		
		Scanner input=new Scanner(System.in);
		int  usersAge= input.nextInt();
		
		while(true) {
			
			boolean isMajor=usersAge>18 ?  true:false;
			
			if(isMajor)
				System.out.println("You are Major");
			else 
				System.out.println("You are Minor!");
		
		}

	}

}
