package com.java_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 2차원 배열 */
public class arrays2 {


    public static void main(String[] args) {
    	
    	/*
    	 * 2차원 정방 행렬 배열 (모든 행의 길이가 같은 배열)
    	 * */
    	//1.2차원 배열 선언
    	//2차원 배열 a는 1차원 배열 2개를 원소로 갖는 1차원 배열이다.
    	int[][] a = new int[2][3];		//[행의 길이][열의 길이]
    	a[0][0] = 1; a[0][1] = 2; a[0][1] = 3;
    	a[1][0] = 4; a[1][1] = 5; a[1][2] = 6;
    	
    	System.out.println(Arrays.toString(a[0]));
    	System.out.println(a[1].length);
    	
    	//1.2차원 배열 생성
    	int[][] n = new int[2][];	//1차원 배열 2개를 원소로 갖겠다는 의미 => n = [O, O] (참조 자료형이고 힙 메모리에 저장되므로 null로 강제 초기화 되어있음)
    	n[0] = new int[3];			//인덱스 0번째 1차원 배열의 길이 3으로 지정
    	n[0][0] = 1; n[0][1] = 2; n[0][2] = 3;
    	
    	n[1] = new int[3];
    	n[1][0] = 4; n[1][1] = 5; n[1][2] = 6;
    	
    	System.out.println(Arrays.toString(n[0]));
    	
    	//2.2차원 배열 생성 - 열 선언과 동시에 초깃값으로 생성
    	int[][] n2 = new int[2][];
    	n2[0] = new int[] {1, 2, 3};
    	n2[1] = new int[] {4, 5, 6};
    	
    	System.out.println(Arrays.toString(n2[1]));
    	
    	//3.2차원 배열 생성 - 한번에 생성 & 초깃값 설정
    	int[][] n3 = new int[][] {{1,2, 3}, {4, 5, 6}};
    	
    	System.out.println(Arrays.toString(n3[1]));
    	
    	//4.2차원 배열 생성 - 선언과 생성 분리
    	int[][] n4;
    	n4 = new int[][] {{1, 2, 3}, {4, 5, 6}};
    	
    	System.out.println(Arrays.toString(n4[0]));
    	
    	//5.2차원 배열 생성 - 대입할 값만 입력하기
    	int[][] n5 = {{1, 2, 3}, {4, 5, 6}};	//4번처럼 선언과 분리해서 생성 불가능
    	
    	System.out.println(Arrays.toString(n5[1]));
    	
    	/*
    	 * 2차원 비정방 행렬 배열 (각 행마다 길이가 다른 배열)
    	 * */
    	//1.2차원 비정방 행렬 배열 생성 - 행 먼저 생성 후 열 생성
    	int[][] m = new int[2][];
    	m[0] = new int[2];
    	m[0][0] = 1; m[0][1] = 2;
    	
    	m[1] = new int[3];
    	m[1][0] = 3; m[1][1] = 4; m[1][2] = 5;
    	
    	System.out.println(m[0].length);
    	System.out.println(m[1].length);
    	
    	//2.2차원 비정방 행렬 배열 생성 - 자료형과 대입할 값만 입력하기
    	int[][] m2 = new int[][] {{1, 2}, {3, 4, 5}};
    	
    	System.out.println(m2[1][2]);
    	
    	//3.2차원 비정방 행렬 배열 생성 - 대입할 값만 입력하기
    	int[][] m3 = {{1, 2}, {3, 4, 5}};		//2번처럼 선언과 분리해서 생성 불가능
    	
    	System.out.println(m3[0][1]);
    	
    	System.out.println("=========================");
    	
    	//1.출력 방법 - 중첩 for문
    	for(int i=0; i<m3.length; i++) {
    		
    		for(int j=0; j<m3[i].length; j++) {
    			System.out.println(m[i][j]);
    		}
    	}
    	
    	//2.출력 방법 - for-each문
    	for(int[] k : m3) {
    		
    		for(int k2 : k) {
    			System.out.println(k2);
    		}
    	}
    	
    	
    	//main 메서드 매개변수 test, args -> 문자열 배열이므로 매개변수는 전부 문자열로 넘어옴
    	System.out.println(args[0]);
    	System.out.println(args[1]);
    	System.out.println(args[2]);
    	
    	System.out.println(Double.parseDouble(args[2]));
    	System.out.println(String.valueOf(Double.parseDouble(args[2])));	//문자열 -> 실수 -> 문자열 변환
    }



}
