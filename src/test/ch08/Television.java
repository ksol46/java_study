package test.ch08;

public class Television implements RemoteControl  {
	
	//volume필드
	private int volume;
	
	//*인터페이스에 정의된 추상 메소드는 반드시 구현을 해줘야 한다.
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		//상수라서 static 자동으로 붙어서 객체생성 없이 그냥 바로
		//RomoteControl.MAX_VOLUME 넣어준다.
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재 TV 볼륨 : " + volume );
		
	}
}
