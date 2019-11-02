package com.busyqa.course.collection.map;

import java.util.HashMap;
import java.util.Map;

public class IntegerMap {

	//Maps don't allow duplicate keys
	public static void main(String[] args) {

         Map<Integer,String> map = new HashMap<>();
         
         map.put(1,"Element1");
         map.put(2,"Element2");
         map.put(3,"Element3");
         map.put(4,"Element4");
         map.put(5,"Element5");
         
         printMap(map);

         map.put(2,"Element7");
         
         printMap(map);
         
         map.remove(3);
         printMap(map);
         
	}
		
	static void printMap(Map<Integer,String> map){
		System.out.println("The number of elements is: " + map.size());
		
        for (Map.Entry<Integer,String> e: map.entrySet()) {
       	 System.out.println("K:" + e.getKey() + " V:" + e.getValue());
        }	
        System.out.print("\n\n");
        
	}

}
