package test.ch06;

public class KoreaEX {

	public static void main(String[] args) {
		Korea k1 = new Korea("950406-1234567", "감자바");
		//   변수   객체
		k1.name = "김솔";
//		k1.nation = "미국";  -> final 필드이기 때문에 고정되어서 바뀌지 않는다.
		
		System.out.println(k1.name);
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
	}

}
