package com.module3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//ARRAYLIST
/*
List: Interface
ArrayList: Class that implements List.
i.e. ----> class ArrayList implements List{
				...
			}
List Properties:
	1.They can store only Objects.
	2.It cannot store primitive data type i.e. you cannot store int, float, char etc.
	3.It stores boxed data type i.e. Integer, Float, Character, Boolean etc.
	4.It can contain Duplicate elements.
	5.They are not ordered sequentially.
 */

//HASHMAP:
/*
Map: Interface
HashMap: Class that implements Map.
i.e. ----> class ArrayList implements Map{
				...
			}
Map Properties:
	1.They contain values based on key.
	2.It cannot store primitive data type i.e. you cannot store int, float, char etc.
	3.It stores boxed data type i.e. Integer, Float, Character, Boolean etc.
	4.It does not contain Duplicate elements.
 */

public class collection_framework {
	//it provides an architecture to store objects and manipulate them.In collection frameworks we have:
	//ArrayList: it has interface of list,it is sequential collection of objects.
	//HashMap: it has interface of map,it is collection of key-value pairs.
	public static void main(String[] args) {

		//List nameList = new ArrayList();       parent class interface (List)----> child class interface(ArrayList)

//ArrayList:
		List<String> nameList = new ArrayList();
		nameList.add("Sharad");   //0
		nameList.add("Akansha");  //1
		nameList.add("Harsh");    //2
		nameList.add("Arpita");   //3
		nameList.add("Aparna");   //4

		//System.out.println(nameList.get(2));

		//using for each loop
		for (String name: nameList) {
			System.out.println("At Index "+nameList.indexOf(name)+": "+name);
		}
		//creating a ArrayList of Employee and print out their Name:
		System.out.println();
		Employee e1 = new Employee("Ajay");
		Employee e2 = new Employee("Rahul");
		Employee e3 = new Employee("Rohit");

		List<Employee> employeeList = new ArrayList();

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);

		//using for each loop:
		System.out.println("Employees are: ");
		for (Employee employee: employeeList) {
			System.out.println(employeeList.indexOf(employee)+": "+employee.name);
		}

//HashMap:
		Map<Integer, String> namesMap = new HashMap();
		namesMap.put(1,"Sharad");
		namesMap.put(2,"Sandeep");
		namesMap.put(3,"Sankalp");

		//System.out.println(namesMap.get(1));

		//using for each
		for (Map.Entry entry : namesMap.entrySet()) {
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}
	}
}
class Employee{
	String name;

	public Employee(String name) {
		this.name = name;
	}
}
