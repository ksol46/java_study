package test.ch07;

public class SupersonicAirplaneEX {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff(); //1. 처음은 그냥 부모클래스 이륙을 찍음.
		sa.fly(); //2. 두번째도 부모클래스 일반비행을 찍는데
		// 메인에 조건문에서 normal이기 때문에 그냥 일반비행으로 찍힌것임.
		sa.flymode = SupersonicAirplane.SUPERSONIC;
		//3. flymode를 SUPERSONIC으로 바꾸었음 메인에 조건문을 작성해서 바꿔줌
		//바뀌었기 때문에 초음속비행으로 찍는다.
		sa.fly();

	}

}
