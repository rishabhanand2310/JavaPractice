
public class TwoDArray {

	public static void main(String args[]) {

		// 2 D array
		String arr[][] = new String[3][5]; // [row] [col]

		System.out.println(arr.length); // rows 3
		System.out.println(arr[0].length); // col 5
		// row 1
		arr[0][0] = "A";
		arr[0][1] = "B";
		arr[0][2] = "C";
		arr[0][3] = "D";
		arr[0][4] = "E";
		// row 2
		arr[1][0] = "A";
		arr[1][1] = "B";
		arr[1][2] = "C";
		arr[1][3] = "D";
		arr[1][4] = "E";
		// row 3
		arr[2][0] = "A";
		arr[2][1] = "B";
		arr[2][2] = "C";
		arr[2][3] = "D";
		arr[2][4] = "E";

		System.out.println(arr[0][4]); // printing
		// Print all valies of 2d array
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[0].length; col++) {
				System.out.println(arr[row][col]);
			}
		}
		
		// Printing in Matrix form
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println(" ");
		}
	}

}
