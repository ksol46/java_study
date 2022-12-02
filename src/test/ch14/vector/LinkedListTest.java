package test.ch14.vector;

import java.util.*;
//수정 삭제 할 것이 많을 땐 LinkedList를 쓰는게 좋다.
public class LinkedListTest {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		LinkedList<String> list2 = new LinkedList<String>();
		
		//시작 시간과 끝 시간을 저장할 변수 선언
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i)); //0번 인덱스 값이 계속 수정됨
		}
		
		endTime = System.nanoTime();
		
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime-startTime) );
		
		
				startTime = System.nanoTime();
				for(int i=0; i<10000; i++) {
					list2.add(0, String.valueOf(i));
				}
				
				endTime = System.nanoTime();
				
				System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", (endTime-startTime) );
	}

}
