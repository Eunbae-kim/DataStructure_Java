package chapter01;

import java.util.Scanner;
// 문자열을 받아서 저장되어 있는 문자열과 같은지 비교해주는 코드

public class Code3 {

	public static void main(String[] args) {
		String str = "hello";
		String input = null;
		
		System.out.print("Type a String here!");
		Scanner kb = new Scanner(System.in);
		input = kb.next(); //하나의 문자열을 받아서 input에 저장
		
		if(str.equals(input)) { 
			//string일 때 서로 같은지 보기 위해서는  ==를 쓸 수 없음
			//because string is not primitive type.
			//즉 string == input이라고 쓰면 아무리 hello를 입력해도 Not Match!라고 나옴.
			
			System.out.println("Match!");
		}else {
			System.out.println("Not Match!");
		}

		
		kb.close();
	}

}
