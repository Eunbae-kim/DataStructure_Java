package chapter1_2;

import java.util.Scanner;
// ���� 2�� �Է� �ް� ���� �Է� ���� ���� ���� �Է� ���� ���� ���� print���ִ� �ڵ�
// ���� ��� 2,3 -> 2�� 3�� ��ȯ.
public class Code1_2_1 {

	public static void main(String[] args) {
		// �Է����� 2���� ������ �ޱ�
		Scanner kb = new Scanner(System.in);	
		int a = kb.nextInt();
		int b = kb.nextInt();
		kb.close();
		// a^b�� ���ϴ� �Լ�
		int c = powerfunction(a,b);
		
		System.out.println(a + "��"+ " " + b + "���� "+c+"�Դϴ�.");
	}
	
	
	// a�� b���� �����ִ� �޼ҵ� �����
	// return type�� int (��� �Լ��� ���� Ÿ���� �� ������ ������.)
	public static int powerfunction(int a, int b) {
		int result = 1;
		for(int i=0; i<b; i++)
			result = result*a;
		
		return result;
	}

}
