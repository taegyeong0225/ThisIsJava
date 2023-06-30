package ch4;

public class p138_no2 {
	public static void main(String[] args) {
		String grade = "B";

		int score1 = switch (grade) {
		case "A" -> 100;
		case "B" -> 100 - 20;
		default -> 60;
		};
		
		System.out.print(score1);
	}
}
