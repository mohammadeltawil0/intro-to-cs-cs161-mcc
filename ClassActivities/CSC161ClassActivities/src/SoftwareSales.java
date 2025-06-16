//Software Sales
//Mohammad El-Tawil Intro to Comp Sci Using Java

//Import scanner


import java.util.Scanner;

//Import decimal format
import java.text.DecimalFormat;

public class SoftwareSales	{
	public static void main(String[] args) {

		//Create Scanner
		Scanner input = new Scanner(System.in);

		//Initialize variables
		final double UNIT_PRICE = 99.0; //Unit price constant

		//Declare discount percentage variable
		double discPercent;

		//Get the units sold
		System.out.println("Enter the number of units sold: ");
		int units = input.nextInt();
		
		//Close scanner
		input.close();
		
		//Determine the discount percentage
		if (units >= 100) {
			discPercent = 0.5; //50% discount
		}
		else if (units >= 50) {
			discPercent = 0.4; //40% discount
		}
		else if (units >= 20) {
			discPercent = 0.3; //30% discount
		}
		else if (units >= 10) {
			discPercent = 0.2; //20% discount
		}
		else {
			discPercent = 0.0; //No discount
		}

		//Calculate the discount amount
		double discount = (units*UNIT_PRICE*discPercent);

		//Calculate the total cost
		double cost = ((units*UNIT_PRICE)-(units*UNIT_PRICE*discPercent));

		//Create a DecimalFormat object to format output
		DecimalFormat dollar = new DecimalFormat("#,##0.00");

		//Display purchase info
		System.out.println("Units sold: " + units);
		System.out.println("Discount: $" + dollar.format(discount));
		System.out.println("Cost: $" + dollar.format(cost));

	}
}


/*
Enter the number of units sold:
60
Units sold: 60
Discount: $2,376.00
Cost : $3,564.00
Press any key to continue . . .
*/