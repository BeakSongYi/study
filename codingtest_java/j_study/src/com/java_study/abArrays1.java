package com.java_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 1차원 배열 */
public class abArrays1 {


    public static void main(String[] args) {
    	
    	//1.배열 선언
    	int[] array1 = new int[3];
    	
    	//2.배열 선언
    	int[] array2;
    	array2 = new int[3];
    	
    	//3.다양한 배열 선언
    	boolean[] bool = new boolean[3];
    	double[] db = new double[3];
    	String[] str = new String[3];

    	//값 대입
    	array1[0] = 1;
    	array1[1] = 5;
    	array1[2] = 8;

    	//1.값 읽기 - 인덱스 접근
    	System.out.println(array1[0]);
    	
    	//2.값 읽기 - Arrays.toString 으로 한번에 읽기
    	System.out.println(Arrays.toString(array1));
    	
    	//1.모든 값 읽기 - for문
    	for(int i=0; i<array1.length; i++) {
    		System.out.println(array1[i]);
    	}
    	
    	//2.모든 값 읽기 - for-each문
    	for(int k : array1) {
    		System.out.println(k);
    	}
    	
    	//1.선언하면서 초기화
    	int[] num = new int[] {1, 2, 3};
    	
    	//2.선언 후 초기화
    	int[] num2;
    	num2 = new int[] {1, 2, 3};
    	
    	//3.선언하면서 초기화 (이 경우 선언 후 초기화 할 수 없음)
    	int[] num3 = {4, 5, 6};
    	
    	//* new를 안써도 배열 선언과 동시에 {} 쓰면 컴파일 할땐 new int[]{} 식으로 변환되어 들어감. 
    	//그래서 선언과 따로 쓰면 오류 발생
//	    	int[] num3;
//	    	num3 = {1, 2, 3};   //이런 사용 불가능
    	
    	System.out.println(Arrays.toString(num));
    	System.out.println(num.length);		//배열의 길이
    	
    	//1.값 복사 - 기본 자료형 복사
    	//기본 자료형은 스택 메모리에 실제 데이터 값을 저장하고 있으므로 변수를 복사하면 실제 데이터가 복사된다.
    	int a = 5;
    	int b = a;
    	b = 10;
    	System.out.println(a);
    	System.out.println(b);

    	//2.값 복사 - 참조 자료형
    	//참조 자료형은 스택 메모리가 아닌 힙 메모리에 저장된 객체의 위치를 저장하고 있다.
    	//참조 자료형을 복사하면 실제 데이터가 아닌 데이터의 위치값이 복사된다.
    	int[] c = new int[]{4, 5, 6};
    	int[] d = c;
    	d[0] = 10;
    	System.out.println(c[0]);
    	System.out.println(d[0]);
    }



}
