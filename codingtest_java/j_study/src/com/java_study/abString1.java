package com.java_study;

/* String 클래스 */
public class AbString1 {

	public static void main(String args[]) {
		
		//1.String 객체 생성
		String str1 = new String("hi");
		String str2 = "안녕";

		System.out.println(str1);
		System.out.println(str2);
		
		//1.String 객체 특징 - String 클래스는 값을 변경할 수 없고 새로운 객체를 생성한다. (배열과는 반대의 특성)
		String modifyStr = str1;
		modifyStr = "bye";
		
		System.out.println(str1);
		System.out.println(modifyStr);
		
		//2.String 객체 특징 - 리터럴로 생성한 String 객체는 동일한 값을 갖는 객체가 힙 메모리에 있을 때 해당 객체를 공유한다.
		String str3 = "안녕";
		String str4 = "안녕";
		String str5 = new String("안녕");
		String str6 = new String("안녕");		//new 로 생성하면 같은 값의 객체가 힙 메모리에 있어도 새로 생성됨
		
		//스택 메모리값 비교
		System.out.println(str3==str4);
		System.out.println(str4==str5);
		System.out.println(str5==str6);
		
		//문자열 연결
		String str7 = "안녕" + "하세요" + "!";		//String 객체는 수정을 할 수 없으므로 총 5개의 객체가 힙 메모리에 생성됨(안녕, 하세요, !, 안녕하세요, 안녕하세요!)
		System.out.println(str7);
		
		//연산은 앞에서 부터 차례대로 실행된다
		System.out.println(1 + "안녕" + "하세요");
		System.out.println(1 + 2 + "안녕" + "하세요");
		System.out.println("안녕" + "하세요" + 1);
		
	}
}
