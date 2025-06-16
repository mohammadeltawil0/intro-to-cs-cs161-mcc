import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class CarInventory1 {
	/**Main Method*/
    public static void main(String[] args) {
    	
    	//Initialize arrays size constant
        final int ARRAY_SIZE = 25;
        
        //Initialize arrays
        int[] serialNumbers = new int[ARRAY_SIZE];
        String[] descriptions = new String[ARRAY_SIZE];
        int[] colors = new int[ARRAY_SIZE]; // Assuming color codes are integers
        int[] quantities = new int[ARRAY_SIZE];
        double[] dealerCosts = new double[ARRAY_SIZE];
        double[] prices = new double[ARRAY_SIZE];
        double[] profits = new double[ARRAY_SIZE];
        
        //Call method to read from file
        readFromFile("src/CarInventoryInputExample2.txt", serialNumbers, descriptions, colors, quantities, dealerCosts, prices, profits);
        
        //Get serial number from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 5-digit serial number: ");
        int searchSerialNumber = input.nextInt();
        
        //Initialize index and call method
        int index = sequentialSearch(searchSerialNumber, serialNumbers);
        
        //Check index and display and insert results on file
        if (index != -1) {
            displayCarDetails(index, serialNumbers, descriptions, colors, quantities, dealerCosts, prices, profits);
            writeToFile("output2.txt", index, serialNumbers, descriptions, colors, quantities, dealerCosts, prices, profits);
        } 
        else {
            System.out.println("Car with serial number " + searchSerialNumber + " not found.");
        }
    }

    // Reads data from file into arrays
    private static void readFromFile(String fileName, int[] serialNumbers, String[] descriptions, int[] colors, int[] quantities, double[] dealerCosts, double[] prices, double[] profits) {
        
    	try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            int i = 0;
            while (fileScanner.hasNextLine() && i < serialNumbers.length) {
            	
                // Read data line by line and parse them into respective arrays
                serialNumbers[i] = Integer.parseInt(fileScanner.nextLine());
                descriptions[i] = fileScanner.nextLine();
                colors[i] = Integer.parseInt(fileScanner.nextLine());
                quantities[i] = Integer.parseInt(fileScanner.nextLine());
                dealerCosts[i] = Double.parseDouble(fileScanner.nextLine());
                prices[i] = Double.parseDouble(fileScanner.nextLine());
                profits[i] = Double.parseDouble(fileScanner.nextLine());
                i++;
            }
            fileScanner.close();
        } 
        catch (IOException | NumberFormatException ex) {
            ex.printStackTrace();
        }
    }

    // Searches for a serial number in the array
    private static int sequentialSearch(int searchSerialNumber, int[] serialNumbers) {
        for (int i = 0; i < serialNumbers.length; i++) {
            if (serialNumbers[i] == searchSerialNumber) {
                return i; // Found at index i
            }
        }
        return -1; // Not found
    }

    // Converts color code to a string representation
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
            // Add more cases for other color codes
            default:
                return "Unknown";
        }
    }

    // Displays car details
    private static void displayCarDetails(int index, int[] serialNumbers, String[] descriptions, int[] colors, int[] quantities, double[] dealerCosts, double[] prices, double[] profits) {
        System.out.println("Serial Number: " + serialNumbers[index]);
        System.out.println("Description: " + descriptions[index]);
        System.out.println("Color: " + convertToColor(colors[index]));
        System.out.println("Quantity: " + quantities[index]);
        System.out.println("Dealer's Cost: $" + String.format("%.2f", dealerCosts[index]));
        System.out.println("Price: $" + String.format("%.2f", prices[index]));
        System.out.println("Profit: $" + String.format("%.2f", profits[index]));
    }

    // Writes car details to a file
    private static void writeToFile(String fileName, int index, int[] serialNumbers, String[] descriptions, int[] colors, int[] quantities, double[] dealerCosts, double[] prices, double[] profits) {
        
    	try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            // Write car details to the file
            printWriter.println("Serial Number: " + serialNumbers[index]);
            printWriter.println("Description: " + descriptions[index]);
            printWriter.println("Color: " + convertToColor(colors[index]));
            printWriter.println("Quantity: " + quantities[index]);
            printWriter.println("Dealer's Cost: $" + String.format("%.2f", dealerCosts[index]));
            printWriter.println("Price: $" + String.format("%.2f", prices[index]));
            printWriter.println("Profit: $" + String.format("%.2f", profits[index]));
            printWriter.close();
        }
    	
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
