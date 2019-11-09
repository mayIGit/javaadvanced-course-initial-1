package com.busyqa.course.autoboxing_unboxing;

import java.util.ArrayList;
import java.util.List;

public class Unboxing {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();
		
		li.add(1);
		li.add(56);
		li.add(45);
		li.add(75);
		
	    int sum = 0;
	    for (Integer i: li) {
	    	if (i % 2 == 0)
	    		sum += i;
	    }
	    
	    /* Because the remainder (%) and unary plus (+=) operators do not apply 
	     * to Integer objects, you may wonder why the Java compiler compiles the 
	     * method without issuing any errors. The compiler does not generate an 
	     * error because it invokes the intValue method to convert an Integer to 
	     * an int at runtime:
	     */
	    
	    for (Integer i : li) {
	    	if (i.intValue() % 2 == 0)
	    		sum += i.intValue();
	    }


        System.out.println("The sum is: " + sum);
	}

}
