package test.ch07.poly;

public class Student extends Person { // Person을 상속해왔음
	//필드 -> 변수 타입, 정해서 입력함
	public int studentNo; //학번
	//생성자
	public Student(String name, int studentNo) {
		super(name);
		//-> 위에 있는 name인데 부모생성자 name을 호출했다.
		this.studentNo = studentNo;
	}
	//메소드 -> void는 리턴값이 없을때 쓰는 변수 타입!
	public void study() {
		System.out.println("공부를 합니다.");
	}
	
	
	
}
