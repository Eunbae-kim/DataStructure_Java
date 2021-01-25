package chapter01;

import java.util.Scanner; //라이브러리 

public class Code2 {

	public static void main(String[] args) {
		int number = 123;
		
		//kb라는 이름의 스캐너를 만든다.
		Scanner kb = new Scanner(System.in); //키보드에서 타입받는 것을 입력 받을 수 있게
		
		System.out.print("Please enter an integer: ");
		
		int input = kb.nextInt(); //키보드로 부터 값을 받아 정수형 병수 input에 값을 넣는다.
		
		if(input == number) {
			System.out.println("Numbers match!");
		}else {
			System.out.println("Numbers do not match!");
		}
		
		kb.close(); //kb 스캐너를 다쓰고나면 닫아주기!
	}

}
