//Lab Assignment 5 - Slot Machine Simulation
//Mohammad El-Tawil Intro to Comp Sci Using Java

//Import
import java.util.Scanner;

public class SlotMachineSimulation {
	
	/** Main Method */
	public static void main(String[] args) {
		
		//Create scanner
		Scanner input = new Scanner(System.in); 
		
		//Declare variables
		double moneyEntered;
		String slot1Image;
		String slot2Image;
		String slot3Image;
		double winnings;
		
		//Initialize variables
		double totalMoneyEntered = 0;
		double totalWinnings = 0;
		boolean startGame = true;

		//While loop to create game
		while (startGame) {
			
			//Ask user to input money
			System.out.println("Enter money: ");
			moneyEntered = input.nextDouble();
			totalMoneyEntered += moneyEntered;
			
			//Initialize variables
			int slot1 = (int)(Math.random() * 6);
			int slot2 = (int)(Math.random() * 6);
			int slot3 = (int)(Math.random() * 6);
			
			//Check the image of slot 1
			if (slot1 == 0) 
				slot1Image = "cherries";
	        else if (slot1 == 1) 
	        	slot1Image = "oranges";
	        else if (slot1 == 2) 
	        	slot1Image = "plums";
	        else if (slot1 == 3) 
	        	slot1Image = "bells";
	        else if (slot1 == 4) 
	        	slot1Image = "melons";
	        else 
	        	slot1Image = "bars";
	        
			//Check the image of slot 2
	        if (slot2 == 0) 
	        	slot2Image = "cherries";
	        else if (slot2 == 1) 
	        	slot2Image = "oranges";
	        else if (slot2 == 2) 
	        	slot2Image = "plums";
	        else if (slot2 == 3) 
	        	slot2Image = "bells";
	        else if (slot2 == 4) 
	        	slot2Image = "melons";
	        else 
	        	slot2Image = "bars";
	        
			//Check the image of slot 2
	        if (slot3 == 0) 
	        	slot3Image = "cherries";
	        else if (slot3 == 1) 
	        	slot3Image = "oranges";
	        else if (slot3 == 2) 
	        	slot3Image = "plums";
	        else if (slot3 == 3) 
	        	slot3Image = "bells";
	        else if (slot3 == 4) 
	        	slot3Image = "melons";
	        else 
	        	slot3Image = "bars";
		
	        //Display slot images
            System.out.println("Slot results: " + slot1Image + " " + slot2Image + " " + slot3Image);
			
	        
			//If 3 slots match, then the user wins triple their money
			if (slot1 == slot2 && slot1 == slot3 && slot2 == slot3) {
			    winnings = moneyEntered * 3;
			    totalWinnings += winnings;
			    
			    //Display winnings
			    System.out.printf("Congratulations! You've won triple your bet. Your winnings are: $%.2f\n", winnings);
			} 
			
			//If 2 slots match, then the user wins double their money
			else if (slot1 == slot2 || slot1 == slot3 || slot2 == slot3) {
			    winnings = moneyEntered * 2;
			    totalWinnings += winnings;
			    
			    //Display winnings
			    System.out.printf("Congratulations! You've won double your bet. Your winnings are: $%.2f\n", winnings);
			} 
			
			//If no slots match, then the user wins nothing
			else {
			    winnings = 0;
			    totalWinnings += winnings;
			   
			    //Display winnings
			    System.out.printf("You won $%.2f\n", winnings);
			}
		
			//Ask user if they would like to play again
			System.out.println("Would you like to try your luck again? (Type \"yes\" or \"no\")");
			String tryAgain = input.next().toLowerCase();
			
			//Restart game if yes
			if (tryAgain.equals("yes")) 
				startGame = true;
			
			//End game if no
			else
				startGame = false;
				
				//Display total money entered and total winnings
				System.out.printf("The total amount of money entered into the slot machine is $%.2f\n", totalMoneyEntered);
				System.out.printf("The total amount of money you won from playing is $%.2f\n", totalWinnings);
		}
	}
}

/*
Enter money: 
10
Slot results: plums cherries plums
Congratulations! You've won double your bet. Your winnings are: $20.00
Would you like to try your luck again? (Type "yes" or "no")
yes
The total amount of money entered into the slot machine is $10.00
The total amount of money you won from playing is $20.00
Enter money: 
15
Slot results: melons oranges oranges
Congratulations! You've won double your bet. Your winnings are: $30.00
Would you like to try your luck again? (Type "yes" or "no")
yes
The total amount of money entered into the slot machine is $25.00
The total amount of money you won from playing is $50.00
Enter money: 
5
Slot results: melons melons plums
Congratulations! You've won double your bet. Your winnings are: $10.00
Would you like to try your luck again? (Type "yes" or "no")
no
The total amount of money entered into the slot machine is $30.00
The total amount of money you won from playing is $60.00
*/
