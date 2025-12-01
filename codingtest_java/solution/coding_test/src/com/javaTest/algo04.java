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
    	int[] p1pattern = {1, 2, 3, 4, 5};
    	int[] p2pattern = {2, 1, 2, 3, 2, 4, 2, 5};
    	int[] p3pattern = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    	
    	//사람별 점수
    	int p1score = 0, p2score = 0, p3score = 0;
    	
    	//0부터 패턴 길이만큼 반복할 변수
    	int num1 = 0, num2 = 0, num3 = 0;
    	
    	for(int i=0; i<answers.length; i++) {
    		
    		if(num1==p1pattern.length-1) {
    			num1=0;
    		}
    		if(num2==p2pattern.length-1) {
    			num2=0;
    		}
    		if(num3==p3pattern.length-1) {
    			num3=0;
    		}
    		
    		if(p1pattern[num1]==answers[i]) {
    			p1score++;
    		}
    		if(p2pattern[num2]==answers[i]) {
    			p2score++;
    		}
    		if(p3pattern[num3]==answers[i]) {
    			p3score++;
    		}
    		
    		num1++;
    		num2++;
    		num3++;
    	}
    	
    	Integer[] score = new Integer[3];
    	score[0] = p1score;
    	score[1] = p2score;
    	score[2] = p3score;
    	
    	//내림차순으로 정렬
    	Arrays.sort(score, Collections.reverseOrder());
    	
    	//최고 점수
    	int bestScore = score[0];
    	
    	ArrayList<Integer> resultList = new ArrayList<>();
    	
    	if(p1score == bestScore) {
    		resultList.add(1);
    	}
    	if(p2score == bestScore) {
    		resultList.add(2);
    	}
    	if(p3score == bestScore) {
    		resultList.add(3);
    	}
    	
    	int[] result = new int[resultList.size()];
    	
    	for(int i=0; i<result.length; i++) {
    		result[i] = resultList.get(i);
    	}
    	
    	return result;
    }


}
