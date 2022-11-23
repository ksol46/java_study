package test.ch10;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String"); //주어진 클래스를 찾는 코드
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	
	}

}

		//Class.forName("java.lang.String");
		//마우스를 갖다대면 빨간줄이 뜬다.
		//Unhandled exception type ClassNotFoundException
		//컴파일러가 예외처리 코드 여부를 검사하는데
		//그때 일반예외면 try catch문을 써서 사용해야 한다.
