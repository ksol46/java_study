package test.ch06;

public class Car {
	//1. 필드: 객체의 데이터를 저장!!!!
	//주석 추가
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
//	boolean start; //시동여부

	
	//생성자를 명시하지 않으면 컴파일 과정에서 생성자를 생성해준다.
	
	Car() {}
	
	Car(String model) {
//		this.model = model;
		this(model, "은색", 250);
	}
	
	Car(String model, String color) {
//		this.model = model;
//		this.color = color;
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	/*
	  int, short, byte: 0
	  long: 0L
	  char: '\u0000'
	  float: 0.0f
	  double: 0.0
	  boolean: false
	  
	  String: null(클래스는 초기값이 null)
	 */
	
}