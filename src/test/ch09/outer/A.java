package test.ch09.outer;

public class A {
	//A클래스의 인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	//A클래스의 정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	//인스턴스 멤버 클래스
	class B {
		void method() {
			field1 = 10;
			method1();
			// 위 둘은 아무 문제가 없다.
			
			field2 = 10;
			method2();
			// 위 둘도 아무 문제가 없다.
			//바깥클래스 B의 필드와 메소드 모두 접근 가능하다!!
		}
	}
	//정적 멤버 클래스
	static class C {
		void method() {
			field1 = 10;
			method1();
			// 위는 에러남.
			//정적 멤버 클래스에서는 바깥 클래스의 인스턴스 필드와 메소드에 접근 할 수 없다.
			field2 = 10;
			method2();
			//위는 문제가 없음.
		}
		
		
	}
}
