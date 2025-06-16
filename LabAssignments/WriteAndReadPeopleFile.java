import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteAndReadPeopleFile {
    public static void main(String[] args) throws IOException {
        // Creating a file object
        File file = new File("people6.txt");

        // Checking if the file exists
        if (file.exists()) {
            System.out.println("This file already exists");
            System.exit(1);
        }

        String[] people = {"Dylan, 18", "Alex, 22", "Peter, 32", "Jones, 67", "Issiac, 12", "Christian, 18", "Bryan, 19", "Jackie, 12", "Fred, 13", "Jack, 30"};

        // Writing to the simple text file using FileWriter
        try (FileWriter writer = new FileWriter(file)) {
            for (String person : people) {
                writer.write(person + "\n");
            }
        }

        // Reading from the simple text file and printing all lines
        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                String fileInfo = input.nextLine();
                System.out.println(fileInfo);
            }
        }
    }
}
