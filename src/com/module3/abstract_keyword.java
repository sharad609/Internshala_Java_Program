package com.module3;

public class abstract_keyword {
	/*
	 * Rules for Abstract Keyword: these provide security to an application by hiding implementation details.
	 *   1. abstract class:
	 *       * a class that is declared abstract.
	 *       * you cannot create object of abstract class.
	 *       * it may or may not contain abstract methods.
	 *   2. abstract method:
	 *       * no method body.You cannot write code in abstract method.
	 *       * it is mandatory to override the abstract method in child class.
	 */
	public static void main(String[] args) {
		//new Animal1();  we cannot create object of abstract class.
		//Animal1 animal;  we can create reference of abstract class.

		//BY USING UPCASTING CONCEPT OF POLYMORPHISM:
		Animal1 animal = new Bird();        //parent class reference ---> child class object
		animal.run();
		animal.eat();
	}
}
abstract class Animal1{
	public void run(){
		System.out.println("Animal is Running!");
	}
	abstract public void eat();     //abstract method does not contain body i.e. we cannot write code in it.
	//always override abstract method in child class
}
class Bird extends Animal1{
	@Override
	public void eat(){
		System.out.println("Bird is Eating");
	}
}
