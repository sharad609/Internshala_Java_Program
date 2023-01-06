package com.module3;

public class upcasting {
	public static void main(String[] args) {
		Father f = new Father();      //f ----> Father Class
		f.Job();

		Father f1 = new Son();        //f1 ----> Son Class
		//this is known as UPCASTING when Parent Object(Reference Variable) is referenced to Child Class Object. Upcasting comes under Run-Time Polymorphism.
		f1.Job();

		//Son s1 = new Father();    it is not possible to UPCAST Child Object to Parent Class Object ,as reference variable cannot point to parent class object.
		//while we can use Down-Casting for same as ---> Son s = (Son)new Father();
	}
}
class Father{
	public void Job(){
		System.out.println("Father has Money");
	}
}
class Son extends Father{
	public void pocket_money(){
		System.out.println("Son will get Pocket Money");
	}
}
