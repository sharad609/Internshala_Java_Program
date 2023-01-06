package com.module2;

public class func_example {
	public static void calculateSimpleInterest(int principal,float rateOfInterest,int timePeriod){
		double simpleInterest = principal * rateOfInterest * timePeriod/100;
		double amount = principal+simpleInterest;
		System.out.println("The Simple Interest for user is : "+simpleInterest);
		System.out.println("Total Amount for user is : "+amount);
	}

	public static void main(String[] args) {
		calculateSimpleInterest(10000,2.5f,5);
		calculateSimpleInterest(20000,5.0f,2);
		calculateSimpleInterest(50000,6.2f,10);
	}
}
