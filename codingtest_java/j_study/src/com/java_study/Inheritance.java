package com.java_study;

/* 상속 */
class Human{
	String  name;
	int age;
	void eat() {}
	void sleep() {}
}
class Student extends Human{
	int studentID;
	void goToSchool() {}
}
class Worker extends Human{
	int workerID;
	void goToWork(){}
}
public class Inheritance {

	public static void main(String[] args) {
		
		//Human 객체 생성
		Human h = new Human();
		h.name = "김현지";
		h.age = 11;
		h.eat();
		h.sleep();
		
		//Student 객체 생성
		Student s = new Student();
		s.name = "김민성";
		s.age = 15;
		s.studentID = 120;
		s.eat();
		s.sleep();
		s.goToSchool();
		
		//Worker 객체 생성
		Worker w = new Worker();
		w.name = "봉윤정";
		w.age = 20;
		w.workerID = 300;
		w.eat();
		w.sleep();
		w.goToWork();
		
		System.out.println(h.name);
		System.out.println(s.name);
		System.out.println(w.name);
	}

}
