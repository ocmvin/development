/**
 * 
 */
package com.mycompany.main;

/** 
 * 
 *  This is a Helloworld Java Program
 * @author NS
 *
 */
public class HelloWorld {

	static int[] intArr= {1,2,30,40};
	static String stringArr[]= {"vijendra","Shrikant"}; 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("######## At 2nd index ="+intArr[2]);
		
		System.out.println("Array "+intArr);
		// TODO Auto-generated method stub
		System.out.println("Hello my Friend #######");
		
		
		vijendrasMethod(15,5);
		vijendrasMethod(600,100);
		
		

	}

	private static void vijendrasMethod(int firstVariable, int secondVariable) {
		// TODO Auto-generated method stub
		
		System.out.println("The sum is = "+ (firstVariable*secondVariable));
	}

}
