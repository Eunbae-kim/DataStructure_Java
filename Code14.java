package chapter01;

import java.util.Scanner;
//����ڷ� ���� n���� ������ �Է¹޴µ�, �ϳ��� �Է� �� �� ���� ������� �Էµ� �������� ������ ������ �����Ͽ� ����Ͽ���.
public class Code14 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �������ּ���.");
		int n = kb.nextInt();
		int [] data = new int [n];
		
		for(int i=0; i<n; i++) {
			System.out.print("�迭"+ i + "�� ���� �־��ּ���");
			data[i] = kb.nextInt();
			//�����ϱ�. ������������
			//Bubble Sort Algorithm�̿�
			for(int j=i; j>=0; j--) {
				for(int k=0; k<j; k++){
					if(data[k]>data[k+1]) {
						int temp = data[k+1];
						data[k+1] = data[k];
						data[k] = temp;
					}
						
				}
			}
			
			for(int j=0; j<=i; j++) {
				System.out.print(data[j] + " ");
			}
		}
		kb.close();

	}

}
