//Stock Commission-Lab Assignment 2
//Mohammad El-Tawil 23/FA-CSC-161-03 Intro to Comp Sci Using Java

public class StockCommission {

	public static void main(String[] args) {

		//Initialization
		int numberOfShares = 600; //Number of shares bought
		final double PRICE_PER_SHARE = 21.77; //Share price constant
		final double COMMISSION_PERCENTAGE = 0.02; //Commission constant
		
		//Compute amount paid without commission
		double amountPaidWithoutCommission = (numberOfShares*PRICE_PER_SHARE); 
		System.out.println("The amount paid for the stock alone is: $" +amountPaidWithoutCommission); //Display results
		
		//Compute amount of commission
		double amountOfCommission = (amountPaidWithoutCommission*COMMISSION_PERCENTAGE);
		System.out.println("The amount of commission is: $" +amountOfCommission); //Display results

		//Compute total amount
		double totalAmount = (amountPaidWithoutCommission + amountOfCommission);
		System.out.println("The total amount is: $" +totalAmount); //Display results
	}
}

/*
 *  The amount paid for the stock alone is: $13062.0
 *	The amount of commission is: $261.24
 *	The total amount is: $13323.24
 */