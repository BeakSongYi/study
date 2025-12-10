package com.java_study;

/* 다중 반복문 탈출 - 제어 키워드 + label */
public class AbLabel {

	public static void main(String[] args) {
		
		//break
		out:		//레이블명은 개발자가 임의로 지을 수 있음
			for(int i=0; i<5; i++) {
				
				for(int j=0; j<5; j++) {
					
					if(i==3) {
						break out;
					}
					System.out.println(i + ", " + j);
				}
			}
		
		//continue
		pos1:
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<5; j++) {
				
				if(i==3) {
					continue pos1;
				}
				System.out.println(i + ", " + j);
			}
		}
	}

}
