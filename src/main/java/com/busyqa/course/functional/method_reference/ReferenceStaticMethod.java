package com.busyqa.course.functional.method_reference;

interface Sayable1{  
    void say();  
}  

public class ReferenceStaticMethod {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable1 sayable = ReferenceStaticMethod::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  