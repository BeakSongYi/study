package com.javaTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

/* 02.배열 제어하기 */
public class algo02 {


    public static void main(String[] args) {
    	System.out.println(Arrays.toString(solution(new int[] {4,2,2,1,3,4})));
    	System.out.println(Arrays.toString(solution(new int[] {2,1,1,3,2,5,4})));
    }

    //O(NlogN)
    private static int[] solution(int[] arr) {
    	
    	//내림차순 정렬, 중복제거
    	TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
    	for(int num : arr) {
    		set.add(num);
    	}
    	
    	//기본형 int 배열에 넣어 return
    	int[] result = new int[set.size()];
    	for(int i=0; i<result.length; i++) {
    		result[i] = set.pollFirst();
    	}
    	
    	return result;
    }


}
