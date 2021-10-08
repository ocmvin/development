package com.mycompany.main;

/**
 * 
 * THis is a loop program
 * 
 */
public class LoopMain {
	static int balls;
	static String[] nameArray= {"shrikant","vijendra","shweta"};
	
					
	static String user="vijendra";
	
	public static void main(String[] args) {
		int currentBalls=0;	
		for (int i = 0; i < 6; i++) {
			balls=balls+1;
			currentBalls=balls;
		}
		
		method();
	}

	private static void method() {
		System.out.println("I am in method !!!");
		method2();
	}

private static void method2() {
		
		System.out.println("I am in method2");
	}
}



