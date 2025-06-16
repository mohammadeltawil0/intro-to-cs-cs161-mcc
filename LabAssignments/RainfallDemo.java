//Mohammad El-Tawil 
//Intro to Comp Sci Using Java 
//Lab Assignment 7-RainfallDemo

//Import Scanner
import java.util.Scanner;

public class RainfallDemo {
	/** Main Method */
	public static void main(String[] args) {
		
		//Import scanner
        Scanner scanner = new Scanner(System.in);
        
        //Initialize arrays
		String[] monthsArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		double[] rainfallArray = new double[12];
		
		//Get user input for array
		for (int i = 0; i < 12; i++) {
			
			//Ask user to input a series of numbers
		    System.out.print("Enter the average rainfall for " + monthsArray[i] + ": ");
		    
		    //Assign input to variable
		    double rainfall = scanner.nextDouble();
		    
		    //Avoid saving negative input in array
		    while (rainfall < 0) {
		        System.out.println("Invalid input. Please enter a non-negative value.");
		        System.out.print("Enter the average rainfall for " + monthsArray[i] + ": ");
		        rainfall = scanner.nextDouble();
		    }
		    
		    //Add input to array
		    rainfallArray[i] = rainfall;
		}

		//Close scanner
        scanner.close();
        
        //Initialize total rainfall variable and call method
		double totalRainfall = Rainfall.calculateTotalRainfall(rainfallArray);
		//Display total
		System.out.println("The total rainfall for the year: " + totalRainfall + " inches.");
		
		//Initialize average rainfall variable and call method
		double averageRainfall = Rainfall.calculateAverageRainfall(rainfallArray);
		//Display average
		System.out.println("The average rainfall for the year: " + averageRainfall + " inches.");
		
		//Initialize maxIndex and call method
        int maxIndex = Rainfall.findMaxIndex(rainfallArray);
        //Display the max and its corresponding month
        System.out.println("The maximum rainfall for the year is: " + rainfallArray[maxIndex] + " inches in " + monthsArray[maxIndex] + ".");

		//Initialize minIndex and call method
        int minIndex = Rainfall.findMinIndex(rainfallArray);
        //Display the min and its corresponding month
        System.out.println("The minimum rainfall for the year is: " + rainfallArray[minIndex] + " inches in " + monthsArray[minIndex] + ".");
		
	}
}

/*	
Enter the average rainfall for January: 5.2
Enter the average rainfall for February: 3
Enter the average rainfall for March: 6
Enter the average rainfall for April: 7.1
Enter the average rainfall for May: 6.9
Enter the average rainfall for June: 4
Enter the average rainfall for July: 2.1
Enter the average rainfall for August: 0.5
Enter the average rainfall for September: 3
Enter the average rainfall for October: -3
Invalid input. Please enter a non-negative value.
Enter the average rainfall for October: 3.2
Enter the average rainfall for November: 5.1
Enter the average rainfall for December: 4.3
The total rainfall for the year: 50.4 inches.
The average rainfall for the year: 4.2 inches.
The maximum rainfall for the year is: 7.1 inches in April.
The minimum rainfall for the year is: 0.5 inches in August.
*/