import java.util.Scanner;

public class DimArrayProblem {
	public static void main(String[] args) {

		//Create scanner
		Scanner input = new Scanner(System.in);

		//Create an array for the ages
		int[] agesList = new int[5];
		agesList[0] = 0;

		//Introduce user to program
		System.out.println("Welcome! Please enter the ages of 5 people.");

		//Loop through the array using a for loop
		for (int i = 0; i < agesList.length; i++) {

			//Tell user to input age
			System.out.println("Enter the age of person #" + (i+1));

			//Assign input to list
			agesList[i] = input.nextInt();
		}

		//Call displayAges method
		displayAges(agesList);
	}

	//Create method
	public static int[] displayAges(int[] ages) {
		for (int i = 0; i < ages.length; i++)
		{
			//Display age for the particular person
			System.out.println("Person #" + (i + 1) + "'s age is " + ages[i] + " ");
		}
		return ages;
	}

}

/*
Welcome! Please enter the ages of 5 people.
Enter the age of person #1
5
Enter the age of person #2
10
Enter the age of person #3
54
Enter the age of person #4
34
Enter the age of person #5
19
Person #1's age is 5
Person #2's age is 10
Person #3's age is 54
Person #4's age is 34
Person #5's age is 19
Press any key to continue . . .
*/