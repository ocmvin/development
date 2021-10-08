package com.mycompany.main;

import java.util.Scanner;

public class TypicalJavaClass {

	
	static int a =20;
	static int b=30;
	
	static String variable_1 ="20 ";
	static String variable_2="30 ";
	
	static 	int variableIntValue;
	
	static boolean variableBooleanValue;
	
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("My Input "+input.nextInt());
		Apple apple=new Apple();
		
		Guava guava=new Guava();
		
		
		
		Object object=guava;
		
		
		System.out.println("Is Object contains instance of Apple ? " +(object instanceof Apple));
		System.out.println("Is Object contains instance of Guava ? "+(object instanceof Guava));
		
		
		if(true)
			return;

		System.out.println("===============================================");
		

		System.out.println("variableIntValue "+( --variableIntValue));//variableIntValue-1
		
		
		System.out.println("===============================================");
		// I can write any Business 
		
	

		customPrintln(a+b);//Int output
		
		
		

		customPrintln(variable_1+variable_2);//String output
		customPrintln(variable_2+variable_1);
		
		
		customPrintln(a+variable_1);
		
		
		//YOU NEED TO WRITE AT LEAST 100 PROGRAMS IN ORDER TO UNDERSTAND OPERATORS AND THEIR BEHAVIOUR
		
		//Operator Precedence
		
		customPrintln(100+(2*1));
		customPrintln(10+2*12);
		customPrintln(10+2*12);
		
	}
	
	
	static void customPrintln(String input){
		
		System.out.println("String flavour "+input);
		
	}
	
	
	static void customPrintln(int input){
		
		System.out.println("Int flavour "+input);
		
	}
	
	
	

}
