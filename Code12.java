package chapter01;

import java.util.Scanner;

//사용자로 부터 n개의 정수를 입력받은 후 오름차 순으로 sort하여 출력하는 코드
public class Code12 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("배열의 크기를 지정해주세요.");
		int n = kb.nextInt();
		int [] data = new int [n];
		
		for(int i=0; i<n; i++) {
			System.out.print("배열"+ i + "의 값을 넣어주세요");
			data[i] = kb.nextInt();
		}
		kb.close();
		
		//정력하기. 오름차순으로
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
