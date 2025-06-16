/*
Mohammad El-Tawil
Intro to Comp Sci Using Java
Final Exam: Mark McCormick Used Car Lot
December 16, 2023
*/


// Import statements
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class MarkMcCormickUsedCarLot {
	/** Main Method */
    public static void main(String[] args) {

    	
    	// Create arrays
    	String[] descriptionsArray = new String[25];
        int[] serialNumbersArray = new int[25];

        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Ask user to enter serial number
        System.out.println("Welcome to the Mark McCormick Used Car Lot!");
        System.out.println("\nHere are your options: 41345 68507 37291 56797 11689 98437 71220 21744 97316 53135 36892 43532 28248 39764 72583 22947 88156 78666 52331 64625 72329 58137 25819 24310 59055");
        System.out.print("\nPlease enter the 5-digit serial number for the car that you are interested in: ");
        int serialNumberInput = input.nextInt(); //Assign user input to serialNumberinput variable

        // Use try block to read info from input text file
        try {

			// Use scanner to read from file
            Scanner file = new Scanner(new File("src/carinventory.txt"));

            // Initialize carIndex variable
            int carIndex = -1;

            // Use for loop to traverse through the input text file
            for(int index = 0; index < 25 && file.hasNextLine(); index++) {

                descriptionsArray[index] = file.nextLine();

				// Create array to extract info from second line
				String line = file.nextLine();
                String[] carDetails = line.split(" ");

				// Save elements in carDetails array
                serialNumbersArray[index] = Integer.parseInt(carDetails[0]);
				int quantity = Integer.parseInt(carDetails[1]);
				float price = Float.parseFloat(carDetails[2]);
				float dealersCost = Float.parseFloat(carDetails[3]);
				int colorCode = Integer.parseInt(carDetails[4]);

                // Call method to convert to color
                String color = convertToColor(colorCode);

                // Call method to search for the inputed serial number
                carIndex = serialNumberSearch(serialNumbersArray, serialNumberInput);

                // Checking if the entered serial number matches any in the file
                if (carIndex != -1) {

                    // Displaying car details
                    System.out.println("\nThe information for the car with serial number " + serialNumberInput + " is as follows: ");
                    System.out.println("Serial Number: " + serialNumberInput + " | Description: " + descriptionsArray[index] + " | Quantity: " + quantity + " | Price: $" + price + " | Dealer's Cost: $" + dealersCost + " | Color: " + color);

                    // Call method to write car details to an output file
                    writeToFile("carOutputFile.txt", serialNumberInput, color, descriptionsArray[index], quantity, price, dealersCost);
                    break; // Exit the loop once the car is found
                }
            }

			// Close file
            file.close();

			// Detect invalid input
            if (carIndex == -1) {
                System.out.println("Invalid serial number: " + serialNumberInput);
            }
        }

        // Use catch block to detect exceptions
        catch (IOException ex) {
            System.out.println("Exception occurred while reading file:" + ex.getMessage());
        }
    }

    
	// Method to search for serial number
    public static int serialNumberSearch(int[] serialNumbersArray, int serialNumberInput) {

        // Use for loop to traverse through array
        for (int i = 0; i < 25; i++) {
            if (serialNumbersArray[i] == serialNumberInput) {
                return i; // Return index if serial number is found
            }
        }
        return -1; // Return -1 if serial number is not found
    }


    // Method to convert color code to color string
    public static String convertToColor(int colorCode) {
        switch (colorCode) {
            case 10:
                return "White";
            case 11:
                return "Black";
            case 12:
                return "Blue";
            case 13:
                return "Silver";
            case 14:
                return "Red";
            case 15:
                return "Green";
            default:
                return "Unknown";
        }
    }


    // Method to write car details to an output file
    public static void writeToFile(String filename, int serialNumber, String color, String description, int quantity, float price, float dealersCost) {

		// Use try block to write to file
    	try {

			// Create writer
    		PrintWriter writer = new PrintWriter(new FileWriter(filename));

            // Writing car details to the file
            writer.println("Information for car with serial number " + serialNumber);
            writer.println("Serial Number: " + serialNumber + " | Description: " + description + " | Quantity: " + quantity + " | Price: $" + price + " | Dealer's Cost: $" + dealersCost + " | Color: " + color);
            writer.println();

			// Close writer
            writer.close();

            // Notifying that the file has been created successfully
            System.out.println("\nFile " + filename + " has been created successfully.");
        }

        // Use catch block to detect exceptions
    	catch (IOException ex) {
            System.out.println("Exception occurred while writing to file: " + ex.getMessage());
        }
    }
}


/*
Welcome to the Mark McCormick Used Car Lot!

Please enter the 5-digit serial number for the car that you are interested in: 71220

The information for the car with serial number 71220 is as follows:
Serial Number: 71220 | Description: Ford Explorer | Quantity: 1 | Price: $29067.0 | Dealer's Cost: $33409.0 | Color: White

File carOutputFile.txt has been created successfully.
Press any key to continue . . .
*/

/*
Welcome to the Mark McCormick Used Car Lot!

Please enter the 5-digit serial number for the car that you are interested in: 12345
Invalid serial number: 12345
Press any key to continue . . .
*/