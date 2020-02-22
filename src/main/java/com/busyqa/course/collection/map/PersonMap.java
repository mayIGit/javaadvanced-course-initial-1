package com.busyqa.course.collection.map;

import java.util.HashMap;
import java.util.Map;

import com.busyqa.course.collection.Person;

public class PersonMap {

	//Maps don't allow duplicate keys
	public static void main(String[] args) {

         Map<Integer,Person> map = new HashMap<>();
         
         map.put(1,new Person("John",30));  

         
	}
		
	static void printMap(Map<Integer,Person> map){
		System.out.println("The number of elements is: " + map.size());
		

        System.out.print("\n\n");
        
	}

}
