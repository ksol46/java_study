package test.ch06;

public class This {
	//필드
	String model;
	int speed;
	
	//매개변수명이 필드에 있는 데이터명과 같으면 필드데이터에는 this를 붙인다.
	This(String model) {
		this.model = model;
		
	void setSpeed(int speed) {
			this.speed = speed;
		}
		
	void run(int speed) {
		//같은 클래스 간의 메소드를 호출시 this 생략가능
			this.setSpeed(100);
			System.out.println(this.model + "," + this.speed) //this생략가능
		}
	}
}
