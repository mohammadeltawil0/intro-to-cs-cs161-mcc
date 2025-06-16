//Mohammad El-Tawil 
//Intro to Comp Sci Using Java 
//Lab Assignment 8-FreezeBoilDriver


//Import Scanner
import java.util.Scanner;

/**
 The FreezeBoilDriver class demonstrates the functionality of FreezeBoil by taking user input for temperature and checking freezing/boiling points.
 */
public class FreezeBoilDriver {
    /**
     Main method to execute the program.
     @param args command line arguments
     */
    public static void main(String[] args) {
        
    	//Create Scanner
    	Scanner input = new Scanner(System.in);
        
        //Get temperature from user
        System.out.print("Please input a temperature to check whether Ethyl Alcohol, Oxygen, and/or Water will reach their boiling or freezing points: ");
        double tempInput = input.nextDouble();
        
        //Use constructor to set the initial temperature
        FreezeBoil temp = new FreezeBoil(tempInput);
        
        //Close Scanner
        input.close();
        
        //Call method to determine if Ethyl will freeze
        if (temp.isEthylFreezing()) {
            System.out.println("Ethyl will freeze at this temperature.");
        }
        
        //Call method to determine if Ethyl will boil
        if (temp.isEthylBoiling()) {
            System.out.println("Ethyl will boil at this temperature.");
        }
        
        //Call method to determine if Oxygen will freeze
        if (temp.isOxygenFreezing()) {
            System.out.println("Oxygen will freeze at this temperature.");
        }
        
        //Call method to determine if Oxygen will boil
        if (temp.isOxygenBoiling()) {
            System.out.println("Oxygen will boil at this temperature.");
        }
        
        //Call method to determine if Water will freeze
        if (temp.isWaterFreezing()) {
            System.out.println("Water will freeze at this temperature.");
        }
        
        //Call method to determine if Water will boil
        if (temp.isWaterBoiling()) {
            System.out.println("Water will boil at this temperature.");    
        }
    }
}

/*
Please input a temperature to check whether Ethyl Alcohol, Oxygen, and/or Water will reach their boiling or freezing points: 1000
Ethyl will boil at this temperature.
Oxygen will boil at this temperature.
Water will boil at this temperature.
*/