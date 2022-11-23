package test.ch10.makeException;


//사용자 정의 예외 클래스
public class InsuffException extends Exception {
	//생성자는 두 개를 만든다.
	public InsuffException() {
		
	}
	//한 개는 메세지를 받아야해서 메시지를 입력해준다.
	public InsuffException(String message) {
		super(message);
	}

}
