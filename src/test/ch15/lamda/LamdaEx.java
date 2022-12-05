package test.ch15.lamda;

public class LamdaEx {

	public static void main(String[] args) {
//		action(new Calculable() { //하위클래스 + 오버라이드
//			@Override
//			public void Calculate(int x, int y) {
//				System.out.println(x+y);
//			}
//		});
		
		//실행문이 하나 일 때는 중괄호 생략가능
		action((x,y) -> {
			System.out.println(x + y);
		});

		action((x,y) -> {
			System.out.println(x - y);
		});
		
		//매개변수가 하나일 때 괄호 생략가능
//		action(x -> {
//			System.out.println(x);
//		});
		
	}
		public static void action(Calculable calculable) {
		int x = 10;
		int y = 4;
		calculable.calculate(x, y);
		
		}
		
		

	}

