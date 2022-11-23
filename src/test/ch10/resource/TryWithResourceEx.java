package test.ch10.resource;

public class TryWithResourceEx {

	public static void main(String[] args) {
		//try안에 열고 싶은 리소스 객체 생성
		try(MyResource res = new MyResource("A")) {
			String data = res.read2(); //NumberFormatException 에러 발생
			int value= Integer.parseInt(data); //int형 자동변환
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
