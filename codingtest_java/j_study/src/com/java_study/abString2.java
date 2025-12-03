package com.java_study;

import java.util.Arrays;

/* String 클래스의 주요 메서드 */
public class abString2 {

	public static void main(String[] args) {
		
		//1.문자열 길이 length
		String str1 = "안녕하세요! 반갑습니다.";
		System.out.println(str1.length());	//공백 길이 포함
		
		//2.문자열 검색 charAt
		System.out.println(str1.charAt(1));		//인덱스1에 위치한 문자 리턴
		
		//3.문자의 인덱스 리턴 indexOf, lastIndexOf
		String str2 = "Hello Java!";
		System.out.println(str2.indexOf("a"));		//앞에서 부터 해당 문자열을 찾아 인덱스 위치 반환
		System.out.println(str2.lastIndexOf("a"));	//뒤에서 부터 해당 문자열을 찾아 인덱스 위치 반환
		System.out.println(str2.lastIndexOf("z"));	//없으면 -1 리턴
		
		//4.문자열 변환 String.valueOf(기본 자료형)
		System.out.println(String.valueOf(1.2));
		System.out.println(String.valueOf(false));
		
		//5.문자열 연결 concat
		System.out.println("안녕".concat("하세요"));
		System.out.println(str1.concat(str2));
		
		//6.문자열을 byte[]로 변환  getBytes
		byte[] byt1 = str1.getBytes();
		System.out.println(Arrays.toString(byt1));
		
		//7.문자열을 char[]로 변환  toCharArray
		char[] chr1 = str1.toCharArray();
		System.out.println(Arrays.toString(chr1));
		
		//8.문자열을 대소문자로 변환  toLowerCase, toUpperCase
		System.out.println(str2.toLowerCase());		//소문자로 변환
		System.out.println(str2.toUpperCase());		//대문자로 변환
		
		//9.문자열 치환 replace
		String str3 = "Hello Java Java";
		System.out.println(str3.replace("Java", "World"));	//Java 문자열 모두 World로 변환
		
		//10.문자열 추출 substring
		System.out.println(str3.substring(0, 5));	//인덱스 0번째부터 문자 5개 추출
		System.out.println(str3.substring(6));		//인덱스 6번째부터 끝까지 추출
		
		//11.정규식(Regex) 기준으로 문자열을 잘라 문자열 배열로 반환  split
		String str4 = "안녕.하세요 선생님/여러분";
		
		String[] strArr = str4.split("\\.| |/");		// | (or)로 패턴 여러개 지정 가능, .은 정규식에서 모든문자라는 의미기 때문에 이스케이프(\\)해서 사용
		System.out.println(Arrays.toString(strArr));
		
		//12.문자열에서 앞뒤 공백 제거 trim
		String str5 = new String("  안녕  ");
		System.out.println(str5);
		System.out.println(str5.trim());
		
		//13.문자열의 실제 내용 비교
		String str6 = new String("Java");	//new로 힙 메모리에 새로 생성
		String str7 = new String("Java");
		String str8 = new String("java");	//소문자 j
		
		//스택 메모리의 위치값 비교
		System.out.println(str6==str7);
		System.out.println(str7==str8);
		System.out.println(str8==str6);
		
		//힙 메모리의 실제 데이터 비교
		System.out.println(str7.equals(str8));				//equals 대소문자 구분
		System.out.println(str7.equalsIgnoreCase(str8));	//equals 대소문자 구분 X
	}

}
