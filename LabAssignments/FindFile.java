import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindFile {

    public static void main(String[] args) {
        try {
            // Attempt to access the file
            File file = new File("simpleTextFile.txt");
            Scanner scanner = new Scanner(file);

            // If the file is found, read its contents
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close(); // Close the scanner when done
        }
        
        catch (FileNotFoundException ex) {
            // Catch block handles if the file is not found
            System.out.println("File not found: " + ex.getMessage());
        }
    }
}
