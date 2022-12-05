package test.ch15.lamda;
@FunctionalInterface //-> 컴파일 과정에서 추상메소드가 한개인지 확인시켜줌
public interface Calculable {
	void calculate(int x, int y);
	//void calculate(int x);//추상클래스는 한개만 사용 가능하다.
	
	
}
