package com.module2;

public class methods {              //methods are always created inside class
	public static void main(String[] args) {
		//main method body,we use to call all other methods defined inside a class
		sayHello(); //method calling
	}
	public static void sayHello(){    //void is the return type here if return type is not specified then we have to call it explicitly.
		//sayHello method body
		System.out.println("Hello");
		return; //whenever we have void as return type it is optional
		//we need methods or function to decrease the size of code,it also reduces code redundancy,code reused,easy to read
	}
}

