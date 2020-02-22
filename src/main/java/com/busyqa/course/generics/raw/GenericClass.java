package com.busyqa.course.generics.raw;

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

    	
	}
}
