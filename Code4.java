package chapter01;

import java.util.Scanner;
// 변수
// 이름, 나이, 성별을 입력 받고 성별을 비교 해서 출력문 내보니기
public class Code4 {

	public static void main(String[] args) {
		String name = null;
		int age;
		String gender;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please type your name and your age and your gender: ");		
		name = kb.next();
		age = kb.nextInt();
		gender = kb.next();
		
		if(gender.equals("male")||gender.equals("man"))
			System.out.println(name + "Your are " + age + " years old man");
		else 
			System.out.println(name + "Your are " + age + " years old woman");
		
		kb.close();
	}

}
