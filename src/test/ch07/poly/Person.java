package test.ch07.poly;

public class Person {
	//필드
	public String name;
	//-> this라는 name에 있는 name임.
	
	//생성자
	public Person(String name) {
		this.name = name;
		//-> this.name은 필드의 name이다.
	}
	
	//메소드 -> 메소드는 실행시킴
	public void walk() {
		System.out.println("걷습니다.");
	}
	
}
