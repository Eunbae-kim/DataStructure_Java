package chapter01;

import java.util.Scanner;
//사용자로 부터 n개의 정수를 입력받는데, 하나씩 입력 될 때 마다 현재까지 입력된 정수들을 오름차 순으로 정렬하여 출력하여라.
public class Code14 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("배열의 크기를 지정해주세요.");
		int n = kb.nextInt();
		int [] data = new int [n];
		
		for(int i=0; i<n; i++) {
			System.out.print("배열"+ i + "의 값을 넣어주세요");
			data[i] = kb.nextInt();
			//정력하기. 오름차순으로
			//Bubble Sort Algorithm이용
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
