package ch4;

public class p122_case {
	public static void main(String[] args) {
		String value = "2";
		
		switch(value) {
			case "1":
				System.out.print(false);
			case "2":
				System.out.println(1);
				System.out.println(true);
			default:
				System.out.println(true);
				
		}
		
		// java12 표현문, break문 생략 가능
		switch(value) {
		case "1" -> System.out.print(false);
		case "2", "3" ->
		{
			System.out.println(1);
			System.out.println(true);
		}
	}
		
		
		String a = switch(value) {
		case "1" -> "일";
		case "2" -> 
		{
			// java13 표현문 바로 값 대입
			System.out.println(true);
			yield "이";
		}
		default -> "아님";
			};
			
			System.out.println(a);
		}
	
	
}
