import java.util.Scanner; 
import java.io.File;

public class ReadData {
  public static void main(String[] args) throws Exception {
    // Create a File instance
	File file = new File("simpleTextFile.txt");

    // Create a Scanner for the file
    Scanner input = new Scanner(file);

    // Read data from a file
    while (input.hasNextLine()) {
        String fileInfo = input.nextLine();
        System.out.println(fileInfo);
    }

    // Close the file
    input.close();
  }
}