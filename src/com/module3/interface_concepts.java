package com.module3;

public class interface_concepts {
	/* Interface provides full abstraction to an application i.e. the security is high in it.
	 *   Rules of Interface:
	 *       * We cannot create object of Interface. They are blueprint of class.
	 *       * Implement keyword is used here in place of Extends.
	 *       * It only contains abstract method.
	 *       1. For Methods:
	 *           * They are public and abstract.
	 *           * No method body.
	 *           * All methods are override inside child class.
	 *       2. For Variables:
	 *           * Avoid using field variables,but when used they are constants and their values cannot be changed once defined.
	 *           * They are public,static and final.
	 */
	public static void main(String[] args) {
		//new Shape(); we cannot create object of Interface Shape.
		Shape s1 = new Circle();
		s1.draw();
		s1.area();
	}
}
interface Shape{

	public static final float pi = 3.14f;    //final keyword is used to initialize constant value to a variable
	void draw();
	//by default in interface the methods are public and abstract ,so it is not necessary to write public and abstract before creating method.
	abstract public void area();
	//above method can also be written as void eat();
}
class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("Drawing a Circle!");
	}

	@Override
	public void area() {
		//pi = 3; ,we cannot change the value of constant variable pi as it is declared final.
		System.out.println("Area of circle = pi*(r)^2");
	}
}

