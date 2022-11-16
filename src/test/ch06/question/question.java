package test.ch06.question;

public class MemberService { //연습문제 클래스 - 15번
	String id;
	String password;
	
	boolean login(String id, String password) {
		// id가 hong이고 password 12345 일 때 - 조건문을 써준다.
		if (id == "hong" && password == "12345") {
			return true;
		} else {
			return false;
		}
	}

	
	void logout(String id) {
		System.out.println(id +"님이 로그아웃 되었습니다.");
	}	


	
	public static void main(String[] args) {
		MemberService memberService = new MemberService();

		boolean result = memberService.login("hong", "12345");

		if(result) {
		     System.out.println("로그인 되었습니다.");
		     memberService.logout("hong");
		} else {
		     System.out.println("id 또는 password가 올바르지 않습니다.");

    }
		
	}
	
		
}
	
	
	
	
	
	
	

