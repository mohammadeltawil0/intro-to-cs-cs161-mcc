//TestScoresAndGrades
//Mohammad El-Tawil Intro to Comp Sci Using Java

//Import scanner
import java.util.Scanner;

public class TestScoresAndGrades {
	public static void main(String[] args) {

		//Create scanner
		Scanner input = new Scanner(System.in);

		//Declare variables
		double test1;
		double test2;
		double test3;
		double average;
		char grade;

		//Get three test scores from the user

		//Get the first score
		System.out.print("Enter test score #1: ");
		test1 = input.nextDouble();

		//Get the second score
		System.out.print("Enter test score #2: ");
		test2 = input.nextDouble();

		//Get the third score
		System.out.print("Enter test score #3: ");
		test3 = input.nextDouble();

		//Calculate the average test score
		average = (test1+test2+test3)/3;
		System.out.println("Average: " +average); //Display average

		//Determine the letter grade
		if (average >= 90) 		//A grade
			grade = 'A';
		else if (average >= 60) //C grade
			grade ='C';
		else					//F grade
			grade = 'F';


		//Display the letter grade
		System.out.println("Your score is: " +grade);
	}
}

/*
Enter test score #1: 50
Enter test score #2: 60
Enter test score #3: 70
Average: 60.0
Your score is: C
Press any key to continue . . .
*/