package com.java_study;

/* 필드와 지역변수 초깃값 차이 */
class B {
	
	//필드는 힙 메모리에 위치하여 강제 초기화됨 
	boolean m1;
	int m2;
	double m3;
	String m4;
	
	void printFieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	void printLocalVariable() {
		//지역변수는 스택 메모리에 위치하여 초깃값 설정 필수
		int k;
		
		//System.out.println(k);	-> 오류발생
	}
}
public class InitialValueOfFieldAndLocalVariable {

	public static void main(String[] args) {
		B b = new B();
		b.printFieldValue();
	}

}
