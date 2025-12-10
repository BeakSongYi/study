package com.java_study;

/* 생성자와 this */
class C {
	
	int m1, m2, m3, m4;
	
	C(){
		m1=1;
		m2=2;
		m3=3;
		m4=4;
	}
	C(int a){
		m1=a;
		m2=2;
		m3=3;
		m4=4;
	}
	C(int a, int b){
		m1=a;
		m2=b;
		m3=3;
		m4=4;
	}
	void print() {
		System.out.println(m1 + ", " + m2 + ", " + m3 + ", " + m4);
	}
}
class D {
	
	int m1, m2, m3, m4;
	
	D(){
		m1=1;
		m2=2;
		m3=3;
		m4=4;
	}
	D(int a){
		this();
		m1=a;
	}
	D(int a, int b){
		this(a);
		m2=b;
	}
	void print() {
		System.out.println(m1 + ", " + m2 + ", " + m3 + ", " + m4);
	}
}
public class ThisMethod {
	
	public static void main(String args[]) {
		//this 사용 x
		C c1 = new C();
		C c2 = new C(10);
		C c3 = new C(10, 20);
		c1.print();
		c2.print();
		c3.print();
		
		//this 사용 o
		D d1 = new D();
		D d2 = new D(10);
		D d3 = new D(10, 20);
		d1.print();
		d2.print();
		d3.print();
	}
}
