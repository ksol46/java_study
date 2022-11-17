package test.ch07;

public class SmartPhoneEx {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		// 생성자로 model, color를 만들어놓아서 메인은 출력하는 곳이니까 출력값을 입력한다.
		
		//phone에서 상속받은 필드 읽기 : 자식 개체에도 부모 필드에 접근 가능.
		//상속을 받으면 부모의 모든것을 받아 쓸 수 있음~~!
		System.out.println(myPhone.model + "," + myPhone.color);
		
		//phone에서 상속받은 메소드 : 자식 객체에서 부모 메소드에 접근 가능
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("네 누구세요?");
		myPhone.hangUp();
		
		myPhone.setWifi(false);
		System.out.println(myPhone.wifi);
		
		
	}

}
