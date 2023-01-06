package com.module2;

public class method_overloading {
	//method overloading : same method name with different number of parameter.
	public static void add(int a){                //method1
		int sum = a;
		System.out.println(sum);
	}
	public static void add(int a,int b){          //method2
		int sum = a + b;
		System.out.println(sum);
	}
	public static void add(int a,int b,int c){    //method3
		int sum = a + b + c;
		System.out.println(sum);
	}
	public static void add(float a,float b) {          //method4
		float sum = a + b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		add(1);                     //triggers method1
		add(2,3);             //triggers method2
		add(1,2,3);        //triggers method3
		add(5.2f,6.0f);      //triggers method4
	}
}
