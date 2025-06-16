//Mohammad El-Tawil Intro to Comp Sci Using Java
//Multidimensional Array

public class DisplayMultidimensionalArray {
	/** Main Method */
	public static void main(String[] args) {

		//Create 2d array
		int[][] a = {
			{1, -2, 3},
			{-4, -5, 6, 9},
			{7},
		};

		//Display text
		System.out.println("The elements in the 2D array are: ");

		//Create nested for loop to traverse through 2d array
		for (int i = 0; i < a.length; i++) {

			//Create loop to traverse each array in the 2d array
			for (int j = 0; j < a[i].length; j++) {

				//Print elements
				System.out.print(a[i][j] + " ");
			}
		}
	}
}

/*
The elements in the 2D array are:
1 -2 3 -4 -5 6 9 7 Press any key to continue . . .
*/