package chapter01;

public class Code8 {
// 2~1000  ������ �Ҽ��� ã�Ƽ� ����ϴ� ���α׷�
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
