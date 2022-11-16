package test.ch06.exam01.pakage1;

//같은 클래스 안에서는 모두 다 실행 가능하다.
public class A {
	public int field1;
	int field2;
	private int field3;
	
	public A() {
		field1 = 1; //ㅇ
		field2 = 1; //ㅇ
		field3 = 1; //ㅇ
		method1(); //ㅇ
		method2(); //ㅇ
		method3(); //ㅇ
	}

	public void method1() {}
	void method2() {}
	private void method3() {}
 	
	
	
	
	
	
	
	
	
	
}
