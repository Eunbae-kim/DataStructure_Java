package chapter1_2;

public class Code1_2_2 {

	public static void main(String[] args) {
		//������ �Ҽ����� �ƴ��� �Ǻ��ϴ� �Լ��� ���� �Ҽ��� print

		for(int i=2; i<=10000; i++) {
			if(isPrime(i)) //i�� �Ҽ����� �ƴ��� ��ȯ�����ִ� �Լ�
				System.out.println(i);
		}
		
	}
	
	public static boolean isPrime(int i) {
		int count = 0;
		for(int j=2; j<i;j++) {
			if(i % j == 0) {
				count++;
			}
		}
		if(count == 0) {
			return true;
		}else {
			return false;
		}
	}

}
