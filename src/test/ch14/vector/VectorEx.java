package test.ch14.vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		//List가 Vector의 부모 인터페이스(자동형변환)
		//List<Board> list2 = new Vector<>();
		//list2.add(null);
		
		Vector<Board> list = new Vector<>();
		//Vector는 동기화가 되어 있어서 순차적으로 실행되는것 같이 보임.
		
		//ArrayList<Board> list = new ArrayList<>();
		/*ArrayList는 동기화 되지 않은 상태
		 동기화가 되지 않아서 어느정도 돌리다가 중간에 스레드b가 들어왔을수 있어서
		 나오는 값이 다를 수 있다.
		 */
		
		Thread threadA = new Thread() {

			@Override
			public void run() {
				for(int i=1; i<1000; i++) {
					list.add(new Board("제목","내용","글쓴이"));
				}
			}
			
		};
		
		Thread threadB = new Thread() {

			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					list.add(new Board("제목","내용","글쓴이"));
				}
			}
			
		};
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 모두 종료 될 때까지 메인 스레드를 기다리게 하는 기능
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
			
		}
		
		int size = list.size();
		System.out.println("총 객체 수:" + size);
		System.out.println();

	}

}
