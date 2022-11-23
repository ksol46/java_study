package test.ch10;

public class ThrowEx {

	public static void main(String[] args) {
		try {
			findClass(); //메소드를 호출한 곳에서 예외처리 발생
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
								//매개변수 뒤에 throw 라고 적어준다.
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
