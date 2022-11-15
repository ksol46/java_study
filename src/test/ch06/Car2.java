package test.ch06;

public class Car2 {
	//인스턴스 필드
	int speed;
	//인스턴스 메소드, void가 붙는 메소드는 return이 없다.
	//static이 아니라서 this가 붙었음
	void run() {
		System.out.println(this.speed + "으로 달립니다.");
		
	void run2() {
		this.run();
	}
			System.out.println(this.speed + "으로 달립니다.");
		
	}
	
//	static {
//		this.speed = 200;//x
//		this.run(); //x
//	}
	
	
	//정적(static) 메소드
	static void simulate() {
//		this.speed = 200; -> 이런식으로는 안됨
//		this.run(); -> 이것도 에러남.
//		위와 같이 하면 안됨. 밑에 식대로 변수를 따로 만들고 불러야 실행이 된다.
		Car2 myCar = new Car2();
		
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		simulate();
		
		Car2 myCar = new Car2();
		
		myCar.speed = 60;
		myCar.run();

	}

}
