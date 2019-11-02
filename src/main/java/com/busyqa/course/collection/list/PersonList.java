package com.busyqa.course.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.busyqa.course.collection.Person;

public class PersonList {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
	
		list.add(new Person("John",30));
		list.add(new Person("John",30));
		list.add(new Person("Maria",25));
		list.add(new Person("Peter",35));
		list.add(new Person("Joe",28));
		
		System.out.println("The size of the list is: " + list.size());
		
		for (Person p: list) {
			System.out.println(p);
		}
		
		list.add(2,new Person("Monica",27));
		
		System.out.println("Executing list.add(2,new Person(\"Monica\",27));");
		
		System.out.println("The size of the list is: " + list.size());
		
		for (Person p: list) {
			System.out.println(p);
		}
		
		list.remove(2);
		System.out.println("Executing list.remove(2);");		
		System.out.println("The size of the list is: " + list.size());
		
		for (Person p: list) {
			System.out.println(p);
		}
	}

}
