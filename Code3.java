package chapter01;

import java.util.Scanner;
// ���ڿ��� �޾Ƽ� ����Ǿ� �ִ� ���ڿ��� ������ �����ִ� �ڵ�

public class Code3 {

	public static void main(String[] args) {
		String str = "hello";
		String input = null;
		
		System.out.print("Type a String here!");
		Scanner kb = new Scanner(System.in);
		input = kb.next(); //�ϳ��� ���ڿ��� �޾Ƽ� input�� ����
		
		if(str.equals(input)) { 
			//string�� �� ���� ������ ���� ���ؼ���  ==�� �� �� ����
			//because string is not primitive type.
			//�� string == input�̶�� ���� �ƹ��� hello�� �Է��ص� Not Match!��� ����.
			
			System.out.println("Match!");
		}else {
			System.out.println("Not Match!");
		}

		
		kb.close();
	}

}
