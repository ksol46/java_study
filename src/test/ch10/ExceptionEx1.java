package test.ch10;

public class ExceptionEx1 {
	public static void printlength(String data) {
		try { //실행시킬 코드를 작성
			int result = data.length(); //문자 수
			System.out.println("문자 수: " + result);
		} catch(NullPointerException e) { //-> 클래스 이름이고, 변수로 사용하고 있음.
									//->catch문에는 에러가 났을 때 실행시킬 코드를 작성한다.
			//예외처리 정보를 얻는 세가지 방법
//			System.out.println(e.getMessage()); //예외가 발생한 이유만 리턴
//			System.out.println(e.toString()); //예외가 발생한 이유 + 예외의 종류 리턴//
			e.printStackTrace(); //예외가 발생 한 이유 + 예외의 종류 리턴 + 예외가 발생한 곳 출력
			//e : 에러의 원인
		} finally { //finally: 옵셔널하다.
			System.out.println("마무리 실행\n");
		}
		
		/*try -> catch -> finally 순으로 지나가는데
		 * catch에서 에러가 나도 무조건 finally를 실행시킨다.
		 * 
		 */
		
		
		
		
		
		
		int result = data.length(); //문자 수
		System.out.println("문자 수: " + result);
	}
	public static void main(String[] args) {
		System.out.println("프로그램 시작\n");
		printlength("ThisIsJava");
		printlength(null);
		System.out.println("프로그램 종료");
	}
		
}

	/* main에서 순서대로 실행한다.
	 * 두번째줄까지는 잘 실행이 됨.
	 * printlength(null); -> null값이 printlength(String data)의 string data로 들어가는데
	 * null은 length 값이 없으니까 에러가 남.
	 * 그래서 예외처리 해줘야한다.
	 */
