package com.busyqa.course.collection.set;

import java.util.HashSet;
import java.util.Set;

public class StringSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("John"); 
		set.add("John"); 
		set.add("Maria");
		set.add("Peter");

		System.out.println("The number of elements is: " + set.size());
		
		for (String p: set) {
			System.out.println(p);
		}
		
		set.add("Joe");

		System.out.println("The number of elements is: " + set.size());
		
		for (String p: set) {
			System.out.println(p);
		}
		
		set.remove("Maria");

		System.out.println("The number of elements is: " + set.size());
		
		for (String p: set) {
			System.out.println(p);
		}
		
		set.clear();
		System.out.println("\nThe number of elements is: " + set.size());
		

	}

}
