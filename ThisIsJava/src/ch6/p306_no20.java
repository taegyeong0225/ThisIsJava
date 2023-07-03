package ch6;

import java.util.Scanner;

// BankApplication 클래스
public class p306_no20 {
	public static void main(String[] args) {
		
		Account[] account =  new Account[100];
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		int i = 0;
		
		// 실행
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택>");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("----------");
					System.out.println("계좌 생성");
					System.out.println("----------");
					System.out.print("계좌번호:");
					String num = sc.nextLine();
					account[i].setNum(num);
					System.out.print("계좌주:");
					String name = sc.next();
					account[i].setName(name);
					System.out.print("초기입금액:");
					String firstMoney = sc.nextLine();
					account[i].setName(firstMoney);
					System.out.print("결과: 계좌가 생성되었습니다.");
					i++;
				case 2:
					System.out.println("----------");
					System.out.println("계좌 목록");
					System.out.println("----------");
					while(account[i] != null)
						System.out.println(account[i]);
				case 3:
					System.out.println("----------");
					System.out.println("예금");
					System.out.println("----------");
					System.out.println("계좌번호: ");
					num = sc.nextLine();
					account[i].setName(num);
					System.out.println("예금액: ");
					String input = sc.nextLine();
					int money = Integer.parseInt(input);
					int balance = account[i].getBalance();
					int result = balance + money;
					account[i].setBalance(result);
				case 4: 
					System.out.println("----------");
					System.out.println("출금");
					System.out.println("----------");
					System.out.println("계좌번호: ");
					num = sc.nextLine();
					account[i].setName(num);
					System.out.println("출금액: ");
					String output = sc.nextLine();
					money = Integer.parseInt(output);
					balance = account[i].getBalance();
					result = balance - money;
					account[i].setBalance(result);
					System.out.print("결과: 출금이 성공되었습니다.");
				case 5:
					System.out.println("프로그램 종료");
					run = false;
			}
		}
		
	}
}
class Account {
	private String num;
	private String name;
	private int firstMoney;
	private int balance;
	
	// 생성자 
	public Account(String num, String name, int firstMoney) {
		this.num = num;
		this.name = name;
		this.firstMoney = firstMoney;
	}
	// 게터 세터
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFirstMoney() {
		return balance;
	}

	public void setFirstMoney(int firstMoney) {
		this.firstMoney = firstMoney;
		balance = firstMoney;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
	// 메소드
	public int diposit() {
		return firstMoney;
	}
	public int withdraw(int money) {
		return balance - money;
	}
}
