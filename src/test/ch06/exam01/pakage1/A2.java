package test.ch06.exam01.pakage1;

//클래스는 public, default 접근제한자를 가질 수 있다
public class A2 {
	//private 생성자는 같은 클래스 내에서만 사용한다.
	A2 a3 = new A2("문자열");

	public A2(boolean b) {
		
	}
		
	A2(int b) { 
		
	}
	
	private A2(String s) {
}
}
