package test.ch10.makeException;

public class Account {
	//필드
	private long balance; //잔고
	
	//생성자
	public Account() {}
	
	//메소드
	//private 인 balance를 가져오기 위해서 get을 붙여서
	//return 값으로 받는다.
	public long getBalance() {
		return balance;
	}
	
	//저축
	public void deposit(int money) { //저축하려는 돈
		balance += money; //잔고에 돈을 누적 합산한다.
	}
	
	
	public void withdraw(int money) throws InsuffException { //출금하려는 돈
		//잔고보다 내가 출금하려는 돈이 더 크면 예외를 발생시킬 것임.
		
		if (balance < money) {
			throw new InsuffException("잔고 부족 : " + (money - balance) + "원이 모자람.");
		}
		
		balance -= money; //잔고에서 출금하려는 돈을 뺀 잔고
	}
	
}
