package chapter01;
//배열의 크기를 입력 받고, 각각 배열의 값을 입력받아,
//배열의 합과 최대값을 구해주는 코드

import java.util.Scanner;

public class Code6 {

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
		
		int sum = 0;
		int max = data[0];
		
		for(int i=0; i<n; i++) {
			sum += data[i];
			if(data[i] > max)
				max = data[i];
		}
		
		System.out.print("배열의 합은"+ sum + "입니다.");
		System.out.print("배열의 최대값은"+ max + "입니다");
	}

}
