package test.ch13.mainthread;

import java.awt.Toolkit;

public class BeepPrintEx {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep(); //빔소리를 내고
			try {
				Thread.sleep(500); //0.5초 쉰다.
			}
			catch (Exception e) {
				
			}
		}
			
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


