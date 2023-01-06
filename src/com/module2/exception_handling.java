package com.module2;

public class exception_handling {
	//Exception Handling: to make the code exception free,so that program does not crash
//	public static void main(String[] args) {
//		System.out.println("Program Starts!"); //Executed
//		int [] array = {1,2,3,4};
//		System.out.println(array[7]);          //exception occurs and program crashes
//		System.out.println("Program Ends!");   //not executed
//	}

	//handling exception using try catch block
//	public static void main(String[] args) {
//		System.out.println("Program Starts!"); //Executed
//		int [] array = {1,2,3,4};
//		try {
//			System.out.println(array[7]);          //array index out of bound exception occurs and program crashes
//		}catch (ArrayIndexOutOfBoundsException e){
//			//your code...its optional
//			System.out.println(e);
//		}finally {       //always executed no matter exception is present or not
//			System.out.println("finally block is always executed");
//		}
//		System.out.println("Program Ends!");   //it will get executed now as exception is handled
//	}
	//for multiple exception we use multi-catch block
//	public static void main(String[] args) {
//		System.out.println("Program Starts!"); //Executed
//		int [] array = {1,2,3,4};
//		try {
//			int result = array[1]/0;               //arithmetic exception error
//			System.out.println(array[7]);          //array index out of bound exception occurs and program crashes
//		}catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
//			//your code...its optional
//			System.out.println(e);
//		}finally {       //always executed no matter exception is present or not
//			System.out.println("finally block is always executed");
//		}
//		System.out.println("Program Ends!");   //it will get executed now as exception is handled
//	}
	//when we don't know the name of exception
	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());
		}catch (Exception ex){                //exception is predefined class in java used when we don't know the name of exception
			System.out.println("Name of Exception is: "+ex);
		}
	}
}
