package test.ch11.Annotation;

public class Servive {
	
	//필드
//	String test;
	
	//생성자
//	Servive() {}
	
	//메소드
	//메소드위에 올려주면 됨.
	@PrintAnnotation
	public void method1() {}
	
	@PrintAnnotation
	public void method2() {}
	
	@PrintAnnotation(value="#", number=20)
	//괄호안에 넣은 값이 어노테이션-> 인터페이스 프린트어노테이션 안에 들어간다.
	public void method3() {}
	
	
	
}
