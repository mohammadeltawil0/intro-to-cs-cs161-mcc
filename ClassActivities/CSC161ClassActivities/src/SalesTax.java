//Sales Tax
//Mohammad El-Tawil Intro to Comp Sci Using Java

import java.util.Scanner; //import Scanner

public class SalesTax
{
	public static void main (String[] args) {

	//Create Scanner
	Scanner input = new Scanner(System.in);

	//Constants
	final double STATE_RATE = 0.06;
	final double COUNTY_RATE = 0.04;

	//Get the amount of the purchase
	System.out.println("Enter the amount of the purchase: "); //Ask for purchase amount
	double amountOfPurchase = input.nextDouble(); //Initialize purchase amount variable

	//Calculate the state sales tax
	double stateSalesTax = (amountOfPurchase * STATE_RATE); //Initialize state sales tax variable
	System.out.println("State sales tax is: $" + stateSalesTax); //Display results

	//Calculate county sales tax
	double countySalesTax = (amountOfPurchase * COUNTY_RATE); //Initialize county sales tax variable
	System.out.println("County sales tax is: $" + countySalesTax); //Display results

	//Calculate total sales tax
	double totalSalesTax = (stateSalesTax + countySalesTax); //Initialize total sales tax variable
	System.out.println("Total sales tax is: $" + totalSalesTax); //Display results

	//Calculate total purchase cost
	double totalPurchaseCost =  (amountOfPurchase + totalSalesTax); //Initialize total purchase cost variable
	System.out.println("Total purchase cost is: $" + totalPurchaseCost); //Display results

	}
}

/*
Enter the amount of the purchase:
180
State sales tax is: $10.799999999999999
County sales tax is: $7.2
Total sales tax is: $18.0
Total purchase cost is: $198.0
Press any key to continue . . .
*/


