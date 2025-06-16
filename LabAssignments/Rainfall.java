//Mohammad El-Tawil 
//Intro to Comp Sci Using Java 
//Lab Assignment 7-Rainfall

public class Rainfall {
	
	//Create method to calculate total rainfall
	public static double calculateTotalRainfall(double[] rainfallArray) {
		 
		 //Initialize variable
	     double total = 0;
	     
	     //Use for loop to sum up all the elements
	     for (double rainfall : rainfallArray) {
	         total += rainfall;
	     }
	     //Return total
	     return total;
	}
		
	//Create method to calculate the average rainfall
	public static double calculateAverageRainfall(double[] rainfallArray) {
		
		//Initialize total and call method
        double total = calculateTotalRainfall(rainfallArray);
        
        //Calculate and return average
        return total / rainfallArray.length;
	}
	
	//Create method to find the month with the max rainfall
	public static int findMaxIndex(double[] rainfallArray) {
       
		//Initialize variable
		int maxIndex = 0;
		
		//Create for loop to search for the index with the max
        for (int i = 1; i < rainfallArray.length; i++) {
            if (rainfallArray[i] > rainfallArray[maxIndex])
                maxIndex = i;
        }
        //Return maxIndex
        return maxIndex;
	}
	
	//Create method to find the month with the min rainfall
	public static int findMinIndex(double[] rainfallArray) {
		
		//Initialize variable
        int minIndex = 0;
        
		//Create for loop to search for the index with the min
        for (int i = 1; i < rainfallArray.length; i++) {
            if (rainfallArray[i] < rainfallArray[minIndex])
                minIndex = i;
        }
        //Return minIndex
        return minIndex;
	    
	}
}


