package com.busyqa.course.exception.unchecked;

@SuppressWarnings({"unused","null"})
public class UncheckedException {
	
	// All Unchecked Exceptions inherit from runtime exception.	
	
	void handlingArithmeticException() {
		System.out.println("Executing handlingArithmeticException");

	}
	
	void notHandlingArithmeticException() {
		System.out.println("Executing notHandlingArithmeticException");
		int a = 50/0;
	}
	
	
	void handlingNullPointerException() {
		System.out.println("Executing handlingNullPointerException");

	}
	
	void notHandlingNullPointerException() {
		System.out.println("Executing notHandlingNullPointerException");
		String s = null;
		s.length();
	}
	
	void handlingNumberFormatException() {
		System.out.println("Executing handlingNumberFormatException");

	}
	
	void notHandlingNumberFormatException() {
		System.out.println("Executing notHandlingNumberFormatException");
		String s = "abc";
		int i = Integer.parseInt(s);
	}

	void handlingArrayIndexOutOfBoundsException() {
		System.out.println("Executing handlingArrayIndexOutOfBoundsException");

	}
	
	void notHandlingArrayIndexOutOfBoundsException() {
		System.out.println("Executing notHandlingArrayIndexOutOfBoundsException");
		int a[] = new int[5];
		a[10] = 50;
	}
	
	public static void main(String[] args) {
         
		UncheckedException ex = new UncheckedException();
		
		ex.handlingArithmeticException();
        ex.notHandlingArithmeticException();

        //ex.handlingNullPointerException();
        //ex.notHandlingNullPointerException();
        
        //ex.handlingNumberFormatException();
        //ex.notHandlingNumberFormatException();
        
        //ex.handlingArrayIndexOutOfBoundsException();
        //ex.notHandlingArrayIndexOutOfBoundsException();
	}

}
