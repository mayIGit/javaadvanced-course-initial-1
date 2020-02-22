package com.busyqa.course.exception.checked;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
	
	//Checked exceptions doesn't inherit from RuntimeException Class
	//You are forced to manage the exception in your code
	
	void handlingException() {
		

	}
	
	void notHandlingException() throws IOException { //throws is only used at method level and for checked exceptions.
		
		BufferedReader br = null;

        br = new BufferedReader(new InputStreamReader(getClass().
        		getClassLoader().getResourceAsStream("testfile.txt")));
        
	    String line;
	    while ((line = br.readLine()) != null) {
	    	System.out.println(line);
	    }        
	    br.close();


	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		CheckedException ex = new CheckedException();

	}

}
