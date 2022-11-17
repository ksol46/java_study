package test.ch06.question;

public class Example2 { //20번
	
	public static int max(int[] arr) {
		//만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.

		if (arr == null || arr.length == 0) {
			return -999999;
			int max = arr[0]; //배열의 첫 번째 값으로 최대값을 초기화 한다.
		//최대값:하나씩 비교
		for(int i=1; i<arr.length; i++) { //배열의 두 번째 값부터 비교한다.
			if ()
		}
		
		}	
		
	}

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열

	}

}
