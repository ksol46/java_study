package test.ch06;

public class Calculator {
	//메소드 오버로딩 : 같은 이름의 메소드 여러개를 만든다.
	//메소드 작성 : 내가 return하려는 값으로 써야한다.
	double areaRectangle(double width) { //정사각형의 넓이
		return width * width;
	}
	
	//매개변수의 순서, 갯수, 타입 중 하나가 달라야한다.
	//width 를 h로 바꿔도 타입이 같아서 추가 해줘서 타입 자체를 바꿔줘야 함.
	double areaRectangle(double width, double height) { //직사각형의 넓이
		return width * height;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	//리턴값이 없는 메소드 선언 반드시 void를 사용한다.
	void powerOn() {
		System.out.println("전원을 켭니다.");
		//return;
	}
	
	//리턴값이 없는 메소드 선언 반드시 void를 사용한다.
		void powerOff() {
			System.out.println("전원을 끕니다.");
		}
	
		//int형으로 리턴값이 있는 메소드
		int plus(int x, int y) {
			int result = x + y;
			return result;
			
		}
	
	//double형으로 리턴값이 있는 메소드
		double divide(int x, int y) {
			double result = (double) x / (double) y;
			return result;
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
	
}
