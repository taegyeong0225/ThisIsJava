package ch5;

public class p199_no7 {
	public static void main(String[] args) {
		int[] array  = {1, 5, 3, 8, 2};
		
		int top;
		top = array[0];
		for(int i = 1; i < array.length; i++) {
			if(top < array[i])
				top = array[i];
		}
		System.out.print(top);
	}
}
// 반복문 속 array.length ->  반복문 전에 array.length를 변수에 저장하여 반복 횟수를 미리 결정
// 이렇게 하면 반복마다 array.length를 계산하는 오버헤드를 줄일 수 있음
//  성능 향상을 크게 가져오지는 않겠지만, 조금 더 효율적인 코드를 작성할 수 있게 됩

