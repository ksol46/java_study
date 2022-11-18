package test.ch07.poly;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//Tire객체를 넣어준다.
//		myCar.tire = new Tire(); //-> 회전합니다가 찍힘.
//		myCar.tire = new HankookTire();//-> 오버라이드 된 아이가 실행이 되어서 한국타이어가 빠르게 회전합니다. 실행이 된다.
		myCar.tire = new KumhoTire();
		myCar.run();

	}

}
