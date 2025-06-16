//Mohammad El-Tawil
//Part 2

public class ArraySumAndAverage2 {
	public static void main(String[] args) {

		//Create an array for the ages
		int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		double average;
		int sum = calculateSum(numbers); //call method to calulate the sum

		//Get the total number of elements
		int totalElements = numbers.length;

		//Calculate the average and convert it to double by calling method
		average = calculateAverage(sum, totalElements);

		//Print out sum and average
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);

	}

	//Create method to calculate sum
	public static int calculateSum(int[] numbers) {

		//Initialize sum
		int sum = 0;

		//Access all elements using for each loop using an enhanced loop
		for (int number: numbers) {

		//Add each element in sum
			sum += number;
		}
		return sum;
	}

	//Create method to calculate average
	public static double calculateAverage(int sum, int totalElements) {

		//Calculate the average and convert it to double
		return (double) sum/totalElements;
	}
}

/*
The sum is 36
The average is 3.6
Press any key to continue . . .
*/