package test.ch10.resource;

// AutoCloseable: 리소스를 자동으로 닫아주는 기능을 사용하기 위해서 쓰는 인터페이스.
public class MyResource implements AutoCloseable {
	/*Resource 클래스란?
	 * 
	 */
	
	//필드
	private String name;
	
	//생성자
	public MyResource(String name) {
		this.name = name;			//매개변수의 name
		System.out.println("MyResource" + name + "열기");
	}
	
	//메소드 
	public String read1() {				//필드의 name
		System.out.println("MyResource" + name + "읽기");
		return "100";
	}
	
	public String read2() {
		System.out.println("MyResource" + name + "읽기");
		return "abc";
	}

	//implements해줌. 인터페이스 이기 때문에 반드시 구현해줘야 한다.
	@Override
	public void close() throws Exception { //닫아주는 메소드
		//파일을 닫을 때 실행하고 싶은 코드 작성
		System.out.println("MyResource" + name + "닫기");
		
	}
	
}
