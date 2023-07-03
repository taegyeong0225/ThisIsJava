package ch5;

import java.util.Scanner; 

public class p199_no9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		int stunum = 0;
		int[] scores = null;
			
		while(run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택>");
			
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.print("학생수>");
					stunum = sc.nextInt();
					scores = new int[stunum];
					for (int i = 0; i < stunum; i++) {
						scores[i] = 0;
					}
					break;
				case 2:
					for(int i = 0; i < stunum; i++) {
						System.out.printf("scores[%d]>", i);
						scores[i] = sc.nextInt();
					}
					break;
				case 3:
					for(int i = 0; i < stunum; i++) {
						System.out.printf("scores[%d]: %d\n", i, scores[i]);
					}
					break;
				case 4:
					int top;
					top = scores[0];
					for(int i = 1; i < scores.length; i++) {
						if(top < scores[i])
							top = scores[i];
					}
					System.out.printf("최고 점수: %d\n", top);
					
					int sum = 0;
					int count = 0;
					for(int i = 0; i < scores.length; i++) {
						sum += scores[i];
						count++;
					}
					double avg = (double)sum / count;
					System.out.printf("평균 점수: %4.1f\n", avg);
					break;
				case 5: 
					System.out.print("프로그램 종료");
					run = false;	
					break;
			}
		}
	}
}
