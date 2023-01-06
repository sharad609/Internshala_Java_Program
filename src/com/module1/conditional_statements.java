package com.module1;

import java.util.Scanner;

public class conditional_statements {
	public static void main(String[] args) {

		//if - else
		boolean isSecular = true;
		if (isSecular){
			System.out.println("India is a secular country.");
		}else {
			System.out.println("India is not a secular country.");
		}
		//Optimizing above code ------>

		//boolean isSecular = true;
		//String message;
		//if (isSecular){
		//	message = "India is a secular country.";
		//}else {
		//	message = "India is not a secular country.";
		//}
		//System.out.println(message);

		// Ternary Operator       condition?Exp1:Exp2
		String msg = isSecular? "India is a secular country." : "India is not a secular country.";
		System.out.println(msg);

		//if - else if ladder
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Score: ");
		int score = sc.nextInt();
		char grade;
		if (score>=90){
			grade = 'A';
		} else if (score>=80) {
			grade = 'B';
		} else if (score>=70) {
			grade = 'C';
		} else if (score>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println(grade);

		//switch statement
		switch(grade) {

			case 'A':
				System.out.println("Excellent Score!");
				break;
			case 'B':
				System.out.println("Very Good Score.");
				break;
			case 'C':
				System.out.println("Good Score. You can do better.");
				break;
			case 'D':
				System.out.println("Average Score. Work hard.");
				break;
			case 'F':
				System.out.println("You have failed");
				break;
			default:
				System.out.println("Invalid Grade");
		}

	}
}
