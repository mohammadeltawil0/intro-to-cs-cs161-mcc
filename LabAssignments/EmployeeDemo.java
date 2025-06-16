
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Mohammad
 * @version 12/7/2021
 */
public class EmployeeDemo {

    /**
     * The main method of the EmployeeDemo class.
     * 
     * @param args The command-line arguments passed to the program.
     * @throws IOException Signals that an I/O exception of some sort has occurred.
     */
    public static void main(String[] args) throws IOException {

        /**
         * Create employee array
         */
        ArrayList<Employee> employees = new ArrayList<>();

        /**
         * Create employee objects
         */
        Employee susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        // Add employees to the array list
        employees.add(susan);
        employees.add(mark);
        employees.add(joy);

        // Writing employee data to a text file in table format
        PrintWriter writer = new PrintWriter(new FileWriter("employee_data.txt"));

        // Create table header
        writer.printf("%-20s %-15s %-20s %-20s%n", "Name", "ID Number", "Department", "Position");
        writer.println("-------------------------------------------------------------------------");

        // Write data in table format
        for (Employee employee : employees) {
            writer.printf("%-20s %-15d %-20s %-20s%n", employee.getName(), employee.getIdNumber(),
                    employee.getDepartment(), employee.getPosition());
        }

        // Close the writer
        writer.close();

        // Create file
        File file = new File("employee_data.txt");

        // Check if the file exists
        if (file.exists()) {
            Scanner input = new Scanner(file);

            // Ask the user to confirm data
            System.out.println("Confirm Employee Data: ");
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }

            // Close the input scanner
            input.close();
        } 
        else {
            System.out.println("File not found.");
        }

        //User confirmation
        Scanner input = new Scanner(System.in);
        System.out.println("Do you confirm the data? (yes/no): ");
        String userConfirmation = input.nextLine();

        if (userConfirmation.equalsIgnoreCase("yes")) {
            System.out.println("Data confirmed. Processing further...");
        } 
        
        else {
            System.out.println("Data not confirmed. Exiting program.");
        }
        input.close();
    }
}

/*
Confirm Employee Data: 
Name                 ID Number       Department           Position            
-------------------------------------------------------------------------
Susan Meyers         47899           Accounting           Vice President      
Mark Jones           39119           IT                   Programmer          
Joy Rogers           81774           Manufacturing        Engineer            
Do you confirm the data? (yes/no): 
yes
Data confirmed. Processing further...
*/

/*
Confirm Employee Data: 
Name                 ID Number       Department           Position            
-------------------------------------------------------------------------
Susan Meyers         47899           Accounting           Vice President      
Mark Jones           39119           IT                   Programmer          
Joy Rogers           81774           Manufacturing        Engineer            
Do you confirm the data? (yes/no): 
no
Data not confirmed. Exiting program.
*/