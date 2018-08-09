package OOPs;

public class CalByValueAndCallByRef {
	
	int p=1;
	int q=100;

	public static void main(String[] args) {
		// Call by value
		
		CalByValueAndCallByRef obj=new CalByValueAndCallByRef();
		int sum=obj.testsum(10,12);
		System.out.println(sum);
		
		// Or
		int x=10;
		int y=12;
		int sum1=obj.testsum(x,y);
		System.out.println(sum1);
		
		 
		// call by reference
		
		obj.refswap(obj);
		
		System.out.println("value of  p " + obj.p);
		System.out.println("value of  q " + obj.q);
	}

	public int testsum(int a, int b) {
		
		int c=a+b;
		return c;
	}
	
	// method for call by reference
	public void refswap(CalByValueAndCallByRef t) {
		
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		
	}
	
}
