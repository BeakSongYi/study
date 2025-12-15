package EX01_AccessModifierOfMember;

import pkg3.A;
import pkg3.B;
import pkg4.C;
import pkg4.D;

/* 접근 지정자별 외부 패키지 클래스 접근 */
public class AccessMember {
	public static void main(String args[]) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.print();
		b.print();
		c.print();
		d.print();
	}
}
