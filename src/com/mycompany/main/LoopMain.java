package com.mycompany.main;

public class LoopMain {
	static int balls;
	static String[] nameArray= {"shrikant","vijendra","shweta"};
	//nameArray[0]= "shrikant"
	//nameArray[1]= "vijendra"
	//nameArray[2]= "shweta"
					
	static String user="vijendra";
	
	public static void main(String[] args) {
		int currentBalls=0;	
		for (int i = 0; i < 6; i++) {
			balls=balls+1;
			currentBalls=balls;
			
			
			System.out.println("currentBalls ="+currentBalls+" balls : "+balls);
			
			
		}
		
		//method();
	}

	private static void method() {
		System.out.println("I am in method !!!");
		method2();
	}

private static void method2() {
		
		System.out.println("I am in method2");
	}
}



