package pkg2;

import pkg1.A;

/* 외부 패키지 클래스 사용 - 임포트 */
public class PackageImport_2 {

	public static void main(String[] args) {
		
		A a = new A();
		
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}
}
