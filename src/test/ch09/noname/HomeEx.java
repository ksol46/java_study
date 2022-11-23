package test.ch09.noname;

public class HomeEx {

	public static void main(String[] args) {
		Home home = new Home();
		home.use1();
		home.use2();
		
		//매개변수에 익명객체를 만들어서 사용한다.
		//오버라이드 된 부분이 실행이 된다..
		home.use3(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("난방을 켭니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("난방을 끕니다.");
				
			}
			
		});
		

	}

}
