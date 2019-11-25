package com.busyqa.course.collection.set;

import java.util.HashSet;
import java.util.Set;

import com.busyqa.course.collection.Person;

public class PersonSet {

	public static void main(String[] args) {
		
		Set<Person> set = new HashSet<>();
		
		set.add(new Person("John",30)); 
		set.add(new Person("John",35)); 
		set.add(new Person("Maria",25));
		set.add(new Person("Peter",35));

		System.out.println("The number of elements is: " + set.size());
		
		for (Person p: set) {
			System.out.println(p);
		}
		System.exit(0);
		set.add(new Person("Joe",35));

		System.out.println("The number of elements is: " + set.size());
		
		for (Person p: set) {
			System.out.println(p);
		}

		set.remove(new Person("Maria",35));

		System.out.println("The number of elements is: " + set.size());
		
		for (Person p: set) {
			System.out.println(p);
		}
		
		set.clear();
		System.out.println("The number of elements is: " + set.size());
		

	}

}
