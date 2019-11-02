package com.busyqa.course.collection.map;

import java.util.HashMap;
import java.util.Map;

import com.busyqa.course.collection.Person;

public class PersonMap {

	//Maps don't allow duplicate keys
	public static void main(String[] args) {

         Map<Integer,Person> map = new HashMap<>();
         
         map.put(1,new Person("John",30));  
         map.put(2,new Person("John",30));  
         map.put(3,new Person("Maria",25)); 
         map.put(4,new Person("Peter",35)); 
         map.put(5,new Person("Joe",28));   
         
         printMap(map);

         map.put(2,new Person("Monica",27));
         
         printMap(map);
         
         map.remove(3);
         printMap(map);
         
	}
		
	static void printMap(Map<Integer,Person> map){
		System.out.println("The number of elements is: " + map.size());
		
        for (Map.Entry<Integer,Person> e: map.entrySet()) {
       	 System.out.println("K:" + e.getKey() + " V:" + e.getValue());
        }	
        System.out.print("\n\n");
        
	}

}
