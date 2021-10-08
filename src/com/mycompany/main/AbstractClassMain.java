package com.mycompany.main;


//git hub Create an account in git hub
public class AbstractClassMain {

	public static void main(String[] args) {

		Shape shape=new Rectangle();
		
		System.out.println(shape.printShape());// Rect
		
		
		shape=new Triangle();
		
		System.out.println(shape.printShape()); //Traingle
		
		shape=new Circle();
		System.out.println(shape.printShape()); //Circle
		
		
	}

	
	static abstract class Shape { //Inner class 
		
		abstract String printShape() ;
	}
	
	
	
	static class Rectangle extends Shape{ //Inner class 
		
		@Override
		String printShape() {
			return "I am in Rectangle printShape";
		}
	}
	
	
	static class Triangle extends Shape {
		
		@Override
		String printShape() {
			return "I am in TRIANGLE printShape";
		}
	}
	
	
	static class Circle extends Shape {
		
		@Override
		String printShape() {
			return "I am in CIRCLE printShape";
		}
	}
	
	
	
	
	
	
	
	
}
