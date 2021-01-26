package chapter1_2;

import java.util.Scanner;
// 값을 2개 입력 받고 먼저 입력 받은 값의 후의 입력 받의 값의 승을 print해주는 코드
// 예를 들어 2,3 -> 2의 3승 반환.
public class Code1_2_1 {

	public static void main(String[] args) {
		// 입력으로 2개의 정수를 받기
		Scanner kb = new Scanner(System.in);	
		int a = kb.nextInt();
		int b = kb.nextInt();
		kb.close();
		// a^b을 구하는 함수
		int c = powerfunction(a,b);
		
		System.out.println(a + "의"+ " " + b + "승은 "+c+"입니다.");
	}
	
	
	// a의 b승을 구해주는 메소드 만들기
	// return type은 int (모든 함수는 리턴 타입이 한 가지로 정해짐.)
	public static int powerfunction(int a, int b) {
		int result = 1;
		for(int i=0; i<b; i++)
			result = result*a;
		
		return result;
	}

}
