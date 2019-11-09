package com.busyqa.course.functional.method_reference;

interface Sayable2 {
	void say();
}

public class ReferenceInstanceMethod {
	public void saySomething() {
		System.out.println("Hello, this is non-static method.");
	}

	public static void main(String[] args) {
		ReferenceInstanceMethod methodReference = new ReferenceInstanceMethod(); // Creating object
		// Referring non-static method using reference
		Sayable2 sayable = methodReference::saySomething;
		// Calling interface method
		sayable.say();
		// Referring non-static method using anonymous object
		Sayable2 sayable2 = new ReferenceInstanceMethod()::saySomething; // You can use anonymous object also
		// Calling interface method
		sayable2.say();
	}
}