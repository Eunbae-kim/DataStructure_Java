package chapter01;
//�迭�� ũ�⸦ �Է� �ް�, ���� �迭�� ���� �Է¹޾�,
//�迭�� �հ� �ִ밪�� �����ִ� �ڵ�

import java.util.Scanner;

public class Code6 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �������ּ���.");
		int n = kb.nextInt();
		int [] data = new int [n];
		
		for(int i=0; i<n; i++) {
			System.out.print("�迭"+ i + "�� ���� �־��ּ���");
			data[i] = kb.nextInt();
		}
		kb.close();
		
		int sum = 0;
		int max = data[0];
		
		for(int i=0; i<n; i++) {
			sum += data[i];
			if(data[i] > max)
				max = data[i];
		}
		
		System.out.print("�迭�� ����"+ sum + "�Դϴ�.");
		System.out.print("�迭�� �ִ밪��"+ max + "�Դϴ�");
	}

}
