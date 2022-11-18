package test.ch07.poly;
//추상클래스 만들기 -> 뉴,클래스 만들때 제목 밑에 abstract 체크하고 만들기
public abstract class Animal {
	//일반 메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상 메소드 선언
	// {} 중괄호 없이 선언해줘야 한다.
	//추상 클래스에 추상 메소드를 쓰고 상속을 해오면 에러가 나는데
	//자식 클래스를 오버라이딩을 해온다.
	//추상 메소드는 자식 클래스에서 반드시 오버라이딩이 되어야 한다.
	//부모클래스에서 겹치는게 없을 때 추상 클래스와 메소드를 사용함
	public abstract void sound();
	
}
