package chapter01;

import java.util.Scanner;

public class Code9 {
// ����ڷ� ���� ������ ���� n�� �Է¹޴´�.
//n���� ������ �Է� �޾� ������� �迭�� �����ϰ�, �ߺ��� �������� ������ ī��Ʈ�Ͽ� ����϶�.
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
		
		int count = 0;
		
		for(int i=0; i<n; i++){
			int basis = data[i];
			for(int j= i+1; j<n; j++){
				if(data[j] == basis)
					count++;
			}
		}
		System.out.println(count);
	}

}
