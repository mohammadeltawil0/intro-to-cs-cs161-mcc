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
		double test4;
		double test5;
		double average;

		//Get five test scores from the user

		//Get the first score
		System.out.print("Enter test score #1: ");
		test1 = input.nextDouble();
        System.out.println("Your grade for test #1 is: " + determineGrade(test1));

		//Get the second score
		System.out.print("Enter test score #2: ");
		test2 = input.nextDouble();
        System.out.println("Your grade for test #2 is: " + determineGrade(test2));

		//Get the third score
		System.out.print("Enter test score #3: ");
		test3 = input.nextDouble();
        System.out.println("Your grade for test #3 is: " + determineGrade(test3));

		//Get the fourth score
		System.out.print("Enter test score #4: ");
		test4 = input.nextDouble();
        System.out.println("Your grade for test #4 is: " + determineGrade(test4));

		//Get the fifth score
		System.out.print("Enter test score #5: ");
		test5 = input.nextDouble();
        System.out.println("Your grade for test #5 is: " + determineGrade(test5));

      //Call calcAverage method
      average = calcAverage(test1, test2, test3, test4, test5);
      //Display average
      System.out.println("Your average is: " +average);	
    }
	
	//Method to calculate average
    public static double calcAverage(double test1, double test2, double test3, double test4, double test5) {
        return (test1 + test2 + test3 + test4 + test5) / 5;
    }
    
    //Method to determine the letter grade for each test
    public static char determineGrade(double testScore) {
        if (testScore>= 90) {
            return 'A';
        } else if (testScore >= 80) {
            return 'B';
        } else if (testScore >= 70) {
            return 'C';
        } else if (testScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

/*
Enter test score #1: 97
Your grade for test #1 is: A
Enter test score #2: 56
Your grade for test #2 is: F
Enter test score #3: 74
Your grade for test #3 is: C
Enter test score #4: 83
Your grade for test #4 is: B
Enter test score #5: 62
Your grade for test #5 is: D
Your average is: 74.4
*/
