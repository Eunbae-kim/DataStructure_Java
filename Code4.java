package chapter01;

import java.util.Scanner;
// ����
// �̸�, ����, ������ �Է� �ް� ������ �� �ؼ� ��¹� �����ϱ�
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
