package ch01_practice;

public class No_11 {
	public static void main(String[] args) {
		int a = 1;
		System.out.println(a);
		
		if(true) {
			int b = 2;
			if(true) {
				int c = 3;
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
			System.out.println(a);
			System.out.println(b);
			//System.out.println(c);
		}
		System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
	}
	
}
