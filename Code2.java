package chapter01;

import java.util.Scanner; //���̺귯�� 

public class Code2 {

	public static void main(String[] args) {
		int number = 123;
		
		//kb��� �̸��� ��ĳ�ʸ� �����.
		Scanner kb = new Scanner(System.in); //Ű���忡�� Ÿ�Թ޴� ���� �Է� ���� �� �ְ�
		
		System.out.print("Please enter an integer: ");
		
		int input = kb.nextInt(); //Ű����� ���� ���� �޾� ������ ���� input�� ���� �ִ´�.
		
		if(input == number) {
			System.out.println("Numbers match!");
		}else {
			System.out.println("Numbers do not match!");
		}
		
		kb.close(); //kb ��ĳ�ʸ� �پ����� �ݾ��ֱ�!
	}

}
