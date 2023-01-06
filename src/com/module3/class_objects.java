package com.module3;

public class class_objects {
	public static void main(String[] args) {

		Dog dog_1 = new Dog();

		dog_1.breed = "Labrador";
		dog_1.size = 40;
		dog_1.color= "Black";

		System.out.println(dog_1.breed);
		System.out.println(dog_1.size);
		System.out.println(dog_1.color);

		dog_1.bark();
		dog_1.run();

		Dog dog_2 = new Dog();

		dog_2.breed = "German Shepherd";
		dog_2.size = 50;
		dog_2.color = "Brown";

		System.out.println();
		System.out.println(dog_2.breed);
		System.out.println(dog_2.size);
		System.out.println(dog_2.color);

		dog_2.bark();
		dog_2.run();

		System.out.println();
		System.out.println("This is Rectangle class !");
		Rectangle r1 = new Rectangle();    //invoke default constructor
		r1.length = 54.0f;
		r1.breadth = 23.0f;
		r1.getPerimeter();
		r1.getArea();

		Rectangle r2 = new Rectangle(20,50); //invoke parameterized constructor
		System.out.println(r2.length);
		System.out.println(r2.breadth);

	}
}
