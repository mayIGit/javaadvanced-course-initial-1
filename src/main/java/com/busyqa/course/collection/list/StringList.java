package com.busyqa.course.collection.list;

import java.util.ArrayList;
import java.util.List;

public class StringList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
	
		list.add("Element1");
		list.add("Element2");
		list.add("Element3");
		list.add("Element4");
		list.add("Element5");
		
		System.out.println("The size of the list is: " + list.size());
		
		/* The Java for-each loop or enhanced for loop was 
		introduced since JavaSE 5.0*/
		for (String str: list) {
			System.out.println(str);
		}
	
		
		list.add(2,"newElement");
		
		System.out.println("Executing list.add(2,\"newElement\");");
		
		System.out.println("The size of the list is: " + list.size());
		
		//System.exit(0);
		for (String str: list) {
			System.out.println(str);
		}
		//System.exit(0);
		list.remove("newElement");
		System.out.println("Executing list.remove(\"newElement\");");		
		System.out.println("The size of the list is: " + list.size());
		
		for (String str: list) {
			System.out.println(str);
		}
	}

}
