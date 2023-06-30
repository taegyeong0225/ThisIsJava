package ch4;

import java.util.Scanner;

public class p139_no7 {
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-----------------------------------");
			
			System.out.println("선택 > ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			int  balance = 0;
			
			switch(choice) {
				case 1 -> {
					System.out.println("예금액 >");
					int diposit = sc.nextInt();
					balance += diposit;
				}
				case 2 -> {
					System.out.println("출금액 >");
					int  withdraw = sc.nextInt();
					balance -= withdraw;
				}
				case 3 -> {
					System.out.printf("잔고 > %d\n", balance);
				}
				case 4 -> {
					run = false;
				}
			}
		}
		System.out.print("프로그램 종료");
		
	}
}
