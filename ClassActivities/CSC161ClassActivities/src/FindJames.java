//Import scanner
import java.util.Scanner;

public class FindJames {
	/** Main Method */
	public static void main(String[] args) {

		//Create scanner
		Scanner input = new Scanner(System.in);

		//Initialize key variable
		String key = "James";

		//Instantiate array
		String[] list = new String[10];

		//Ask user for input
		System.out.println("Enter the names into the array:");

		//Use for loop to save names in array
		for (int i = 0; i < list.length; i++) {
			System.out.println("Enter name: ");
			list[i]= input.nextLine();
		}

		//Invoke the method
		int count = searchMethod(list, key);

		//Display results
		System.out.println("\"James\" appears " + count + " times.");
	}

	//Create method to find James
	public static int searchMethod(String[] list, String key) {
		int count = 0;

		//Use for loop to traverse through the array to find James
		for (int i = 0; i < list.length; i++) {
			//Detect key
			if (list[i].equalsIgnoreCase(key))
				//Add to count
				count++;
		}
		//Return count
		return count;
	}
}
/*
Enter the names into the array:
Enter name:
James
Enter name:
Bob
Enter name:
Sam
Enter name:
James
Enter name:
Michael
Enter name:
James
Enter name:
James
Enter name:
Justin
Enter name:
James
Enter name:
Mark
"James" appears 5 times.
Press any key to continue . . .
*/