package test.ch04;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		//문제 1
		//1-1 10 < x && x < 20
		//1-2 
		
			
		}
		/*
		//문제 2
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum = sum + (i*3);
			System.out.println(sum);
		}
		//정답 :
		*/
		
		//문제 3
		
		
		
		//문제12
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("선택>");
			
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				System.out.print("예금액>");
				balance += scanner.nextInt();
			
			
			
			
			
			
			
		}
	}

}
