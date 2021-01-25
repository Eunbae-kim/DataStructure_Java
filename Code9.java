package chapter01;

import java.util.Scanner;

public class Code9 {
// 사용자로 부터 정수의 개수 n을 입력받는다.
//n개의 정수를 입력 받아 순서대로 배열에 저장하고, 중복된 정수쌍의 개수를 카운트하여 출력하라.
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
