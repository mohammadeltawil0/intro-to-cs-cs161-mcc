//Land Calculation-Lab Assignment 1
//Mohammad El-Tawil 23/FA-CSC-161-03 Intro to Comp Sci Using Java

public class LandCalculation {

	public static void main(String[] args) {
		
		//Initialization
		double numberOfSquareFeet = 389767; //Number of square feet given
		final double SQUARE_FEET_IN_ONE_ACRE = 43560; //Create conversion constant
		
		//Compute the number of acres 
		double numberOfAcres = (numberOfSquareFeet/SQUARE_FEET_IN_ONE_ACRE); 
		
		//Display final results
		System.out.println("There are "+numberOfAcres+" acres of land in "+numberOfSquareFeet+" square feet.");
		
	}

}

/*
 * There are 8.947819100091827 acres of land in 389767.0 square feet.
 */