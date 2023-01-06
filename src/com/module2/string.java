package com.module2;

public class string {
	public static void main(String[] args) {
		char[] myArray = {'W','e','l','c','o','m','e'};
		String firstString = "Welcome";    //String variable_name = new String(" ");
		System.out.println(myArray.length);
		//String Methods
		System.out.println(firstString.length());
		System.out.println(firstString.charAt(6));
		System.out.println(firstString.toUpperCase());
		System.out.println(firstString.toLowerCase());
		System.out.println(firstString.contains("come"));
		System.out.println(firstString.concat(" to India"));

		//String Comparison
		String first = "India";
		String second = "India";
		//using new keyword -> it will create different object in heap memory
		String third = new String("India");
		System.out.println(first == second);        //comparing two objects
		System.out.println(first == third);         //comparing two objects
		System.out.println(first.equals(third));
	}
}
