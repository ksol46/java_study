package test.ch09.noname;

public class Car {
	//필드
	private Tire tire1 = new Tire();
	
	//필드에 Tire객체 대입
	//필드에서 익명 자식 객체 사용
	//<<<필드에서의 익명객체>>>
	//Tire가 부모클래스가 되고,
	//{}안에 있는게 자식클래스가 되기 때문에 오버라이드가 가능한 것.
	//이름없는 클래스도 만들고, 동시에 상속을 해준다.
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("한국 타이어가 굴러답니다.");
		}
	};
	
	//메소드 생성
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	//메소드에서의 익명 객체
	//로컬변수에 익명 자식 객체 사용
	public void run2() {
		Tire tire = new Tire() {

			@Override
			public void roll() {
				System.out.println("금호 타이어가 굴러답니다.");
			}
			
		};
		
		tire.roll();
	}
	
	//메소드(매개변수 이용)
	public void run3(Tire tire) {
		tire.roll();
	}
}
