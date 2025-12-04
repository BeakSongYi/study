package com.javaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 04.모의고사 */
public class algo04 {


    public static void main(String[] args) {
    	System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5})));
    	System.out.println(Arrays.toString(solution(new int[] {1, 3, 2, 4, 2})));
    	System.out.println(Arrays.toString(solution(new int[] {3, 3, 2})));
    }

    //O(N)
    private static int[] solution(int[] answers) {
    	
    	//사람1~3 정답 찍는 패턴
    	int[][] patterns = {
    			{1, 2, 3, 4, 5}
    		  , {2, 1, 2, 3, 2, 4, 2, 5}
    		  , {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    	};
    	
    	int[] scores = new int[3];
    	
    	for(int i=0; i<answers.length; i++) {
    		
    		for(int j=0; j<3; j++) {
    			
    			if(patterns[j][ i % patterns[j].length ] == answers[i]) {
    				scores[j]++;
    			}
    		}
    	}
    	
    	int maxScore = Arrays.stream(scores).max().getAsInt();
    	
    	ArrayList<Integer> arr = new ArrayList<>();
    	
    	for(int i=0; i<3; i++) {
    		
    		if(scores[i] == maxScore) {
    			arr.add(i+1);
    		}
    	}

    	return arr.stream().mapToInt(Integer::intValue).toArray();
    }


}
