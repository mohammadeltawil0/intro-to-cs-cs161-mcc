//
//Mohammad El-Tawil Intro to Comp Sci Using Java

//import Scanner
import java.util.Scanner;

//Import demical format
import java.text.DecimalFormat;


public class PresentValue {
	public static void main(String[] args) {

	//Declare varaibles
	double future;
	double rate;
	int years;
	double present;

	//Create scanner
	Scanner input = new Scanner(System.in);

	//Create dollarFormat object to display
	// dollar amounts
	DecimalFormat dollar = new DecimalFormat("#,##0.00");

	// Get the desired future value
	System.out.println("What is the desired future value? ");
	future = input.nextDouble();

	//Get the annual interest rate
	System.out.println("What is the annual interest rate? ");
	rate = input.nextDouble();

	//Get the number of years that the investment
	//will draw interest.
	System.out.println("For how many years? ");
	years = input.nextInt();

	//Get the needed present value
	present = presentValue(future, rate, years);

	//Display the result
	System.out.println("You need to invest $" + dollar.format(present));

	}

	//Create method
	public static double presentValue(double future, double rate, int years)
	{
		double presentValue = future/Math.pow((1 + rate), years);
		return presentValue;
	}

}