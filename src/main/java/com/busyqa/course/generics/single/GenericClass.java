package com.busyqa.course.generics.single;

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
    
    
	@Override
	public String toString() {
		return "GenericClass [t=" + t + "]";
	}

	public static void main(String[] args) {
		
		/*
		 * In Java SE 7 and later, you can replace the type arguments required 
		 * to invoke the constructor of a generic class with an empty set of type 
		 * arguments (<>) as long as the compiler can determine, or infer, the 
		 * type arguments from the context. This pair of angle brackets, <>, is 
		 * informally called the diamond.
		 */
		
		GenericClass<String> str = new GenericClass<>("busyQA");
		System.out.println(str);
		
		
		GenericClass<Integer> num = new GenericClass<>(200);
		System.out.println(num);

	}

}
