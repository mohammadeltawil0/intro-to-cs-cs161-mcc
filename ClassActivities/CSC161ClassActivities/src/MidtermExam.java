//Midterm Exam
//Mohammad El-Tawil Intro to Java

//Import Scanner
import java.util.Scanner;

//Main method
public class MidtermExam {
    public static void main(String[] args) {

        //Create scanner
        Scanner input = new Scanner(System.in);

        //Ask user for first number
        System.out.println("Enter a whole number from 2 to 199 (type \"-1\", \"0\", or \"+1\" when you are finished inputting numbers): ");

        //Initialize variables
        int numbers = input.nextInt(); //Save the first number
        String allNumbers = ""; //Storage for all number inputs
        int min = numbers; //Assign numbers to min
        int max = numbers;	//Assign numbers to max

        //Declare variable
        int currentNumber; //Save current number input

        //Use a while loop to get the numbers from the user that are in range and detect sentinels
        while (numbers >= 2 && numbers <= 199 && numbers != -1 || numbers != 0 || numbers != +1) {

            //Ask user for other numbers
            System.out.println("Enter another whole number from 2 to 199 (type \"-1\", \"0\", or \"+1\" when you are finished inputting numbers): ");
            currentNumber = input.nextInt();

			//Check for range
			if (numbers >= 2 && numbers <= 199) {

				//Save numbers in string variable
				allNumbers += numbers + " ";
			}

			else {

				//Tell user that the inputted number is out of range
				System.out.println("That number is out of range. Please try again.");
			}

          	//Check for sentinel values
            if (currentNumber == -1 || currentNumber == 0 || currentNumber == +1) {

            	//Tell user that a sentinel has been used
            	System.out.println("You used a sentinel. The input has been terminated.");

                //End user input
                break;
            }

			//Check for range
			if (currentNumber < 2 && currentNumber != 0 && currentNumber != -1 || currentNumber > 199) {

				//Tell user that the inputted number is out of range
				System.out.println("That number is out of range. Please try again.");
			}

			else {

				//Save currentNumber
				numbers = currentNumber;
			}


			//Compute the smallest and largest number
            // Find the smallest number
            if (numbers < min) {

				//Assign smallest number to min
                min = numbers;
            }

            //Find the largest number
            if (numbers > max) {

				//Assign largest number to max
                max = numbers;
            }
        }

        // Display the smallest number
        System.out.println("The minimum number from your input is: " + min);

        //Display the largest number
        System.out.println("The maximum number from your input is: " + max);

        //Close scanner
        input.close();
    }
}

/*
Enter a whole number from 2 to 199 (type "-1", "0", or "+1" when you are finished inputting numbers):
45
Enter another whole number from 2 to 199 (type "-1", "0", or "+1" when you are finished inputting numbers):
12
Enter another whole number from 2 to 199 (type "-1", "0", or "+1" when you are finished inputting numbers):
76
Enter another whole number from 2 to 199 (type "-1", "0", or "+1" when you are finished inputting numbers):
25
Enter another whole number from 2 to 199 (type "-1", "0", or "+1" when you are finished inputting numbers):
89
Enter another whole number from 2 to 199 (type "-1", "0", or "+1" when you are finished inputting numbers):
-2
That number is out of range. Please try again.
Enter another whole number from 2 to 199 (type "-1", "0", or "+1" when you are finished inputting numbers):
67
Enter another whole number from 2 to 199 (type "-1", "0", or "+1" when you are finished inputting numbers):
31
Enter another whole number from 2 to 199 (type "-1", "0", or "+1" when you are finished inputting numbers):
8
Enter another whole number from 2 to 199 (type "-1", "0", or "+1" when you are finished inputting numbers):
17
Enter another whole number from 2 to 199 (type "-1", "0", or "+1" when you are finished inputting numbers):
50
Enter another whole number from 2 to 199 (type "-1", "0", or "+1" when you are finished inputting numbers):
-1
You used a sentinel. The input has been terminated.
The minimum number from your input is: 8
The maximum number from your input is: 89
Press any key to continue . . .
*/