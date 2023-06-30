package ch4;

public class p138_no4 {
	public static void main(String[] args) {
		int one = (int) (Math.random() * 6 + 1);
		int two = (int) (Math.random() * 6 + 1);
		
		while(true) {
			int result = one+two;
			if(result == 5) {
				System.out.printf("(%d, %d)\n", one, two);
				return; }
			else {
				System.out.printf("(%d, %d)\n", one, two);
				one = (int) (Math.random() * 6 + 1);
				two = (int) (Math.random() * 6 + 1);
				continue;
			}
		}
	}
}
