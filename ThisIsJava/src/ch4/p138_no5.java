package ch4;

public class p138_no5 {
	public static void main(String[] args) {
		for(int x = 0; x <= 10; x++) {
			for(int y= 1; y <= 10; y++) {
				if(4 * x + 5 * y == 60) {
					System.out.printf("(%d, %d)\n", x, y);
				}
			}
		}
	}
}
