package com.busyqa.course.search;

import java.util.Arrays;

/*
 * Binary search requires a sorted collection. Also, binary searching can only 
 * be applied to a collection that allows random access (indexing).
 *  
 */

public class JavaArraySearch {

	public static void main(String[] args) {
		
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Key 14's position: " + Arrays.binarySearch(arr, 14));
	}

}
