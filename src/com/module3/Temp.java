package com.module3;

public class Temp {
	Temp(){
		this(5);    //this keyword : it is used to call one constructor from another constructor.
		System.out.println("The Default Constructor");
	}
	Temp(int x){
		this(5,15);
		System.out.println(x);
	}
	Temp(int x, int y){
		System.out.println(x*y);
	}
}
