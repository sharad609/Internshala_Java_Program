package com.module1;

public class datatypesvariable {
	public static void main(String[] args) {

		//String data type is used to store string values.
		String name = "India";     //String data type is not primitive data while boolean,char,byte,short,int,long,float,double
		//int data type is used to store integer values.
		int population = 1326572000;

		//Float data type can store numbers after decimal upto 6 digits. Float takes 4 bytes of memory.For example: float number = 4.111111f
		float populationdensity = 393.0f;

		//Double data type can store numbers after decimal upto 16 digits. Double takes 8 bytes of memory.For example: double number = 1.2222222222222222
		double GDP = 2.454;

		//char data type can only accept one character.The character is enclosed within '' not ""
		char currency = '₹';     // ₹ or \u20B9

		//boolean data type contain either true or false.
		boolean isSecular = true;      //or boolean isSecular; and then in next line write isSecular = true;

		//India has population of 1326572000 and population density of 393.0 person per sq km. It has GDP about 2.454 trillion dollar having currency ₹. It is a secular country.
		System.out.print(name + " has population of " + population + " and population density of " + populationdensity + " person per sq km. It has GDP about " + GDP + " trillion dollar having currency " + currency + " It is a " + isSecular + "secular country." );

	}
}
