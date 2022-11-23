package test.ch09;

public class ALocal {
	
	void useB(int arg) {=//final int age
		
		//함수 내부에서 쓰이는 로컬변수 생성
		int var = 1; //=final int var 8부터 final생략됨. 바꿀 수 없음.
		//메소드 안에서는 값을 언제든지 바꿔줄 수 있지만 메소드 밖에서는 할 수가 없다.
		class B {
			//인스턴스 필드 생성해줬음.
			int field1 = 1;
			
			//생성자 만듦.
			B() {
				System.out.println("B 생성자 실행");
			}
			
			//인스턴스 메소드 만듦.
			void method1() {
				System.out.println("B 메소드 실행");
			}
			
			//메소드 한개 더 만들어줌.
			void method2() {
				arg = 2;
			}
			
			
		}
		
		//클래스 안 메소드 안에서 객체 생성
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
	}
	
}
