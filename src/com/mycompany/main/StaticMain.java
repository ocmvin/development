package com.mycompany.main;

public class StaticMain {

	static int counter=1;
	
	static int instanceCounter=1;
	
	
	public static void main(String[] args) {
		
		StaticMain staticObject1=new StaticMain();
		staticObject1.instanceCounter=100;
		
		
		System.out.println("counter "+(++counter)); // counter=counter+1
		
		System.out.println("Object1 "+staticObject1.instanceCounter); // 100
		
		StaticMain staticObject2=new StaticMain();
		staticObject2.instanceCounter=500;
		System.out.println("Object2 "+staticObject2.instanceCounter); // V 101 S 100 Shw 100  ==> 1
		counter=1234;
		
		StaticMain staticObject3=new StaticMain();
		
		System.out.println("Object3 "+staticObject3.instanceCounter);
		
		System.out.println("counter "+counter);  /// ??? V 2 Shweta 1235 Shrikant 1
		

	}

}

/**
 * 
 * 
 * 
counter 2
Object1 100
Object2 1
Object3 1
counter 1234
 */
 
