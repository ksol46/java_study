package test.ch07.poly;

public class InstanceofEx {

	//메소드를 만든다.
	//static은 객체를 생성하지 않아도 바로 불러와서 사용 가능하다.
	                            //(Person person = new Student("김길동", 10));
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
		
		//person이 Student 객체를 갖고 있냐? 라고 물어보는 것과 같다. 확인시켜줌
		if (person instanceof Student) {
			//자식 객체를 먼저 선언해주고 = 강제타입변환을 실행해봄
			Student student = (Student)person;
			student.study();
			System.out.println(student.studentNo);
			
			
		}
		
		
		}
	
	public static void main(String[] args) {
		//객체 생성했음
		//()안에 값을 넣어주는 순간 위에 Person변수의 person에 값이 들어간다.
		//Person클래스에 생성자 Person에도 영향을 주는 것 같은디????
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		//student는 생성자를 두개 생성을 해주어서 값을 두 개를 넣어야 하는데
		//
		Person p2 = new Student("김길동", 10);
		personInfo(p2);
		

	}

}
