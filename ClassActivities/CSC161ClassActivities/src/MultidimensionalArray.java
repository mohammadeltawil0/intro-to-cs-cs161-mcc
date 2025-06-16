//Mohammad El-Tawil
//MultidimensionalArray

public class MultidimensionalArray {
	/** Main Method */
	public static void main(String[] args) {

	//Create a 2d array . . . add your elements here
	int[][] a = {
		{0, 1, 2, 3},
		{4, 5, 6, 7},
		{8, 9, 10, 11},
	};

	//Calculate the length of each row and print
	int row1 = a[0].length;
	System.out.println("The length of the first row is: " +row1);
	int row2 = a[1].length;
	System.out.println("The length of the second row is: " +row2);
	int row3 = a[2].length;
	System.out.println("The length of the third row is: " +row3);

	//Create list for column lengths
	int[] lengthOfColumn = new int[4];

	//Calculate the length of each column and print
	for (int i = 0; i < 4; i++) {
		int columnLength = 0;
		for (int j = 0; j < 3; j++) {
			if (i < a[j].length)
				columnLength++;
		}
		lengthOfColumn[i]= columnLength;

	}

	//Display results
	for (int i = 0; i < 4; i++) {
		System.out.println("The length of column "+(i+1)+" is: "+lengthOfColumn[i]);
	}


	}
}
/*
The length of the first row is: 4
The length of the second row is: 4
The length of the third row is: 4
The length of column 1 is: 3
The length of column 2 is: 3
The length of column 3 is: 3
The length of column 4 is: 3
Press any key to continue . . .
*/