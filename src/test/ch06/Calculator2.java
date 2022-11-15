package test.ch06;

public class Calculator2 {
	// 1. 필드 (속성은 필드의 단위)
	/*
	자바에서는 클래스 밖에 변수를 쓸 수가 없어서 static을 붙여서 넣어준다.
	static을 붙여주지 않으면 메인에 인스턴스를 생성해야 메모리가 적제가 된다.
	ex) Calculator2 calc = new Calculator2();
	 */
	static double pi = 3.14159;
	static String model = "calc1";
	static String number = "1";
	static String info;
	//static은 this를 붙이지 않는다.
	//static메소드에서는 static변수만 사용할 수 있고, 인스턴스 변수는 사용할 수 없다.
	//static블록 : static 필드에 대한 초기화 작업이 필요할 때 사용
	static {
		info = model + "_" + number; // calc1_1 -> 값 출력
	}
	
	// 2. 메소드
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus (int x, int y) {
		return x = y;
	}
	
}
