package test.ch06.question;

public class Account {
	private int balance; //잔고
	public static final int MIN_BALANCE = 0; 
	public static final int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		//1. 0 <= balance <= 1,000,000 범위 일때 this.balance = balance;
		//정상범위가 아니면 현재 balance 값을 유지
		this.balance = balance;
	} 

}
