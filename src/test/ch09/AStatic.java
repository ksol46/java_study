package test.ch09;

public class AStatic {
	//접근제한자 : public, private, default 사용가능
	//지금은 default, 생략되어 있다!
	static class B {
		int field1 = 1;
		
		B() {
			System.out.println("b생성자 실행");
		}
		
		void method1() {
			System.out.println("b메소드 실행");
		}
		
		
	}
	//1. 인스턴스 필드로 사용
	B field = new B();
	
	//static 클래스이기 때문에 적정 필드 값으로 사용
	static B field2 = new B();
	
	//2. 생성자에서 사용
	AStatic() {
		B b = new B();
	}
	
	//3. 인스턴스 메소드에서 사용가능
	void method1() {
		B b = new B();
	}
	
	//정적 메소드에서 사용가능
	static void method2() {
		B b = new B();
	}
	
	
	
	
	
}
