package ch01;

public class changeNum {
	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		
		int temp;
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
