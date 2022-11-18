package test.ch07.package2;
//protected -> 같은 패키지 안에서만 사용가능하다.
import test.ch07.package1.A;
public class C {
	public void method () {
		A a = new A(); // x
		a.field = "1"; //x
		a.method(); //x
	}
}
