package pkg2;

/* 외부 패키지 클래스 사용 - 패키지 풀네임 */
public class PackageImport_1 {

	public static void main(String args[]) {
		
		//패키지 풀네임 기재
		pkg1.A a = new pkg1.A();
		
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}
}
