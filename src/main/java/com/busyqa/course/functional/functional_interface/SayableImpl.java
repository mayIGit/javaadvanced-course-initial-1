package com.busyqa.course.functional.functional_interface;

public class SayableImpl implements Sayable{  
	
	@Override
    public void say(String msg){  
        System.out.println(msg);  
    }  
    
    public static void main(String[] args) {  
        SayableImpl s = new SayableImpl();  
        s.say("Hello there");  
    } 
} 
