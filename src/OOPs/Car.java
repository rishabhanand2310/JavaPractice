package OOPs;

public class Car {

	// Global or Class Variables
	
	int model;
	int wheel;
		
	public static void main(String[] args) {
		// new Car(); --- object of car class
		// objA ---- is object reference name 
		// new keyword is used to create object
		Car objA = new Car();
		Car objB = new Car();
		Car objC = new Car();

		objA.model=2012;
		objA.wheel=4;
		
		objB.model=2014;
		objB.wheel=4;
		
		objC.model=2015;
		objC.wheel=4;
		
		System.out.println("Before assigning the references");
		 
		System.out.println(objA.model);
		System.out.println(objA.wheel);
		
		System.out.println(objB.model);
		System.out.println(objB.wheel);
		
		System.out.println(objC.model);
		System.out.println(objC.wheel);
		
		System.out.println("After Shifting the references");
		
		// Shifting of object references
		objA=objB;
		objB=objC;
		objC=objA;
		
		objA.model=10;
		System.out.println(objA.model);
		
		objC.model=20; 		
		System.out.println(objA.model);
		
		
		
	}

}
