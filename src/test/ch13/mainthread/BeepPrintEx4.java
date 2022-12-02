package test.ch13.mainthread;

import java.awt.Toolkit;

public class BeepPrintEx4 extends Thread {

	//run():실제 thread가 실행되는 코드, 메인 전에 소스->오버라이드로 만들어줬음!!
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
	}

	public static void main(String[] args) {
		Thread thread= new BeepPrintEx4();//오른쪽 자식 객체를 가지고 온다.
		thread.start(); //시작
		
		
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


