package com.module3;

import com.sun.tools.javac.Main;

public class static_keyword {
	/*
	1.Static Variables:
		* do not use object to access static variable
		* use className.variableName to access static variable outside the class.
		* it belongs to class and not to object,so they are called class variable.
	2.Static Methods:
		* do not use object to access static method.
		* use className.methodName to access the static method outside the class.
		* it belongs to class and not to object,so they are called class methods.
		* static method can only access static class variables.
		* static method can only invoke static class methods.
	 */

//main method is Static because to execute program we use className.variableName() which is here equals to static_keyword.main()
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Anurag Kushwaha");
		System.out.println("Name of Student 1: "+s1.getName());

		Student s2 = new Student();
		s2.setName("Sharad Kumar Mishra");
		System.out.println("Name of Student 2: "+s2.getName());

		//s1.company; it is invalid as we cannot use object to invoke static variables.
		//Student.department = "AI/ML"; is not possible as "department" is declared as final.

		//ACCESSING STATIC VARIABLE:
		System.out.println("Branch Name : "+Student.department);
		//Student.department is used to invoke the static variable "department".

		Student.count = 51;  //we can change the value of static variable if it is not declared 'final'.
		System.out.println("Number of Student : "+Student.count);

		//ACCESSING STATIC METHOD:
		Student.avg_marks();            //and not s1.avg_marks or s2.avg_marks.

	}
}
class Student {
	static final String department = "C.S.E";         //CLASS VARIABLE
	public static int count = 0;
	//static keyword used in variable to initialize a variable to be same for every object.
	//final keyword makes the string constant throughout the class.
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static void avg_marks(){            //CLASS METHOD
		//accessing static variable in static method
		System.out.println("Average marks of "+department+" department is : 7.6 CGPA");
		//System.out.println(name);    we cannot access non-static variable in static method.
		//we can access static method inside static method but cannot access non-static method in it.
		roll_no();
	}
	public static void roll_no(){
		//your code...
	}
}
