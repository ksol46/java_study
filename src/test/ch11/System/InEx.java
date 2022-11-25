package test.ch11.System;

import java.io.IOException;

public class InEx {

	public static void main(String[] args) throws IOException {
		int speed = 0;
		int keycode = 0;
		
		while(true) {
			//enter키를 읽지 않았을 때 실행하는 코드를 만들 것.
			if(keycode != 13 && keycode != 10) {
				//키코드가 13이 아니거나 10이 아니거나
				if(keycode == 49) { //숫자키 1을 읽었을 경우
					speed++;
				} else if(keycode == 50) { //숫자 2
					speed--;
				} else if(keycode == 51) { //숫자 3
					break;
				}
				
				System.out.println("-----------------");
				System.out.println("1.증속 2.감속 3.중지");
				System.out.println("-----------------");
				System.out.println("현재속도=" + speed);
				System.out.println("선택:");
			}
				
			keycode = System.in.read(); //키를 하나씩 읽음
		}
		System.out.println("프로그램 종료.");
	}

}
