//Internet Service Provider 2-Lab Assignment 4
//Mohammad El-Tawil 23/FA-CSC-161-03 Intro to Comp Sci Using Java

//Import scanner
import java.util.Scanner;
public class InternetServiceProvider2 {

	public static void main(String[] args) {
		
		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		char packageLetter;
		int hours;
		
		//Initialize variables
		final double PACKAGE_A_MONTHLY_FEE = 9.95;
		final double PACKAGE_B_MONTHLY_FEE = 13.95;
	    final double PACKAGE_C_MONTHLY_FEE = 19.95;
		final double PACKAGE_A_HOUR_FEE = 2.00;
		final double PACKAGE_B_HOUR_FEE = 1.00;
		double totalChargesA = 0;
		double totalChargesB = 0;
		double totalChargesC = 0;
		double moneySavedWithB = 0;
		double moneySavedWithC = 0;
		
		//Ask user for package
		System.out.println("Enter the letter of the package that you have purchased: ");
		packageLetter = input.next().charAt(0); //Assign input to packageLetter
		
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
	    	  			totalChargesA = (PACKAGE_A_MONTHLY_FEE)+(hours - 10)*(PACKAGE_A_HOUR_FEE);
	      			else if (hours <= 10) //Total charges without additional hours
	      				totalChargesA = (PACKAGE_A_MONTHLY_FEE);
	    	  		
	    	  		//Display total charges for Package A
	    	  		System.out.printf("Your total charges for Package A are: $%.2f\n", totalChargesA);
	    	  		
	    	  		//Determine the charges from the other packages
	    	  		
	    	  		//Determine charges from Package B
	    	  		if (hours > 20)//Total charges with additional hours
	    	  			totalChargesB = (PACKAGE_B_MONTHLY_FEE)+(hours - 20)*(PACKAGE_B_HOUR_FEE);
	    	  		else 		   //Total charges without additional hours
	    	  			totalChargesB = (PACKAGE_B_MONTHLY_FEE);
	    	  		
	    	  		//Determine charges from Package C
	    	  		totalChargesC = (PACKAGE_C_MONTHLY_FEE);
	    	  		
	    	  		//Compute savings
	    	  		if (totalChargesB > 0) //Check if charges are negative
	    	  			moneySavedWithB = totalChargesA - totalChargesB;
	    	  		
	    	  		if (totalChargesC > 0) //Check if charges are negative
	    	  			moneySavedWithC = totalChargesA - totalChargesC;
	    	  		
	    	  		//Display results only if there are savings
	    	  		if (moneySavedWithB > 0)
		    			System.out.printf("With Package B, you could save $%.2f\n", moneySavedWithB);
	    	  		if (moneySavedWithC > 0)
		    			System.out.printf("With Package C, you could save $%.2f\n", moneySavedWithC);
	    	  		break;
	    	  		
	      //Compute total charges for Package B
	      case 'B': //Ask user for number of hours
	    	  		System.out.println("Enter the number of hours that you used for Package B: ");
					hours = input.nextInt();
					
					//Determine monthly bill
	    	  		if (hours > 20) //Total charges with additional hours
	    	  			totalChargesB = (PACKAGE_B_MONTHLY_FEE)+(hours - 20)*(PACKAGE_B_HOUR_FEE);
					else if (hours <= 20) //Total charges without additional hours
						totalChargesB = (PACKAGE_B_MONTHLY_FEE);
	    	  		
	    	  		//Display total charges for Package B
	    	  		System.out.printf("Your total charges for Package B are: $%.2f\n", totalChargesB);
	    	  		
	    	  		//Determine the charges from Package C
					totalChargesC = (PACKAGE_C_MONTHLY_FEE);
					
					//Compute savings
	    	  		moneySavedWithC = totalChargesB - totalChargesC;
	    	  		
	    	  		//Display results only if there are savings
	    	  		if (moneySavedWithC > 0)
		    			System.out.printf("With Package C, you could save $%.2f\n", moneySavedWithC);
	    	  		break; 
					
		  //Compute total charges for Package C
	      case 'C': totalChargesC = PACKAGE_C_MONTHLY_FEE; 
	      
	      	//Display total charges for Package C
	  		System.out.printf("Your total charges for Package C are: $%.2f\n", totalChargesC);
	      	//No savings so no message will be printed
					break;
					
		  //Return if given invalid input
		  default: System.out.println("Invalid Input");
		  		   break;
		}
	}
}

/*
 * Enter the letter of the package that you have purchased: 
 * A
 * Enter the number of hours that you used for Package A: 
 * 16
 * Your total charges for Package A are: $21.95
 * With Package B, you could save $8.00
 * With Package C, you could save $2.00
 */
