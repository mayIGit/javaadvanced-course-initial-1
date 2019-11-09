package com.busyqa.course.autoboxing_unboxing;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {

	/* Autoboxing is the automatic conversion that the Java compiler makes between 
	 * the primitive types and their corresponding object wrapper classes. For 
	 * example, converting an int to an Integer, a double to a Double, and so on.
	 * 
	 */
	
	public static void main(String[] args) {
		
		List<Integer> li1 = new ArrayList<>();
		for (int i = 1; i < 50; i += 2)
		    li1.add(i);
		
		/* Although you add the int values as primitive types, rather than Integer 
		 * objects, to li, the code compiles. Because li is a list of Integer 
		 * objects, not a list of int values, you may wonder why the Java compiler 
		 * does not issue a compile-time error. The compiler does not generate 
		 * an error because it creates an Integer object from i and adds the 
		 * object to li. Thus, the compiler converts the previous code to the 
		 * following at runtime:
		 */
		
		List<Integer> li2 = new ArrayList<>();
		for (int i = 1; i < 50; i += 2)
		    li2.add(Integer.valueOf(i));
	}
}
