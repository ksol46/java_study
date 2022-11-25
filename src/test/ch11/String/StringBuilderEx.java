package test.ch11.String;

public class StringBuilderEx {

	public static void main(String[] args) {
		String/*Builder*/ data = new StringBuilder()
				.append("DEF") //문자열 끝에 추가
				.insert(0, "abc") //문자열을 지정위치에 넣어줌 (위치, 문자열)
				.delete(3, 4)//문자열 일부를 삭제 (시작 위치, 끝 전 위치)
				.toString();//완성된 문자열을 스트링 타입으로 바꿔준다.
		
		System.out.println(data);
	}
	

}
