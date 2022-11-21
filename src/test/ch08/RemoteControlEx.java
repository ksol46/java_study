package test.ch08;

public class RemoteControlEx {
//같은 인터페이스 파일을 상속받고 있을때만 이렇게 사용가능.
	public static void main(String[] args) {
		//같은 인터페이스 파일을 상속받고 있을때만 이렇게 사용가능.
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println("============================================");
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery();
		
		
		/*
		RomoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio(); //오디오로 교체
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		//static의 특성을 가졌기 때문에 객체를 생성하지 않고 호출한다.
		System.out.println(RomoteControl.MAX_VOLUME);
		System.out.println(RomoteControl.MIN_VOLUME);
		*/
		

	}

}
