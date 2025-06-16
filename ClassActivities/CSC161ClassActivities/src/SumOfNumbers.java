//Sum of numbers
//Mohammad El-Tawil Intro to Comp Sci Using Java

import java.util.Scanner;

public class SumOfNumbers {
	public static void main (String[] args) {

		//Create Scanner
		Scanner input = new Scanner(System.in);

		//Declare variable
		int num;

		//Intitalize variables
		int maxNum = 100;
		int total = 0;

		//Get a number from the user
		System.out.println("Enter a number: "); //Ask user for number
		num = input.nextInt(); //Assign input to num

		//Validate the number using a While loop
		while (num <= 0) {
			System.out.println("Insert a positive number");
		}

		//Accumulate the sum of the numbers using a While loop
		while (num < maxNum) {
			num = num + num;
		}

		total = num;

		//Display the sum of all integers
		System.out.println("The sum of all integers is " +total);

/*
Enter a number:
12
The sum of all integers is 192
Press any key to continue . . .
*/










		}
}