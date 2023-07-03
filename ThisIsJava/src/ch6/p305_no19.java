package ch6;

// Account 클래스
public class p305_no19 {
	
	public final static int MAX_BALANCE = 1000000;
	public final static int MIN_BALANCE = 0;
	int balance = 0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(MIN_BALANCE <= balance && balance <= MAX_BALANCE) 
			this.balance = balance;
	}
}
