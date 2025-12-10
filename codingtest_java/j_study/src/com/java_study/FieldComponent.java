package com.java_study;

/* 필드 실습1 */

//외부클래스
class A {
	
	int m = 3;	//필드
	int n = 4;
	
	void work1() {
		int k = 5;	//지역변수
		System.out.println(k);
		work2(3);
	}
	void work2(int i) {
		int j = 4;
		System.out.println(i + j);
	}
}
public class FieldComponent {
	
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.m);
		System.out.println(a.n);
		
		a.work1();
	}

}
