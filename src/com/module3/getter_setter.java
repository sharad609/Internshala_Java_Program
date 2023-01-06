package com.module3;

public class getter_setter {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		//t1.side1 = 1.0f,t1.side2 = 2.0f,t1.side3 = 3.0f cannot be accessed here because access modifier is private in Triangle class.
        //now instead of using t1.side1,t1.side2,t1.side3 we use:-
		t1.setSide1(1.0f);
		t1.setSide2(2.0f);
		t1.setSide3(3.0f);
		System.out.println("Side 1 of triangle is: "+t1.getSide1());
		System.out.println("Side 2 of triangle is: "+t1.getSide2());
		System.out.println("Side 3 of triangle is: "+t1.getSide3());

		System.out.println("Perimeter of triangle is: "+t1.getPerimeter());
		System.out.println("Area of triangle is: "+t1.getArea());
	}
}
