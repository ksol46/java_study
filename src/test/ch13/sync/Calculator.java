package test.ch13.sync;

public class Calculator {
	private int memory;
	

	public int getMemory() {
		return memory;
	}
	
	//메소드에 동기화 걸기
	//1. 동기화를 시킬 메소드의 리턴받는 값 전에 synchronized를 쓰고
	public synchronized void SetMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); //2초간 정지
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
	
	//코드 블록에 동기화 걸기 (내가 동기화를 걸기를 원하는 코드 범위 선택)
	//2. 전체 메소드가 아닌 내가 동기화를 걸기를 원하는(값을 지키고 싶은 만큼의 부분) 코드 범위 선택
	public void SetMemory2(int memory) {
		synchronized (this) { //-> 지금 현재 메소드에서 사용하고 있는 this메모리!!!
			this.memory = memory;
			try {
				Thread.sleep(2000); //2초간 정지
			} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		}
	}
	
	
	
	
	
}

