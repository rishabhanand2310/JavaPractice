
public class ObjectArray {
	
	
	public static void main (String args[]) {
		
		Object ob[] = new Object[8];
		
		ob[0]="abc";
		ob[1]=3;
		ob[2]='e';
		ob[3]="30/2/1945";
		ob[4]=39;
		
		// System.out.println(ob[1]);
		
		for (Object i : ob) {
			 
			// For each loop
			System.out.println("value is : "+i);
		}
		
		
	}

}
