package chapter01;

import java.util.Scanner;

//����ڷ� ���� n���� ������ �Է¹��� �� ������ ������ sort�Ͽ� ����ϴ� �ڵ�
public class Code12 {

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
		
		//�����ϱ�. ������������
		for(int i=0; i<n; i++) {
			int basis = data[i];
			for(int j=i; j<n; j++) {
				if(basis>data[j]) {
					basis = data[j];
				}
			}
			data[i] = basis;
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(data[i] + " ");
		}
		
		
		
		
	}

}
