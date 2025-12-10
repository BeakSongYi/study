package com.java_study;

import java.util.Arrays;

/* 메서드 오버로딩 */
public class MethodOverloading {
	
	public static void print() {
		System.out.println("안녕");
	}
	public static void print(int i) {
		System.out.println(i);
	}
	public static void print(int i, int l) {
		System.out.println(i + l);
	}
	//가변길이 매개변수
	public static void method1(int...i) {
		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
	}
	public static void method2(String...str) {
		System.out.println(str.length);
		System.out.println(Arrays.toString(str));
	}
	public static void main(String args[]) {
		print();
		print(1);
		print(2, 3);
		
		method1(new int[] {1,2,3,4,5});
		method2(new String[] {"사과","바나나","귤"});
	}
}
