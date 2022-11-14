package test.ch06;

public class Calculator2EX {

	public static void main(String[] args) {
//		Calculator2 calc2 = new Calculator2(); //객체생성, 인서턴스를 생성
//	carc2.pi = 10;
	Calculator2.plus(1, 2); //객체 (인스턴스)를 생성하지 않아도 클래스를 통해서 접근 가능
	Calculator2.minus(1, 2);
	System.out.println(Calculator2.pi);
}
}
	
//	인스턴스
//	객체를 할당받은 상태
//	인스턴스 멤버
//	객체에 소속된 필드나 메소드를 가르킴.

