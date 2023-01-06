package com.module1;

public class operator {
	public static void main(String[] args) {

		//Arithmetic Operator

		int a = 9 % 2;               // 9 % 5 = remainder
		System.out.println(a);
		int b = 9 / 2;               // 9 / 5 = 4.5 but result is 4 because the datatype is int
		System.out.println(b);
		int c = 9 + 2;
		System.out.println(c);
		int d = 9 - 2;
		System.out.println(d);
		int e = 9 * 2;
		System.out.println(e);
		float f = 9 / 2;             //implicitly convert 9 / 2 (int division) to floating number and prints 4.0
		System.out.println(f);
		float g = 9.0f / 2;          //or 9 / 2.0f
		System.out.println(g);
		float h = (float) 9 / 2;     //explicitly convert 9 / 2 (int division) to floating number and prints 4.5
		System.out.println(h);

		//Operator Precedence

		int result = 3 + 1 - 7 * 5 % 3 / 2;          //left to right , () > [* / %] > [+ -]
		System.out.println(result);
		//=> 3 + 1 - 7 * 5 % 3 / 2
		//=> 3 + 1 - 35 % 3 / 2
		//=> 3 + 1 - 3 / 2
		//=> 3 + 1 - 1
		//=> 4 - 1
		//=> 3

		//Relational Operator
		int x = 2;
		int y = 3;
		//greater than  or greater than or equal to
		boolean r1 = x > y;
		boolean r2 = y >= x;
		System.out.println(r1);
		System.out.println(r2);
		//less than  or less than or equal to
		boolean r3 = x < y;
		boolean r4 = y <= x;
		System.out.println(r3);
		System.out.println(r4);
		//is equal to is not equal to
		boolean r5 = x == y;
		boolean r6 = y != x;
		System.out.println(r5);
		System.out.println(r6);

		//Assignment Operator
		int number = 10;
		int z = 5;

		number *= z;             // number = number * z
		System.out.println(number);
		number += z;             // number = number + z
		System.out.println(number);
		number -= z;             // number = number - z
		System.out.println(number);
		number /= z;             // number = number / z
		System.out.println(number);
		number %= z;             // number = number % z
		System.out.println(number);

		//Increment and Decrement Operator

		//Postfix : First use the value and then increment/decrement
		//Prefix  : First increment/decrement and then use the value

		//Increment
		int age = 10;
		System.out.println(age++);       //10
		System.out.println(age);         //11
		System.out.println(++age);       //12
		System.out.println(age);         //12
		//Decrement
		System.out.println(age--);       //12
		System.out.println(age);         //11
		System.out.println(--age);       //10
		System.out.println(age);         //10

		//Logical Operator: !(not),&&(and),||(or)
		boolean m = 2>3;    //false
		boolean n = 5>4;    //true

		System.out.println(!m);
		System.out.println(!n);
		System.out.println(m && n);
		System.out.println(m || n);
	}
}
