package test.ch09;
	
public class AEx {

	public static void main(String[] args) {
	
		/*
		//외부에서 B클래스 사용하기.
		//앞쪽에 타입을 적는다.
		A a = new A();
		
		A.B b = a.new B();
		*/
		
		A a = new A();
		a.useB();
		
		}

	}


