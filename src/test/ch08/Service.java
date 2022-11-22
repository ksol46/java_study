package test.ch08;
/*
 * 인터페이스는 다중상속을 받을 수 있다. 
 * 
 */
public interface Service {
	//디폴트 메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
	}
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
	}
	
	
//	
//	//private 메소드
//	private void defaultCommon() {
//		System.out.println("defaultMethod1 중복 코드");
//		System.out.println("defaultMethod2 중복 코드");
//	}
//	8버전에서는 적용이 안돼서 나중에 하기로 했음!

	
	//정적 메소드
	static void statictMethod1() {
		System.out.println("statictMethod1 종속 코드");
	}
	static void statictMethod2() {
		System.out.println("statictMethod2 종속 코드");
	}
	
	
}
