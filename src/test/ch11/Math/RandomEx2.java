package test.ch11.Math;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		Random rand = new Random(); //Random 클래스는 import해줘야함!
		
		for (int i=0; i<=5; i++) {
								//nextInt(n) : int타입의 랜덤한 숫자 리턴(0<= ~ <n)
											//0부터 n이전까지의 숫자
			System.out.print(rand.nextInt(10) + ",");
		}

		System.out.println("");
		
		Random rand2 = new Random(11); //(___) 괄호안에 seed를 넣어줌
									/*
									 * 
									 */
		
		for (int i=0; i<=5; i++) {
			System.out.print(rand2.nextInt(10) + ",");
		}
		
	}

}
