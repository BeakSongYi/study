package com.javaTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

/* 03.두 개 뽑아서 더하기 */
public class algo03 {


    public static void main(String[] args) {
    	System.out.println(Arrays.toString(solution(new int[] {2, 1, 3, 4, 1})));
    	System.out.println(Arrays.toString(solution(new int[] {5, 0, 2, 7})));
    }

    //N^2 * log N * N = N^2
    private static int[] solution(int[] arr) {
    	
    	TreeSet<Integer> set = new TreeSet<Integer>();
    	
    	//N^2 * log N
    	for(int i=0; i<arr.length-1; i++) {
    		
    		for(int j=i+1; j<arr.length; j++) {		//N^2
    			
				set.add(arr[i] + arr[j]);		//log N
    		}
    	}
    	
    	//N
    	int result[] = new int[set.size()];
    	for(int i=0; i<result.length; i++) {
    		result[i] = set.pollFirst();
    	}
    	
    	return result;
    }


}
