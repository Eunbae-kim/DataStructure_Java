package chapter01;

import java.util.Scanner;

public class Code10 {
// n���� ������ �Է� �޾� �迭�� �����Ѵ�. �̵� �߿��� 0�� �̻��� ���ӵ� �������� ���� ���� �� �ִ� �ִ��� ���� ����ض�.
	
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
		
		int continuouMaxSum = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int sum = 0;
				for(int z=i; z<=j; z++) {
					sum += data[z];
				}
				if(sum>continuouMaxSum)
					continuouMaxSum = sum;
			}
		}
		
		System.out.println("0�� �̻��� ���ӵ� �������� ���� ���� �� �ִ� �ִ� : " + continuouMaxSum);
	}

}
