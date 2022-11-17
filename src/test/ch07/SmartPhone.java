package test.ch07;
//자식클래스
public class SmartPhone extends Phone {
	//필드
	public boolean wifi;
	
	//생성자 -> 생성자 이름은 클래스 이름과 같게 해준다!!!
	public SmartPhone(String model, String color) {
		super(model,color); //super를 쓰면 부모 생성자 호출한다.
		//super();
		System.out.println("자식 생성자 실행");
		this.model = model; //초기값을 넣어줌
		this.color = color; //초기값을 넣어줌
	}
	
	//메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
	
	
	
	
}
