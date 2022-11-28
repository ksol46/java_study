package test.ch11.reflection;

public class Car {

	public static void main(String[] args) throws ClassNotFoundException {
		//리플렉션
		
		//클래스 정보 불러오기
		
		//첫번째 방법
		//Class clazz = Car.class; //-> Car클래스의 정보가 clazz에 들어감.
		//객체 이름이 Class인데 ss로 쓰면 이클립스 클래스가 실행돼서 zz로 쓰고 선언을 헀다.
		
		//두번째 방법
		//Class clazz = Class.forName("test.ch11.reflection.Car");
		//throws 넣어서 알아서 에러를 해결해주도록 한다.
		
		//세번째 방법
		Car car = new Car(); //클래스 객체를 얻는 3번째 방법
		Class clazz = car.getClass();
		
		System.out.println("패키지 이름:" + clazz.getPackage().getName());
		System.out.println("클래스의 간단한 이름:" + clazz.getSimpleName());
		System.out.println("클래스의 전체 이름: " + clazz.getName());
	}

}
