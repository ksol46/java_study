package test.ch05;

public class EqualsEX {

	public static void main(String[] args) {
		//String은 객체.
		//String 리터럴이 같으면 같은 주소를 가르킨다.(참조한다)
		String strVar1= "홍길동";
		String strVar2= "홍길동";

		if (strVar1 == strVar2) {
			System.out.println("srtVar1와 strVar2는 참조가 같음");
		} else {
			System.out.println("srtVar1와 strVar2는 참조가 다름");
		}
		
		//값을 비교할 땐 equals 함수를 사용한다.
		if (strVar1.equals(strVar2)) {
			System.out.println("srtVar1와 strVar2는 문자열이 같음");
		}
		
		
		//new로 생성하면 같은 값이라도 가르키는 주소가 다르다.
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if (strVar3 == strVar4) {
			System.out.println("srtVa3과 strVar4는 참조가 같음");
		} else {
			System.out.println("srtVar3과 strVar4는 참조가 다름");
		}
		
	}

}
