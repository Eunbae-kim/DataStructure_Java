package chapter1_2;

public class Code1_2_2 {

	public static void main(String[] args) {
		//정수가 소수인지 아닌지 판별하는 함수를 만들어서 소수를 print

		for(int i=2; i<=10000; i++) {
			if(isPrime(i)) //i가 소수인지 아닌지 반환시켜주는 함수
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
