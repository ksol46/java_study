package test.ch07;
//초음속 비행기
public class SupersonicAirplane extends Airplane {
	//상수 -> 상수는 앞에 static final을 붙여준다.
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	//필드
	public int flymode = NORMAL;

	@Override
	public void fly() {
		//초음속 비행일때만 바뀌어야해서 조건문 작성함
		if (flymode == SUPERSONIC) {
			System.out.println("초음속 비행");
		} else { //normal일때는
			super.fly(); //super.메소드명()-> 부모클래스 메소드 실행함.
		}
	}
	
	
}
