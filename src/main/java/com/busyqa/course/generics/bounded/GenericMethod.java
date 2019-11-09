package com.busyqa.course.generics.bounded;

public class GenericMethod {

    public static <T extends Number> void inspect(T t){
        System.out.println("T: " + t.getClass().getName());
    }
    
    @SuppressWarnings("unused")
	public static void main(String[] args) {
		
    	Integer i = 5;
    	String s = "busyQA";
    	
    	GenericMethod.inspect(i);
//    	GenericMethod.inspect(s);
	}
}
