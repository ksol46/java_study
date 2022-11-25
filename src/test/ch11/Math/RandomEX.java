package test.ch11.Math;

public class RandomEX {

	public static void main(String[] args) {
		//0.0 ~ 1.0 사이의 숫자 출력(소수, double타입)
		System.out.println(Math.random());
		
		int n = 9; //n개의 정수(내가 얻고싶은 정수의 갯수) 1~9 9개의 정수
		int start = 1; //시작하는 숫자
		
		//랜덤공식이라고 생각하고 외우면 좋다!
		int num = (int) (Math.random() * n) + start;

		System.out.println(num);
	}

}
