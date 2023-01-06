package com.module3;

public class Triangle {
	private float side1;
	private float side2;            //instance variable must always be private because of java coding convention,making it private also increases security.
	private float side3;

	public float getPerimeter(){
		float perimeter = side1 + side2 + side3;
		return perimeter;
	}
	public double getArea(){
		float s = side1 + side2 + side3;
		float area = (s*(s-side1)*(s-side2)*(s-side3));
		double resArea = Math.sqrt(area);
		return resArea;
	}

	public float getSide1() {     //getter for side1
		return side1;
	}

	public void setSide1(float side1) {     //setter for side1
		this.side1 = side1;
	}

	public float getSide2() {          //getter for side2
		return side2;
	}

	public void setSide2(float side2) {    //setter for side2
		this.side2 = side2;
	}

	public float getSide3() {        //getter for side3
		return side3;
	}

	public void setSide3(float side3) {     //setter for side3
		this.side3 = side3;
	}
}
