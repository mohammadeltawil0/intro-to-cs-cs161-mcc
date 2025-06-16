import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FinalPractice1 {
    private int[] serialNumbers;
    private String[] colors;
    private String[] models;
    private String[] descriptions;
    private double[] totalCosts;
    private int totalCars;

    // Constructor
    public FinalPractice1() {
        // Initialize arrays with some initial size (e.g., 100)
        serialNumbers = new int[100];
        colors = new String[100];
        models = new String[100];
        descriptions = new String[100];
        totalCosts = new double[100];
        totalCars = 0;
    }

    // Method to add a car to the inventory
    public void addCar(int serialNumber, String color, String model, String description, double totalCost) {
        serialNumbers[totalCars] = serialNumber;
        colors[totalCars] = color;
        models[totalCars] = model;
        descriptions[totalCars] = description;
        totalCosts[totalCars] = totalCost;
        totalCars++;
    }

    // Method to search for a car using serial number
    public void searchBySerialNumber(int searchSerialNumber) {
        boolean found = false;
        for (int i = 0; i < totalCars; i++) {
            if (serialNumbers[i] == searchSerialNumber) {
                found = true;
                printCarDetails(i);
                break;
            }
        }
        if (!found) {
            System.out.println("Car with serial number " + searchSerialNumber + " not found.");
        }
    }

    // Method to convert 2-digit serial number to color
    public String convertSerialToColor(int serialNumber) {
        String[] colorNames = {"Black", "White", "Red", "Blue", "Silver"}; // Add more colors as needed
        int index = serialNumber % colorNames.length;
        return colorNames[index];
    }

    // Method to print car details to the screen
    public void printCarDetails(int index) {
        System.out.println("Serial Number: " + serialNumbers[index]);
        System.out.println("Color: " + colors[index]);
        System.out.println("Model: " + models[index]);
        System.out.println("Description: " + descriptions[index]);
        System.out.println("Total Cost: " + totalCosts[index]);
    }

    // Method to write car details to a text file
    public void writeToFile(String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            for (int i = 0; i < totalCars; i++) {
                writer.write("Serial Number: " + serialNumbers[i] + "\n");
                writer.write("Color: " + colors[i] + "\n");
                writer.write("Model: " + models[i] + "\n");
                writer.write("Description: " + descriptions[i] + "\n");
                writer.write("Total Cost: " + totalCosts[i] + "\n\n");
            }
            writer.close();
            System.out.println("Data has been written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    	FinalPractice1 inventory = new FinalPractice1();
        inventory.addCar(11, "Black", "Model A", "Sedan", 25000.0);
        // Add more cars as needed

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the serial number to search: ");
        int searchSerialNumber = scanner.nextInt();
        inventory.searchBySerialNumber(searchSerialNumber);

        // Example of converting serial number to color
        int exampleSerialNumber = 11;
        String color = inventory.convertSerialToColor(exampleSerialNumber);
        System.out.println("Serial Number " + exampleSerialNumber + " corresponds to color: " + color);

        // Example of writing to a file
        inventory.write

