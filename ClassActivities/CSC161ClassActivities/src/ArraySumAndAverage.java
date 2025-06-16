

public class ArraySumAndAverage {
	public static void main(String[] args) {

		//Create an array for the ages
		int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		int sum = 0;
		double average;

		//Access all elements using for each loop using an enhanced loop
		for (int number: numbers) {

			//Add each element in sum
			sum += number;
		}
		//Get the total number of elements
		int totalElements = numbers.length;

		//Calculate the average
		average = sum/totalElements;

		//Convert the average from int to double

		//Print out sum and average
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);

	}
}