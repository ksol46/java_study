package test.ch07;

public class ChildEx {

	public static void main(String[] args) {
		/*
		//자식 객체 생성
		Child child = new Child();
		//타입, 변수 선언
		Parent parent = child; //자동 타입 변환 -> 부모가 자식을 품고 있음
		parent.method1();
		parent.method2();
		//*오버라이드 된 메소드를 불러온다.
		parent.method3();
		//*자식 객체에 있는 메소드는 불러오지 못한다.
		
		parent.a = 2;
		parent.b = 1; //자식 객체에 있는 필드는 불러오지 못한다.
	}
	*/
		
		//강제타입 변환은 자동타입이 한번 일어나고 할 수 있다.
		Parent parent = new Child(); //자동타입 변환
		
		//instanceof: 객체타입 확인을 위한 자바에서 제공하는 연산자.
		
		if (parent instanceof Child) {
			//parent 매개변수가 child객체를 담고 있니?라고 물어봄
			//true, false로 답함
			
			//parent가 Child객체를 갖고 있지 않다면 강제타입 변환을 할 수 없으므로
			Child child = (Child)parent; //강제타입 변환
			child.b = 1; //자식객체에 있는 필드 접근 가능
			child.method3(); //자식 메소드에 있었던 필드에 접근 가능
		}
		
		
		Child child = (Child)parent; //강제타입 변환
		child.b = 1; //자식객체에 있는 필드 접근 가능
		child.method3(); //자식 메소드에 있었던 필드에 접근 가능
}
}
