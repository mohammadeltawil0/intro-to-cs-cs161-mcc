//Bank Charges
//Mohammad El-Tawil Intro to Comp Sci Using Java

//Import scanner
import java.util.Scanner;

public class BankCharges {
	public static void main (String[] args) {

		//Create scanner
		Scanner input = new Scanner(System.in);

		//Initialize variables
		final double BASE_FEE = 10.0;
		final double Level_1_Fee = 0.1;
		final double Level_2_Fee = 0.08;
		final double Level_3_Fee = 0.06;
		final double Level_4_Fee = 0.04;
		int checks;
		double totalBankFees;

		//Get the number of checks
		System.out.print("Enter the number of checks: ");
		checks = input.nextInt();

		//Determine bank fees
		if (checks <= 20) {
			totalBankFees = (checks*Level_1_Fee) + BASE_FEE;
		}
		else if (checks <= 40 && checks > 20) {
			totalBankFees = (checks*Level_2_Fee) + BASE_FEE;
		}
		else if (checks <= 60 && checks > 40) {
			totalBankFees = (checks*Level_3_Fee) + BASE_FEE;
		}
		else (checks <= 80 && checks > 60)	{
			totalBankFees = (checks*Level_4_Fee) + BASE_FEE;
		}

		//Display the total bank fees
		System.out.printf("The total fees are $%..2f\n", totalBankFees);


	}
}