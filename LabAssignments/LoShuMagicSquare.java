//Mohammad El-Tawil 
//Intro to Comp Sci Using Java 
//Lab Assignment 9-LoShuMagicSquare

// Import Scanner
import java.util.Scanner;

public class LoShuMagicSquare {
    /** Main Method */
    public static void main(String[] args) {
    	
    	// Create Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Initialize 2D array for square numbers
        int[][] square = new int[3][3];
        
        // Prompt user to enter values for the square
        System.out.println("Enter values for the 3x3 square (use digits 1-9 and separate each number with a space):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                square[i][j] = scanner.nextInt(); // Save input in array
            }
        }
        
        // Initialize boolean variable and call method
        boolean trueOrFalse = isLoShuMagicSquare(square);

        // Display question
        System.out.println("Is this a Lo Shu Magic Square?");
        
        // Call method to display the square
        displaySquare(square);
        
        // Use boolean to determine which text to display
        if (trueOrFalse) {
            System.out.println("Yes, this is a Lo Shu Magic Square!");
        } 
        else {
            System.out.println("No, this is not a Lo Shu Magic Square.");
        }
        
        // Close Scanner
        scanner.close();
    }
    
    // Create method to display the square
    public static void displaySquare(int[][] square) {
    	
    	// Use for loop to traverse through the array and display each element accordingly
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Create method to check whether or not the given square is a Lo Shu Magic Square
    public static boolean isLoShuMagicSquare(int[][] square) {
    	
        // Check if the square is a 3x3 square
        if (square.length != 3 || square[0].length != 3) {
            return false; // Return false if the square is not 3x3
        }

        // Initialize sum constant
        final int SUM_OF_ROW_COLUMN_AND_DIAGONAL = 15;

        // Use for loop to traverse through the array and check the row and column sums
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            int columnSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += square[i][j];
                columnSum += square[j][i];
            }
            
            // Return false if they do not add up to 15
            if (rowSum != SUM_OF_ROW_COLUMN_AND_DIAGONAL || columnSum != SUM_OF_ROW_COLUMN_AND_DIAGONAL) {
                return false; // Return false if the sums do not equal 15 
            }
        }

        // Calculate the sum of the diagonals
        int diagonal1 = square[0][0] + square[1][1] + square[2][2];
        int diagonal2 = square[0][2] + square[1][1] + square[2][0];
        
        // Check if the sums of the diagonals equal 15
        return diagonal1 == SUM_OF_ROW_COLUMN_AND_DIAGONAL && diagonal2 == SUM_OF_ROW_COLUMN_AND_DIAGONAL;
    }
}

/*
Enter values for the 3x3 square (use digits 1-9 and separate each number with a space):
4 9 2 3 5 7 8 1 6
Is this a Lo Shu Magic Square?
4 9 2 
3 5 7 
8 1 6 
Yes, this is a Lo Shu Magic Square!
*/

/*
Enter values for the 3x3 square (use digits 1-9 and separate each number with a space):
1 2 3 4 5 6 7 8 9
Is this a Lo Shu Magic Square?
1 2 3 
4 5 6 
7 8 9 
No, this is not a Lo Shu Magic Square.
*/