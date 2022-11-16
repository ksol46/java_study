package test.ch06.exam01.pakage2;

import test.ch06.exam01.pakage1.A;
import test.ch06.exam01.pakage1.B;

public class C {
	public C() {
		
		
		A a = new A();
		
		a.field1 = 1; //ㅇ
		a.field2 = 1;//X
		a.field3 = 1; //x
		a.method1(); //ㅇ
		a.method2(); //X
		a.method3(); //x
	}
	
	
	
	
	
}
//	A a = new A(); //A클래스(default) 접근 불가
//	B b = new B();

//	A a1 = new A(true); //A클래스(default) 접근 가능 //ㅇ
//	A a2 = new A(1); //x
//	A A3 = new A("문자열"); // X


