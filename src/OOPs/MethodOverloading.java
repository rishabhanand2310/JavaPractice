package OOPs;

public class MethodOverloading {
	
	// Overloading
	// main method can also be overloaded

	public static void main(String args[]) {
		
		MethodOverloading obj=new MethodOverloading ();
		
		obj.sum(1, 2);
		
		obj.sum(1, 2,3);

	}

	public void sum(int a, int b) {
		
		System.out.println("This method has 2 inputs");

	}

	public void sum(int a, int b, int c) {

		System.out.println("This method has 3 inputs");
	}
	


}
