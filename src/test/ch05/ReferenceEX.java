package test.ch05;

public class ReferenceEX {

	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };
		int sum = 0;
		
		for (int score : scores) {
			System.out.println(score);
			sum += score;
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int[] oldIntArray = {1, 2, 3}; //3개
		int[] newIntArray = new int[5]; //5개
		
		//배열 복사-> 배열의 크기 늘려줌 / 3개짜리를 5개짜리로 만들어줌.
//		for (int i=0; i<oldIntArray.length; i++) {
//			newIntArray[i] = oldIntArray[i];
//		}
		
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);
		//System.arraycopy(원본배열, 원본배열 시작 인덱스, 새 배열, 새 배열 붙여넣고 시작 인덱스, 복사 항목 수)
		
		for (int i=0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ", ");
		}
		
		
		
		
		
		/*
		String[] strArray = new String[3];
		strArray[0] = "java";
		strArray[1] = "java"; //리터럴 문자가 0,1 같아서 같은주소로 들어감.
		strArray[2] = new String("java");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2])); //equals는 순수하게 값을 비교해서 "java"로 같아서 true임.
		*/
		/*
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2; //2의 주소를 3에게 넘겨줌
		
		System.out.println(arr1 == arr2); //값이 아닌 주소를 비교해주기 때문에 false.
		System.out.println(arr2 == arr3); //주소 비교 -> true.
		
		
		//배열에서 null 사용하지 않는다. 에러남.
		int[] intArray = null;
		intArray[0] = 10;
		*/
		
	
	}
}
