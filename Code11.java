package chapter01;

import java.util.Scanner;

public class Code11 {
// n���� ���� �ƴ� �� �ڸ� ������ �Է� �޾� �迭�� �����ϰ�, �̵� �߿��� 1�� �̻��� ���ӵ� ������ ���� ���� �� �ִ� �Ҽ��� �� �ִ밪�� ���ض�.
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �������ּ���.");
		int n = kb.nextInt();
		int [] data = new int [n];
		
		for(int i=0; i<n; i++) {
			System.out.print("�迭"+ i + "�� ���� �־��ּ���(�� ���� �ȵ�.)");
			data[i] = kb.nextInt();
		}
		kb.close();
		
		int com = 0;
		for(int i=0 ; i<n; i++) {
			
			for(int j=i; j<n; j++) {
				//to int
				int value = 0;
				for(int k=i; k<=j; k++) {
					value = value*10 + data[k];
				}
				
				int count = 0;
				//test if it is a prime
				for(int k=2; k < value; k++) {
					if(value % k == 0)
						count++;
				}
				
				//if it is a prime, compare
				if((count == 0) &&(value>com)) {
					com = value;
				}
			}
		}
		if((com > 0) && (com != 1)) {
			System.out.print("���ӵ� ������ ���� ���� �� �ִ� �Ҽ��� �� �ִ밪 : "+ com );
		}else {
			System.out.print("���� �� �ִ� �Ҽ� ����.");
		}
		
	}

}
