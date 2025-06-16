//This uses GUI
//Mohammad El-Tawil Intro to Comp Sci Using Java

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class RetailPriceCalculator {
	/**Main Method */
	public static void main(String[] args) {

	//Declare variables
	String input;
	double wholesale;
	double markup;

	//Get the item's wholesale cost
	input = JOptionPane.showInputDialog("Enter the item's wholesale cost.");

	wholesale = Double.parseDouble(input);

	//Get the item's markup percentage
	input = JOptionPane.showInputDialog("Enter the item's markup percentage.");

	markup = Double.parseDouble(input)/ 100.0;

	//Create a DecimalFormat object for output formatting
	DecimalFormat dollar = new DecimalFormat("#,##0.00");

	//Display the retail price and call method
	JOptionPane.showMessageDialog(null, "The item's retail price is $" + dollar.format(calculateRetail(wholesale, markup)));

	System.exit(0);
	}

	//Create method to calculate retail
	public static double calculateRetail(double wholesale, double markup) {
			double calculateRetail = wholesale + wholesale*markup;
			return calculateRetail;
	}
}

/*
Enter the item's wholesale cost.
5
Enter the item's markup percentage.
100
The item's retail price is $10.00
*/