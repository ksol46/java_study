package test.ch09.noname;

import javax.crypto.spec.RC2ParameterSpec;

public class Home {
	//필드에 익명 구현 객체 대입
	//이름이 없는 클래스 {}
	//추상메소드는 반드시 모두 다 구현을 해야 하기 때문에 오버라이드 모두 해준다.
	private RemoteControl rc = new RemoteControl( ) {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
			
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
			
		}
		
	};
	
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	//메소드(로컬 변수 이용)
	public void use2() {
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");
				
			}
			
		};
		
		rc.turnOn();
		rc.turnOff();
	}
	
	//메소드(매개변수 이용)
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
	
	
}
