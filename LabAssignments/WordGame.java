//Lab Assignment 3 - Word Game
//Mohammad El-Tawil Intro to Comp Sci Using Java

//Import scanner
import java.util.Scanner;

public class WordGame {

	public static void main(String[] args) {
		
		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		String name;
		int age;
		String city;
		String college;
		String profession;
		String petAnimal;
		String petName;
		
		//Ask user for name
		System.out.println("What is your name?");
		name = input.nextLine();//Assign user input to name
		
		//Ask user for age
		System.out.println("How old are you?");
		age = input.nextInt();//Assign user input to age
		
		//Clear scanner
		input.nextLine();

		//Ask user for city
		System.out.println("Which city do you live in?");
	    city = input.nextLine();//Assign user input to city
		
		//Ask user for college
		System.out.println("What college do you go to?");
		college = input.nextLine();//Assign user input to college
		
		//Ask user for profession
		System.out.println("What is your profession?");
		profession = input.nextLine();//Assign user input to profession
		
		//Ask user for pet animal
		System.out.println("What animal is your pet?");
		petAnimal = input.nextLine();//Assign user input to age petAnimal
		
		//Ask user for pet's name
		System.out.println("What is your pet's name? ");
		petName = input.nextLine();//Assign user input to petName
		
		//Display results
		System.out.println("Your name is "+name+" and you are "+age+" years old. You live in "+city+" and go to "+college+" to study "+profession+". You also have a "+petAnimal+" named " +petName+ ".");
	}
}

/*
What is your name?
Mohammad
How old are you?
18
Which city do you live in?
North Brunswick
What college do you go to?
Middlesex College
What is your profession?
software engineering
What animal is your pet?
cat
What is your pet's name? 
Thomas
Your name is Mohammad and you are 18 years old. You live in North Brunswick and go to Middlesex College to study software engineering. You also have a cat named Thomas.
*/