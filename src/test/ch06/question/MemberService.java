package test.ch06.question;

public class MemberService {
	 String id;
	 String password;
	
	//메소드는 매개값 id가 "hong", 매개값 password가 "12345" 일 경우에만 true로 리턴
	boolean login(String id, String password) {
		if (id == "hong" && password == "12345") {
			return true;
		} else {
			return false;
		}
	}
	
	// logout ( ) 메소드는 id + "님이 로그아웃 되었습니다"가 출력되도록 할 것
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다");
	}
	
	
	
}