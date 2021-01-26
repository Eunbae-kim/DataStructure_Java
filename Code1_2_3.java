package chapter1_2;

import java.util.Scanner;
//BubbleSort �ϴ� �Լ��� ���� ����, �迭�� �Ѱ��ָ� ������������ print�ϱ�.
public class Code1_2_3 {
	static int [] data;
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է����ּ���. : ");
		int n = kb.nextInt();
		
		data = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("data[" + i + "] = ");
			data[i] = kb.nextInt();
		}
		kb.close();
		bubble(data); //�迭�� �Ѱ���.
	}
	
	
	//Bubble Sort���ְ� print���ִ� �Լ� bubble.
	//return�� ���� ���� �� void
	public static void bubble(int [] data) { // �Լ��� �迭�� �Ѱ� ����
		for(int i = data.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(data[j+1]<data[j]) {
					//swap data[j] and data[j+1]
					swap(j,j+1);
					
				}
			}
		}
		
		//sort�� �Լ��� print
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] +" ");
		}
	}
	
	public static void swap(int j, int i) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

}
