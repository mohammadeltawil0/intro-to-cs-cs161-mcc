//Internet Service Provider-Lab Assignment 4
//Mohammad El-Tawil 23/FA-CSC-161-03 Intro to Comp Sci Using Java

//Import scanner
import java.util.Scanner;
public class InternetServiceProvider {

	public static void main(String[] args) {

		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		char packageLetter;
		int hours;
		
		//Initialize variables
		double PACKAGE_A_MONTHLY_FEE = 9.95;
		double PACKAGE_B_MONTHLY_FEE = 13.95;
		double PACKAGE_C_MONTHLY_FEE = 19.95;
		double PACKAGE_A_HOUR_FEE = 2.00;
		double PACKAGE_B_HOUR_FEE = 1.00;
		double totalCharges = 0;
		
		//Ask user for package
		System.out.println("Enter the letter of the package that you have purchased: ");
		packageLetter = input.next().charAt(0);
		
		//Clear scanner
		input.nextLine();		
		
		//Determine package and compute total charge
		switch (packageLetter) {
		
		  //Compute total charges for Package A
	      case 'A': //Ask user for number of hours
	  				System.out.println("Enter the number of hours that you used for Package A: ");
	  				hours = input.nextInt();
	  				
	  			    //Determine monthly bill
	    	  		if (hours > 10) //Total charges with additional hours
	    	  			totalCharges = (PACKAGE_A_MONTHLY_FEE)+(hours - 10)*(PACKAGE_A_HOUR_FEE);
	      			else if (hours <= 10) //Total charges without additional hours
	      				totalCharges = (PACKAGE_A_MONTHLY_FEE);
	    	  		break;
	    	  		
	      //Compute total charges for Package B
	      case 'B': //Ask user for number of hours
	    	  		System.out.println("Enter the number of hours that you used for Package B: ");
					hours = input.nextInt();
					
					//Determine monthly bill
	    	  		if (hours > 20) //Total charges with additional hours
	    	  			totalCharges = (PACKAGE_B_MONTHLY_FEE)+(hours - 20)*(PACKAGE_B_HOUR_FEE);
					else if (hours <= 20) //Total charges without additional hours
						totalCharges = (PACKAGE_B_MONTHLY_FEE);
					break; 
					
		  //Compute total charges for Package C
	      case 'C': totalCharges = PACKAGE_C_MONTHLY_FEE; 
					break;
					
		  //Return if given invalid input
		  default: System.out.println("Invalid Input");
		  		   break;
		}
		
		//Display results
		System.out.printf("The total charges per month are $%.2f\n", totalCharges);
	}
}

/*Enter the letter of the package that you have purchased: 
 *A
 *Enter the number of hours that you used for Package A: 
 *14
 *The total charges per month are $17.95
 */

