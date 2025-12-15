package staticPkg;

/* 인스턴스 필드, 정적 필드 */
class A {
	int m = 3;
	static int n = 5;
}
class B {
	
	int a;
	static int b;
	
	void print1() {
		System.out.println("instance 메서드");
	}
	static void print2() {	//객체없이 사용가능
		System.out.println("static 메서드");
		
		//a 사용 불가 (정적 필드, 메서드는 클래스 로딩 시 초기화 되므로 생성자 호출 이전 시점이라 인스턴스 필드인 a는 초기화 안된 상태)
		//System.out.println(a);
	}
	static {	//정적 필드 초기화 블록
		b = 5;
		System.out.println(b);
	}
}
public class staticField_1 {
	
	public static void main(String args[]) {
		A a1 = new A();
		A a2 = new A();
		
		a1.m = 10;
		a2.n = 50;
		
		a2.m = 20;
		a2.n = 100;		//클래스 메모리에 위치 (힙 메모리의 객체 내부에선 클래스 메모리에서의 데이터 위치값 참조)
		
		System.out.println(a1.m);
		System.out.println(a1.n);

		System.out.println(a2.m);
		System.out.println(a2.n);
		System.out.println();
		
		/* 인스턴스, 정적 메서드 호출 */
		B b = new B();
		b.print1();
		
		B.print2();
		
	}
}
