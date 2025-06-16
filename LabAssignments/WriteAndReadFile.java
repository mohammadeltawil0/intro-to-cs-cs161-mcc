
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteAndReadFile {
    public static void main(String[] args) throws IOException {
        ArrayList<Employee> employees = new ArrayList<>();

        // Creating employee objects
        Employee susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        employees.add(susan);
        employees.add(mark);
        employees.add(joy);

        // Writing employee data to a text file in table format
        PrintWriter writer = new PrintWriter(new FileWriter("employee_data.txt"));
        
        // Table header
        writer.printf("%-20s %-15s %-20s %-20s%n", "Name", "ID Number", "Department", "Position");
        writer.println("--------------------------------------------------------------");

        // Writing data in table format
        for (Employee employee : employees) {
            writer.printf("%-20s %-15d %-20s %-20s%n", employee.getName(), employee.getIdNumber(), employee.getDepartment(), employee.getPosition());
        }
        
        writer.close();

        // Reading and displaying employee data from the text file
        File file = new File("employee_data.txt");
        if (file.exists()) {
            Scanner fileScanner = new Scanner(file);
            System.out.println("Confirm Employee Data: ");
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
            fileScanner.close();
        } else {
            System.out.println("File not found.");
        }
    }
}
