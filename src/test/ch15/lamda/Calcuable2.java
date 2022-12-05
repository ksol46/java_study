package test.ch15.lamda;

@FunctionalInterface //컴파일 과정에서 추상메소드가 한개만 있는지 확인
public interface Calcuable2 {
	//추상메소드 생성, 한개만 만들어줘야한다.
	double calc(double x, double y);
}
