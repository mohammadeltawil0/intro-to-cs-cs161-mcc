//Mohammad El-Tawil
//2DArraySumAndAverage

public class MultidimensionalArraySumAndAverage {
	/** Main Method */
	public static void main(String[] args) {

		//Create an array for the ages
		int[][] numbers = {{80, 90, 100, 22}, {50, 100, 65, 95}, {20, 90, 85, 100}, {100, 45, 78, 67}, {100, 25, 56, 89}};
		double average;

		//Calculate the sum and call method
		int sum = calculateSum(numbers); //call method to calulate the sum

		//Calculate total elements and call method
		int totalElements = calculateTotalElements(numbers); //call method to calulate total elements

		//Calculate the average and convert it to double by calling method
		average = calculateAverage(sum, totalElements); //call method to calulate the average

		//Print out sum and average
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);

	}

	//Create method to calculate sum
	public static int calculateSum(int[][] numbers) {

		//Initialize sum
		int sum = 0;

		//Access all elements using for each loop using an enhanced loop
		for (int i = 0; i < numbers.length; i++) {

			//Create loop to traverse each array in the 2d array
			for (int j = 0; j < numbers[i].length; j++) {

				//Add each element in sum
				sum += numbers[i][j];
			}
		}
		return sum;
	}

	//Create method to calculate total number of elements
	public static int calculateTotalElements(int[][] numbers) {

		//intitialize total elements
		int totalElements = numbers.length;

		//Create for loop to traverse the array
		for (int i = 0; i < numbers.length; i++) {
			totalElements += numbers[i].length;
		}

		//Return totalElements
		return totalElements;

	}

	//Create method to calculate average
	public static double calculateAverage(int sum, int totalElements) {

		//Calculate the average and convert it to double
		return (double) sum/totalElements;
	}
}

/*
The sum is 1457
The average is 58.28
Press any key to continue . . .
*/