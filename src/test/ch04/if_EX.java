package test.ch04;

public class if_EX {

	public static void main(String[] args) {
		int score = 75;
		String name = "솔";
		
		if (score >= 90) {
			System.out.println("90점 이상입니다");
		} if (name.equals(name)) {
			System.out.println(name +"입니다");
		}else if(score >=80) {
			System.out.println("80점 이상입니다");
		} if (name.equals(name)) {
			System.out.println(name +"입니다");
		} else if(score >=70) {
			System.out.println("70점 이상입니다");
		} else {
			System.out.println("70점 미만입니다");
		}
		
		
		int num = (int) (Math.random()*6) +1;
		
		if (num == 1) {
			System.out.println("1번");
		} else if (num == 2) {
			System.out.println("2번");
		} else if (num == 3) {
			System.out.println("3번");
		} else if (num == 4) {
			System.out.println("4번");
		} else if (num == 5) {
			System.out.println("5번");
		} else {
			System.out.println("6번");
		}
		
		//byte, char, short, int, long, String
		
		char grade = 'B';
		
		switch(grade) {
		case 'A':
			System.out.println("1번");
			break;
		case 'B':
			System.out.println("2번");
			break;	
		case 'C':
			System.out.println("3번");
			break;
		case 'D':
			System.out.println("4번");
			break;
		case 'E':
			System.out.println("5번");
			break;
		default:
			System.out.println("6번");
			break;
		}
		
		
		/*
		if (score >= 90) {
			System.out.println("90점 이상입니다");
		} else {
			System.out.println("90점 이상이 아닙니다");
		}
		*/
		
		
	}

}
