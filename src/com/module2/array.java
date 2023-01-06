package com.module2;

public class array {
	public static void main(String[] args) {
		//1D Array - the collection of similar type of data.
		//integer type array

		int[] myFirstArray = {1,2,3,4,5,6};
		//accessing element using index
		System.out.println(myFirstArray[3]);
		//updating an element
		myFirstArray[2] = 9;
		System.out.println(myFirstArray.length);    //length of given array
		//traversing given array
		for (int i = 0; i < myFirstArray.length; i++){
			System.out.println(myFirstArray[i]);
		}

		//float type array

		/*float[] mySecondArray;
		mySecondArray = {1,2,3,4,5,6};*/           //we cannot assign values in array in 2 steps

		float[] mySecondArray = new float[3];      //second method to create 1D array
		mySecondArray[0] = 2f;
		mySecondArray[1] = 4f;
		mySecondArray[2] = 6f;

//		for (int j = 0; j < mySecondArray.length; j++){
//			System.out.println(mySecondArray[j]);
//		}
		float sumOfNumber = 0;
		for (float num: mySecondArray) {             //for-each loop
			sumOfNumber += num;
			System.out.println(num);
		}
		System.out.println("The sum is: "+sumOfNumber);

		//2-D Array is collection of 1-D Array

		int[][] myFirst2dArray = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		//accessing an element from 2D Array
		System.out.println(myFirst2dArray[0][1]);

		//traversing 2D Array
		for (int row = 0 ; row < myFirst2dArray.length ; row++){
			System.out.println();
			for (int column = 0 ; column < myFirst2dArray[row].length ; column++){
				System.out.print(myFirst2dArray[row][column] + " ");
			}
		}
	}
}