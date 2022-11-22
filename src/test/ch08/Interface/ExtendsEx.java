package test.ch08.Interface;
//interface끼리 상속을 받을 수 있다.
public class ExtendsEx {

	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		InterfaceA ia = impl; //자동 형변환
		ia.methodA(); //ㅇ
		//ia.methodB(); //X 오류 남
		//ia.methodC(); //X 오류 남
		//위에 A만 만들어서 a가 실행된다.
		/*
		B,C도 출력되게 하려면
		InterfaceB ib = impl;
		ib.methodB();
		이렇게 만들어주고,
		InterfaceC ic = impl;
		ic.methodC();
		ib.methodB();
		ia.methodA();
		->InterfaceC는 InterfaceA, InterfaceB를 상속받아서 모두 다 불러올 수 있다.
		*/
	}

}
