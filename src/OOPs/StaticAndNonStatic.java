package OOPs;

public class StaticAndNonStatic {

	String name = "tom";
	static int age = 25;

	public static void main(String args[]) {		
		// static methods 
		// 1. Direct call them		
		 
		sum();		
		
		// Call by class name
		
		StaticAndNonStatic.sum();
		
		// static  variables
		//1. Direct call them
		
		System.out.println("static variable age is : "+age);
		
		//2. call using class name
		
		System.out.println("static variable called by class name "+StaticAndNonStatic.age);
		
		// Non static method and variable -- create the object and the use them
		StaticAndNonStatic obj=new StaticAndNonStatic();
		
		System.out.println(obj.name);
		
	}

	public void sendMail() {

	}

	public static  void sum() {

		System.out.println("this is sum method");
	}
}
