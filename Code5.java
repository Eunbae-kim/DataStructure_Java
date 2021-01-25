package chapter01;
//배열
// 배열 선언하고 for문과 while문으로 출력하기 
public class Code5 {

	public static void main(String[] args) {
		//declare the array
		int [] grades; //배열 이름 지정
		grades = new int[5]; //new 명령어와 함께 실제로 배열을 만들어 주기
		
		//위에 두 문장을 int [] grades = new int[5]; 한 문장으로 줄여서 나타낼 수 도 있다.
		
		//assign some values to the array
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
		//print out each value
		for(int i=0; i< grades.length ; i++) { //grades.length 배열 크기
			System.out.println(grades[i]);
		}
		
		//for문 대신 while문으로 나타내기.
		int i = 0;
		while(i < grades.length){
			System.out.println(grades[i]);
			i++;
		}

		
		}
	}


