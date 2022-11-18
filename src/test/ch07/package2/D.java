package test.ch07.package2;

import test.ch07.package1.A;

public class D extends A {
	public D() {
		super(); //A클래스의 생성자 호출 //에러없이 생성됐음
	}
	
	public void method1() {
//		super.field = "1";
//		super.method();
		//필드, 메소드는 super를 통해 가져오는데
		this.field = "1";
		this.method();
		//this도 사용가능하다.
	}
	
	public void method () {
		A a = new A(); //x
		a.field = "1"; //x
		a.method(); //x
	}
	//B에 있는 메소드를 복사 붙여넣기 했는데 에러났음.
	//protected 사용시 직접 객체를 생성해서 사용할 수는 없고
	//상속을 통해 사용할 수 있다.
	
}
