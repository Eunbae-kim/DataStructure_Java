package chapter01;

import java.util.Scanner;

public class Code10 {
// n개의 정수를 입력 받아 배열에 저장한다. 이들 중에서 0개 이상의 연속된 정수들을 더해 얻을 수 있는 최댓값을 구해 출력해라.
	
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
		
		int continuouMaxSum = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int sum = 0;
				for(int z=i; z<=j; z++) {
					sum += data[z];
				}
				if(sum>continuouMaxSum)
					continuouMaxSum = sum;
			}
		}
		
		System.out.println("0개 이상의 연속된 정수들을 더해 얻을 수 있는 최댓값 : " + continuouMaxSum);
	}

}
