package com.busyqa.course.generics.raw;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T> {

    // T stands for "Type"
    private T t;

    
    public GenericClass(T t) {
		super();
		this.t = t;
	}

	public void setT(T t) { 
    	this.t = t; 
    }
    
    public T getT() { 
    	return t; 
    }
    
    @SuppressWarnings("unused")
	public static void main(String[] args) {
		
    	GenericClass<Integer> obj1 = new GenericClass<>(1);
    			
    	/*A raw type is the name of a generic class or interface without any 
    	  type arguments.
    	  
    	  If the actual type argument is omitted, you create a raw type.
    	  
    	 */


    	GenericClass obj2 = new GenericClass(1); /*raw type */
    	
    	obj1 = obj2; /* warning: unchecked conversion */
    	
    	/* Raw types show up in legacy code because lots of API classes (such as 
    	 * the Collections classes) were not generic prior to JDK 5.0. When using 
    	 * raw types, you essentially get pre-generics behavior — a Box gives you 
    	 * Objects. For backward compatibility, assigning a parameterized type 
    	 * to its raw type is allowed:
    	 */
    	
    	List list = new ArrayList();/*raw type */
    	list.add(2);
    	list.add("busyQA"); /* Error!!! */
    	
    	for (Object obj: list) {
    		Integer i = (Integer)obj; /*Unchecked Error */
    		
    		System.out.println(i);
    	}
    	
	}
}
