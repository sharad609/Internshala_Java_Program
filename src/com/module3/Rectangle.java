package com.module3;

public class Rectangle {         // this is a rectangle class
	public float length;  //instance variable - can be accessed anywhere in class
	public float breadth; //instance variable

	//constructor : it is used to initialize instance variable and objects.it's name must be same as class name.
	//constructor overloading : same constructor name but different number of parameter.
	public Rectangle(){       //default constructor
		//your code...
		System.out.println("Default Constructor Triggered!");
	}

	public Rectangle(int l){
		//your code...
		length = l;
	}
	public Rectangle(int l, int b){    //parameterized constructor
		//your code...
		System.out.println("Parameterized Constructor Triggered!");
		length = l;
		breadth = b;
	}
	public void getPerimeter(){   //method1
		float perimeter = 2 * (length + breadth);    //local variable - can be accessed only inside method
		System.out.println(perimeter);
	}public void getArea(){  //method2
		float area = length * breadth;    //local variable
		System.out.println(area);
	}
}
