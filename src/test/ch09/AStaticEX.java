package test.ch09;

public class AStaticEX {

	public static void main(String[] args) {
		
		//static클래스는 객체를 생성하지 않고도 사용할 수 있다.
		//지금 여기서는 AStatic은 클래스 이름일뿐 따로 생성한것은 아니다.
		AStatic.B b = new AStatic.B();

		System.out.println(b.field1);
		b.method1();
		
	}

}
