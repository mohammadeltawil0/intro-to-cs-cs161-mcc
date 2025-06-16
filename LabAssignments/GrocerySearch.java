import java.io.*;
import java.util.Scanner;

public class GrocerySearch {
    public static void main(String[] args) {
        try {
            File file = new File("GroceryStoreList1.txt");
            if (!file.exists()) {
                System.out.println("File not found!");
                return;
            }

            Scanner fileScanner = new Scanner(file);
            PrintWriter writer = new PrintWriter("OutputFile.txt");

            Scanner input = new Scanner(System.in);
            String sku;

            while (true) {
                System.out.println("Enter the SKU number to search for in the file (type 'quit' to exit):");
                sku = input.next();

                if (sku.equalsIgnoreCase("quit")) {
                    System.out.println("Program has ended.");
                    break;
                }

                boolean found = false;

                while (fileScanner.hasNextLine()) {
                    String item = fileScanner.nextLine();
                    if (item.contains(sku)) {
                        System.out.println("Item details: " + item);
                        writer.println("Item found: " + item);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Item with SKU " + sku + " does not exist");
                    writer.println("Item with SKU " + sku + " does not exist");
                }

                fileScanner = new Scanner(file); // Reset Scanner to start from the beginning of the file
            }

            writer.close();
            fileScanner.close();

        } catch (IOException e) {
            System.out.println("IO Exception occurred: " + e.getMessage());
        }
    }
}
