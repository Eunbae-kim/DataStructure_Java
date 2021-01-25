package chapter01;

import java.util.Scanner;

public class Code13 {

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
		//Bubble Sort Algorithm이용
		for(int i=n-1; i>=0; i--) {
			for(int j=0; j<i; j++){
				if(data[j]>data[j+1]) {
					int temp = data[j+1];
					data[j+1] = data[j];
					data[j] = temp;
				}
					
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(data[i] + " ");
		}

	}

}
