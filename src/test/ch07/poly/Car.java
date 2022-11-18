package test.ch07.poly;

public class Car {
	//필드로 타이어 객체 선언
	public Tire tire = new KumhoTire();
	
	
	public void run () {
		//타이어를 굴린다. 타이어 객체를 생성해서 쓰면 됨.
		tire.roll();
	}
}
