//Import Scanner
import java.util.Scanner;

public class MidtermPractice {
    public static void main(String[] args) {
    	
        // Create scanner
        Scanner input = new Scanner(System.in);

        //Ask user for first number
        System.out.println("Enter a whole number (type \"-999\" when you are finished inputting numbers): ");
        
        //Initialize variables
        int numbers = input.nextInt();
        int currentNumber;
        String allNumbers = ""; // Store saved inputs as a string
        int min = numbers; // Initialize minimum with the first input
        int max = numbers; // Initialize maximum with the first input
        
        //While Loop
        while (numbers != -999) {
            allNumbers += numbers + " "; // Save the input
            System.out.println("Enter another whole number (type \"-999\" when you are finished inputting numbers): ");
            currentNumber = input.nextInt();
            // Check for the sentinel value before updating numbers
            if (currentNumber == -999) {
            	System.out.println("You used a sentinel. The input has been terminated.");
                break;
            }
            
            numbers = currentNumber;
            
            // Find the minimum
            if (numbers < min) {
                min = numbers;
            }
            
            //Find the maximum
            if (numbers > max) {
                max = numbers;
            }
        }
        
        // Display the saved inputs
        System.out.println("The numbers that you inputted are: " + allNumbers);

        // Display the minimum and maximum number
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        input.close();
    }
}
