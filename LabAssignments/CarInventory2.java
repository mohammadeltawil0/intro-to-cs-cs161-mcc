//Import statements
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CarInventory2 {
	/**Main Method*/
    public static void main(String[] args) {
    	
    	//Create arrays
        int[] serialNumbersArray = new int[25];
        String[] descriptionsArray = new String[25];
        
        //Create Scanner
        Scanner input = new Scanner(System.in);
        
        //Ask user to enter serial number
        System.out.print("Enter the 5-digit serial number for the car you want: ");
        int serialNumberInput = input.nextInt();
        
        //Use try block to get info from input text file
        try {
            Scanner file = new Scanner(new File("src/CarInventoryInputExample2.txt"));

            // Reading data from the input file
            for(int index = 0; index < 25; index++) {
                // Storing car details in arrays
                serialNumbersArray[index] = Integer.parseInt(file.nextLine());
                descriptionsArray[index] = file.nextLine();
                int colorCode = Integer.parseInt(file.nextLine());
                int quantity = Integer.parseInt(file.nextLine());
                double price = Double.parseDouble(file.nextLine());
                double dealersCost = Double.parseDouble(file.nextLine());
                double profit = Double.parseDouble(file.nextLine());
                
                //Call method to convert to color
                String color = convertToColor(colorCode);
                
                // Searching for the entered serial number
                int carIndex = sequentialSearch(serialNumbersArray, serialNumberInput);
                
                // Checking if the entered serial number matches any in the file
                if (carIndex != -1) {
                    // Car details found for the entered serial number
                    
                    // Displaying car details
                    System.out.println("Serial Number: " + serialNumberInput);
                    System.out.println("Color: " + color);
                    System.out.println("Description: " + descriptionsArray[index]);
                    System.out.printf("Price: $%,.2f%n", price);
                    System.out.printf("Dealer's Cost: $%,.2f%n", dealersCost);
                    System.out.println("Quantity: " + quantity);
                    System.out.printf("Profit: $%,.2f%n", profit);

                    // Writing car details to an output file
                    writeToFile("src/OutputFile.txt", serialNumberInput, color, descriptionsArray[index], quantity, price, dealersCost, profit);
                    break; // Exit the loop once the car is found
                }
            }
                
            file.close();      
        } 
        catch (IOException ex) {
            System.out.println("Exception occurred:" + ex.getMessage());
        }
    }

    public static int sequentialSearch(int[] serialNumbersArray, int serialNumberInput) {
        for (int i = 0; i < serialNumbersArray.length; i++) {
            if (serialNumbersArray[i] == serialNumberInput) {
                return i;
            }
        }
        return -1; // Car not found
    }
     
    // Method to convert color code to color name
    private static String convertToColor(int colorCode) {
        switch (colorCode) {
            case 11:
                return "Black";
            case 12:
                return "White";
            case 13:
                return "Red";
            case 14:
                return "Blue";
            default:
                return "Unknown";
        }
    }

    // Method to write car details to an output file
    public static void writeToFile(String filename, int serialNumber, String color, String description, int quantity, double price, double dealersCost, double profit) {
        
    	try {
            FileWriter fileWriter = new FileWriter(filename, true); // Append mode
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Writing car details to the file
            printWriter.println("Serial Number: " + serialNumber);
            printWriter.println("Color: " + color);
            printWriter.println("Description: " + description);
            printWriter.println("Quantity: " + quantity);
            printWriter.printf("Price: $%,.2f%n", price);
            printWriter.printf("Dealer's Cost: $%,.2f%n", dealersCost);
            printWriter.printf("Profit: $%,.2f%n", profit);
            printWriter.println();

            printWriter.close();

            // Notifying that the file has been created successfully
            System.out.println("File " + filename + " has been created successfully with car details.");
        } 
        catch (IOException ex) {
            System.out.println("An error occurred while writing to the file.");
            ex.printStackTrace();
        }
    }
}
