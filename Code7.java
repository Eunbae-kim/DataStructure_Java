package chapter01;
// n���� ������ �Է� �޾� ������� �迭�� �����ϰ�
// ��� ������ ��ĭ �� ���� ������ shif�� ��, ������ ������ �迭�� ù ĭ���� �̵��϶�.
import java.util.Scanner;

public class Code7 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �Է��ϼ���. : ");
		int n = kb.nextInt();
		
		//�迭 ����
		int [] data;
		data = new int[n];
		
		for(int i=0; i<n ; i++) {
			System.out.print("�迭" + i +"�� ���� �Է��ϼ���. : ");
			int figure = kb.nextInt();
			data[i] = figure;
		}
		
		
		//��� ������ ��ĭ�� ����������
		//�� ���� ������ ĭ ������ ����
		int last = data[n-1];
		
		for(int i=n-2; i>=0 ; i--) {
			data[i+1] = data[i];
		}
		data[0] = last;
		
		for(int i=0; i<n ; i++) {
			System.out.print(data[i]+" ");
		}
		

	}

}
