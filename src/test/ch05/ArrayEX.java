package test.ch05;

public class ArrayEX {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		/*
		 int, short, byte: 기본값 0
		 long: 0L
		 char: '\u0000'
		 float: 0.0f
		 double: 0.0
		 boolean: false
		 
		 String은 클래스이기 때문에 초기값이 null이다.
		 */
		
		for (int i=0; i<3; i++) {
//			System.out.println(arr1[i]);
			arr1[i] = 10;
		}
		
		for (int i=0; i<3; i++) {
			System.out.println(arr1[i]);
		}
		
//		double[] arr2 = new double[3];
//		String[] arr3 = new String[3];
//		arr.3length = 10; length는 값을 읽을수만 있다.		
		
		
		
		
		
		
		/*
//		String season[] = {"Spring", "Summer", "Fall", "Winter"};
//		String[] season2[]; 선언만
//		배열표시 자유롭게 가능

		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
		season[1] = "여름";
		System.out.println(season[1]);
		System.out.println();
		
		//---------------------------------
		
		int[] scores = { 83, 90, 87 };
		
		//총합, 평균
		
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		
		//변환해줌
		double avg = (double) sum/3;
		
		System.out.println("총합="+ sum + ", 평균=" + avg);
		*/
	}

}
