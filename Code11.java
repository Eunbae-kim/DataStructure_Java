package chapter01;

import java.util.Scanner;

public class Code11 {
// n개의 음이 아닌 한 자리 정수를 입력 받아 배열에 저장하고, 이들 중에서 1개 이상의 연속된 정수를 합해 얻을 수 있는 소수들 중 최대값을 구해라.
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("배열의 크기를 지정해주세요.");
		int n = kb.nextInt();
		int [] data = new int [n];
		
		for(int i=0; i<n; i++) {
			System.out.print("배열"+ i + "의 값을 넣어주세요(단 음수 안됨.)");
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
			System.out.print("연속된 정수를 합해 얻을 수 있는 소수들 중 최대값 : "+ com );
		}else {
			System.out.print("얻을 수 있는 소수 없음.");
		}
		
	}

}
