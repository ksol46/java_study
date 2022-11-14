package test.ch04;

public class While_EX {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		//while안에 있는 조건식이 참이면 실행함.
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
//		}
		
//		while (i <=100) {
//			sum += i;
//			i++;
//		}
//		
//		System.out.println(sum);
		
		
		//1이 더해져서 2를 찍고 while에서 10보다 작아서
		//다시 do로 넘어가서 3을 찍음 10까지 반복함.
		//11을 찍기는 하는데 false임
		do {
			i++;
			System.out.println(i);
		} while(i<=10);

	}

}
