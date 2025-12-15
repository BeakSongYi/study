package pkg3;

/* 접근 지정자 */
public class B {
	
	public void print() {
		A a = new A();
		
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
//		System.out.println(a.d);
		System.out.println();
	}
	
	public static void main(String args[]) { }
}
