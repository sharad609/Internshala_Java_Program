package com.module1;

public class typeconversion {
	public static void main(String[] args) {

		//implicit conversion
		int radius = 4;
		double newRadius = radius;
		System.out.println(newRadius);

		//explicit conversion
		double diameter = 3.78;
		long diameter1 = 8787565647267627L;            //we use long when we have large integer values and to depict this we write 'L' at end of number
		int newDiameter = (int) diameter;              //we may lose some values during explicit conversion
		int newDiameter1 = (int) diameter1;
		System.out.println(newDiameter);
		System.out.println(newDiameter1);
		//Note: What is the range of values for 'int' data type variables?
		//
		//The int type variables can store values ranging from -2147483648 to 2147483647
		//So it can hold up to 10 digits. If your number is very large then use long data type
		//'int' takes a memory of 4 bytes
		//What is the range of values for 'long' data type variables?
		//
		//The long type variables can store values ranging from -9223372036854775808 to 9223372036854775807
		//It can hold up to 19 digits. long takes a memory of 8 bytes
		//To declare a long data type value we use Capital letter 'L' at the end, can we use small letter 'l' instead?
		//Well, yes you can. But as per convention, you should not. So use capital letter 'L' instead of small 'l'.
	}
}
