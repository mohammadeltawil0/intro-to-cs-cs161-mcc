//Celius To Fahrenheit Table
//Mohammad El-Tawil Intro to Comp Sci Using Java

public class CelsiusToFahrenheitTable {
	public static void main (String[] args) {

		//Declare variables
		double fahrenheit;
		double celsius;

		//Display the table headings
		System.out.println("Celsius\t\tFahrenheit");
		System.out.println("------------------------------");

		//Display the table using a for loop
		for (celsius = 0; celsius <= 20; celsius++) {
			fahrenheit = (celsius*9/5) + 32;
			System.out.printf("%f\t%f\n", celsius, fahrenheit);
		}

	}
}

/*
Celsius         Fahrenheit
------------------------------
0.000000        32.000000
1.000000        33.800000
2.000000        35.600000
3.000000        37.400000
4.000000        39.200000
5.000000        41.000000
6.000000        42.800000
7.000000        44.600000
8.000000        46.400000
9.000000        48.200000
10.000000       50.000000
11.000000       51.800000
12.000000       53.600000
13.000000       55.400000
14.000000       57.200000
15.000000       59.000000
16.000000       60.800000
17.000000       62.600000
18.000000       64.400000
19.000000       66.200000
20.000000       68.000000
Press any key to continue . . .
*/