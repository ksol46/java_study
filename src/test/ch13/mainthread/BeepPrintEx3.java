package test.ch13.mainthread;

import java.awt.Toolkit;

public class BeepPrintEx3 {

	public static void main(String[] args) {
		Thread thread = new Thread() {
									//Runnable은 인터페이스 이다. 오버라이드 실행해줘야 함.
			
			//run(): 실제 스레드가 실행되는 코드
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep(); //빔소리를 내고
					try {
						Thread.sleep(500); //0.5초 쉰다.
					}
					catch (Exception e) {
						
					}
				}
			}};
		
		thread.start();		
		
			for(int i=0; i<5; i++) {
				System.out.println("띵"); //여기를 출력하고
				try {
					Thread.sleep(500); //0.5초 쉰다.
				}
				catch (Exception e) {
					
				}
		}
		}
	}


