package test.ch14.vector;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		//자동형변환 인터페이스.
		Queue<Message> msgQ = new LinkedList();
		
		//메시지 넣기
		msgQ.offer(new Message("sendMain", "홍길동"));
		msgQ.offer(new Message("sendSMS", "김솔"));
		msgQ.offer(new Message("sendkakao", "김영진"));
		
		//메시지 내보내기
			//비어있으면 true라서 ! 써서 반대로 만들어준다.
		while(!msgQ.isEmpty()) {
			Message msg = msgQ.poll();
			System.out.println(msg.command + ", " + msg.to);
		}
	}

}
