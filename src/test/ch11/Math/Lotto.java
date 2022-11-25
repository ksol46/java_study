package test.ch11.Math;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		//선택번호(내가 선택한 번호)
		int[] selectNumber = new int[6]; //로또번호 6개가 저장된 배열
		Random random = new Random(3);
		System.out.println("선택번호: ");
		
		//랜덤 숫자 6개를 생성을 해서 배열에 넣어줌.
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1; //1~45범위의 숫자로 만든다.
													//로또번호는 0이 없기 때문에!!!
		}
		
		System.out.println("");
		
		//당첨번호(컴퓨터에서 주는 번호)
		int[] winNumber = new int[6]; //당첨번호 6개가 저장될 배열
		Random random2 = new Random(5);
		System.out.println("당첨번호: ");
		
		//랜덤 숫자 6개를 생성 해서 배열에 넣어준다.
		for(int i=0; i<6; i++) {
			winNumber[i] = random.nextInt(45) + 1; //1~45범위의 숫자로 만든다.
			System.out.println(winNumber[i] + " ");
		}
		
			System.out.println("");
		
		//당첨여부
		Arrays.sort(selectNumber);	//비교하기 전에 배열 값을 정렬
		Arrays.sort(winNumber);
																//Arrays.equals(, );
		boolean result = Arrays.equals(selectNumber, winNumber);//배열 값들이 같은지 비교
		System.out.println("당첨여부: ");

		
		if (result) {
			System.out.println("당첨 되었습니다.");
		} else {
			System.out.println("당첨 되지 않았습니다.");
		}
			
	}

}
