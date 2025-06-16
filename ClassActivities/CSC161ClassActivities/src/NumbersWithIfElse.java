//Numbers
//Mohammad El-Tawil Intro to Comp Sci Using Java

//Import scanner
import java.util.Scanner;

public class NumbersWithIfElse {
	public static void main(String[] args){

		//Create scanner
		Scanner keyboard = new Scanner(System.in);

		//Get a number from the user
		System.out.print("Enter a number in the " + "range of 1 - 10: ");
		int number = keyboard.nextInt(); //Initialize variable

		//Display the integer
		if (number == 1) {
			System.out.println("You chose 1!");
		}
		else if (number == 2) {
			System.out.println("You chose 2!");
		}
		else if (number == 3) {
			System.out.println("You chose 3!");
		}
		else if (number == 4) {
			System.out.println("You chose 4!");
		}
		else if (number == 5) {
			System.out.println("You chose 5!");
		}
		else if (number == 6) {
			System.out.println("You chose 6!");
		}
		else if (number == 7) {
			System.out.println("You chose 7!");
		}
		else if (number == 8) {
			System.out.println("You chose 8!");
		}
		else if (number == 9) {
			System.out.println("You chose 9!");
		}
		else if (number == 10) {
			System.out.println("You chose 10!");
		}
		else {
			System.out.println("Invalid number");
		}


	}

}

/*
Enter a number in the range of 1 - 10: 5
You chose 5!
Press any key to continue . . .
*/