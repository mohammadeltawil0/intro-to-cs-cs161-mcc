//Import scanner
import java.util.Scanner;

public class BankCharges {

	public static void main(String[] args) {
		
		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//Initialize variables
		final double BASE_FEE = 10.0;
		final double LEVEL_1_FEE = 0.1;
		final double LEVEL_2_FEE = 0.08;
		final double LEVEL_3_FEE = 0.06;
		final double LEVEL_4_FEE = 0.04;
		int checks;
		double totalBankFees = 0;
		
		//Get the number of checks
		System.out.print("Enter the number of checks: ");
		checks = input.nextInt();
		
		//Determine bank fees
		if (checks <= 20)
			totalBankFees = (checks*LEVEL_1_FEE) + BASE_FEE;
		else if (checks <= 40 && checks > 20)
			totalBankFees = (checks*LEVEL_2_FEE) + BASE_FEE;
		else if (checks <= 60 && checks > 40)
			totalBankFees = (checks*LEVEL_3_FEE) + BASE_FEE;
		else if (checks <= 80 && checks > 60)
			totalBankFees = (checks*LEVEL_4_FEE) + BASE_FEE;
		
		//Display results
		System.out.printf("The total fees are $%.2f\n",totalBankFees);
		

	}

}
