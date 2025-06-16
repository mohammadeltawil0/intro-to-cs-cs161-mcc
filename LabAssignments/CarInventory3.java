import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CarInventory3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 5-digit serial number for the car you want: ");
        int serialNumberInput = input.nextInt();

        try {
            Scanner file = new Scanner(new File("src/CarInventoryInputExample4.txt"));

            while (file.hasNextLine()) {
                int serialNumber = Integer.parseInt(file.nextLine());
                String[] carDetails = file.nextLine().split(", ");
                int colorCode = Integer.parseInt(carDetails[1]);
                int quantity = Integer.parseInt(carDetails[2]);
                double price = Double.parseDouble(carDetails[3]);
                double dealersCost = Double.parseDouble(carDetails[4]);
                double profit = Double.parseDouble(carDetails[5]);

                String color = convertToColor(colorCode);

                if (serialNumber == serialNumberInput) {
                    System.out.println("Serial Number: " + serialNumberInput);
                    System.out.println("Color: " + color);
                    System.out.println("Description: " + carDetails[0]);
                    System.out.println("Price: $" + price);
                    System.out.println("Dealer's Cost: $" + dealersCost);
                    System.out.println("Quantity: " + quantity);
                    System.out.println("Profit: $" + profit);

                    writeToFile("OutputFile3.txt", serialNumberInput, color, carDetails[0], quantity, price, dealersCost, profit);
                    break;
                }
            }

            file.close();
        } catch (IOException ex) {
            System.out.println("Exception occurred: " + ex.getMessage());
        }
    }

    public static String convertToColor(int colorCode) {
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

    public static void writeToFile(String filename, int serialNumber, String color, String description, int quantity, double price, double dealersCost, double profit) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(filename));

            writer.println("Serial Number: " + serialNumber);
            writer.println("Color: " + color);
            writer.println("Description: " + description);
            writer.println("Quantity: " + quantity);
            writer.println("Price: $" + price);
            writer.println("Dealer's Cost: $" + dealersCost);
            writer.println("Profit: $" + profit);

            writer.close();

            System.out.println("File " + filename + " has been created successfully with car details.");
        } 
        catch (IOException ex) {
            System.out.println("IO Exception occurred: " + ex.getMessage());
        }
    }
}
