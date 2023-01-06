package com.module2;

import java.util.Scanner;

public class iterator {
	public static void main(String[] args) {

		//for Loop - if the number of iteration is fixed
		//wap to find odd number bw 1 to 100
		for (int num = 1 ; num <= 100 ; num++){               //for(datatype variable ; condition ; increment/decrement)
			if (num % 2 != 0) {
				System.out.println(num);
			}
		}
		// while loop - if the number of iteration is not fixed
		// wap to print natural number till 10
		int j = 1;              //counter variable
		while (j <= 10){        //while(condition)
			System.out.println(j);
			j = j + 1;          //increment/decrement use j++ or j--
		}
        //wap to find factorial of a number

		int num = 5;
		int fact = 1;
		while(num >= 1){
			fact = fact * num;
			num--;
		}
		System.out.println("Factorial is:"+fact);

		//Do-While loop - if the number of iteration is not fixed and you need to execute the code at least once
		//WAP to add number until users enter 0
		Scanner sc = new Scanner(System.in);
		double number = 0;
		double sum = 0;
		do{
			System.out.print("Enter a number: ");
			number = sc.nextDouble();
			sum += number;
		}while (number != 0);
		System.out.println("The sum is: "+sum);
	}
}
