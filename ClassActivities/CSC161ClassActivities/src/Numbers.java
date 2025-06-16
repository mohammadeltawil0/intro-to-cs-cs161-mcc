//Numbers
//Mohammad El-Tawil Intro to Comp Sci Using Java

//Import scanner
import java.util.Scanner;

public class Numbers {
	public static void main(String[] args){

		//Create scanner
		Scanner keyboard = new Scanner(System.in);

		//Get a number from the user
		System.out.print("Enter a number in the " + "range of 1 - 10: ");
		int number = keyboard.nextInt(); //Initialize variable

		//Display the integer
		switch (number) {
			case 1: System.out.println("You chose 1!"); break;

			case 2: System.out.println("You chose 2!"); break;

			case 3: System.out.println("You chose 3!"); break;

			case 4: System.out.println("You chose 4!"); break;

			case 5: System.out.println("You chose 5!"); break;

			case 6: System.out.println("You chose 6!"); break;

			case 7: System.out.println("You chose 7!"); break;

			case 8: System.out.println("You chose 8!"); break;

			case 9: System.out.println("You chose 9!"); break;

			case 10: System.out.println("You chose 10!"); break;

			default: System.out.println("Invalid number"); break;

		}

	}

}

/*
Enter a number in the range of 1 - 10: 6
You chose 6!
Press any key to continue . . .
*/
