package com.module3;

public class polymorphism {
	//Polymorphism: one name but many forms is known as polymorphism.
	//Runtime Polymorphism: method overriding
	//Compile Time Polymorphism: method overloading, constructor overloading
	//Method Overriding: It can be implemented when there is Inheritance. It means same method name in parent and child class but perform different function.
	public static void main(String[] args) {
		Add s = new Add();
		s.sum();
	}
}
class Mathematics{
	public void sum(){
		System.out.println("It will generate sum of given numbers.");
	}
}
class Add extends Mathematics{
	@Override
	public void sum() {
		super.sum();             //It will override sum method of parent class.
		//super() keyword:- it is used to call parent class method from child class
		int a = 3;
		int b = 5;
		System.out.println(a+"+"+b+"="+(a+b));
	}
}

