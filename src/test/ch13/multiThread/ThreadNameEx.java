package test.ch13.multiThread;
//메인스레드 1, for문으로 3, 나머지 1개 만들 것.

public class ThreadNameEx {

	public static void main(String[] args) {
		//main 스레드 이름 가져오기
		Thread mainThread = Thread.currentThread(); //현재 실행되고 있는 메인스레드의 이름을 불러오겠다!
		System.out.println(mainThread.getName() + "실행");
		
		//스레드 3개 생성
		for(int i=0; i<3; i++) {
			Thread threadA = new Thread() {
				@Override //또 하나의 클래스를 상속받는 클래스라고 생각한다.
				public void run() {
					System.out.println(getName() + "실행"); //스레드의 이름을 가져온다.
				}
			};
			threadA.start();
		}
		
		//chat스레드 생성
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + "실행"); //스레드의 이름을 가져온다.
			}
		};
		chatThread.setName("chat-thread"); //스레드가 실행되기 전에 이름을 바꾼다.
		chatThread.start();
	}

}



//Thread threadA = new Thread() {
//@Override //또 하나의 클래스를 상속받는 클래스라고 생각한다.
//public void run() {
//	System.out.println(getName() + "실행"); //스레드의 이름을 가져온다.
//}
//};
//threadA.start();
