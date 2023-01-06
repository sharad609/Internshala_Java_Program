package com.module1;

import java.util.Scanner;

public class userinput {
	public static void main(String[] args) {
		String name;
		long population;
		float populationdensity;
		double GDP;
		char currency;
		boolean isSecular;

		Scanner scanner = new Scanner(System.in);          //creating scanner object inside Scanner class
		System.out.print("Enter your Country Name: ");
		//name = scanner.next();                           //next() returns only first string value entered by user
		//to avoid this we use nextLine()
		name = scanner.nextLine();

		System.out.print("Enter your Country Population: ");
		population = scanner.nextLong();

		System.out.print("Enter PopulationDensity: ");
		populationdensity= scanner.nextFloat();

		System.out.print("Enter GDP: ");
		GDP = scanner.nextDouble();

		System.out.print("Enter Currency: ");
		currency = scanner.next().charAt(0);                //charAt(0) ensures that only one character will get printed if we enter string

		System.out.println("Your Country Name is: " + name);
		System.out.println("Your Country Population is: " + population);
		System.out.println("Your Country PopulationDensity is: " + populationdensity);
		System.out.println("Your Country GDP is: " + GDP);
		System.out.println("Your Country Currency is: "  + currency);

		scanner.close();                                   //always close the Scanner class object to avoid memory leakage

		//What is the difference between Scanner.next() and Scanner.nextLine() ?
		//
		//Let us assume user enters "Hello World" in the output console. So,
		//
		//if you use Scanner.next(), you will get just "Hello" as input. The next word " World" will be ignored.
		//if you use Scanner.nextLine(), you will get the whole line of "Hello World".
		//So, it is preferred to use Scanner.nextLine() when reading String inputs from the console.

	}
}
