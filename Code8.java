package chapter01;

public class Code8 {
// 2~1000  사이의 소수를 찾아서 출력하는 프로그램
	public static void main(String[] args) {
		int count;
		for (int i = 2; i<=1000; i++) {
			count = 0;
			for(int j=2; j<=i; j++) {
				if(i % j == 0 && j != i) {
					count += 1;
				}
			}
			
			if(count == 0)
				System.out.println(i);
		}

	}

}
