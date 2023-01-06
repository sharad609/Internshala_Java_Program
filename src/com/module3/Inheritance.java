package com.module3;

//Inheritance:- It is a mechanism in which one object acquires all the properties and behaviour of parent class.
//Advantage:- code redundancy, method overriding.
public class Inheritance {        //only 1 class can be public.
	public static void main(String[] args) {
		System.out.println("This is an Animal Class!");
		Animal animal = new Animal();
		animal.setName("Lion");
		System.out.println("Name of Animal is: "+animal.getName());
		animal.run();
		System.out.println();

		System.out.println("This is a Dog1 Class!");
		Dog1 dog1 = new Dog1();
		dog1.setColor("Black");
		System.out.println("Color of Dog1 is: "+ dog1.getColor());
		dog1.setName("Labrador");
		System.out.println("Name of Dog1 is: "+ dog1.getName());
		dog1.run();
		dog1.bark();
		System.out.println();

		System.out.println("This is a Cat Class!");
		Cat cat = new Cat();
		cat.setPattern("Tabby");
		System.out.println("Pattern of Cat is: "+cat.getPattern());
		cat.setName("Persian Cat");
		System.out.println("Name of Cat is: "+cat.getName());
		cat.run();
		cat.meow();
		System.out.println();

	}
}
class Animal {
	private String animal_name;

	public void run() {
		System.out.println(animal_name+" is Running!");
	}

	public String getName() {
		return animal_name;
	}

	public void setName(String name) {
		this.animal_name = name;
	}
}
class Dog1 extends Animal {
	private String color;
	public void run(){
		System.out.println(getName()+" is Running");
	}
	public void bark() {
		System.out.println("Woo! Woo!");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
class Cat extends Animal {
	private String pattern;
	public void run(){
		System.out.println(getName()+" is Running");
	}
	public void meow() {
		System.out.println("Meow! Meow!");
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
}

