package com.busyqa.course.exception.checked;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
	
	//Checked exceptions doesn't inherit from RuntimeException Class
	//You are forced to manage the exception in your code
	
	void handlingException() {
		
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\testfile1.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error with the file: " + e.getMessage());
        } finally { //The finally block is always executed even when the exception doesn't happen.
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
	}
	
	void notHandlingException() throws IOException { //throws is only used at method level and for checked exceptions.
		
		BufferedReader br = null;

	    br = new BufferedReader(new FileReader("D:\\testfile1.txt"));
	    String line;
	    while ((line = br.readLine()) != null) {
	    	System.out.println(line);
	    }        
	    br.close();


	}

	public static void main(String[] args) {
		CheckedException ex = new CheckedException();
		ex.handlingException();
		
		try {
			ex.notHandlingException();
		} catch (IOException e) {
			System.out.println("Error with the file: " + e.getMessage());
		}

	}

}
