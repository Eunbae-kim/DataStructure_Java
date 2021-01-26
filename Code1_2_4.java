package chapter1_2;
//파일에서 이름과 전화번호부를 받아와서 이름을 기준으로 오름차순으로 정렬.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code1_2_4 {
	static String [] name = new String [1000]; //배열의 크기 모르면, 일단 충분히 크게 잡아놓아도 됨.
	static String [] phone = new String [1000];
	static int n = 0; //사람 숫자
	
	public static void main(String[] args) {
		//Scanner를 이용해서 파일을 읽어오기
		Scanner inFile;
		try { 		//한번 이 아래 코드를 try
			inFile = new Scanner(new File("input.txt"));
			
			while(inFile.hasNext()) { 	//detect end of the file
				//Scanner.hasNext()하는 일은, 읽을 것이 남아 있는지 boolean으로 return 해줌.
				name[n] = inFile.next();
				phone[n] = inFile.next();
				n++;
			}
			inFile.close();
		
		} catch (FileNotFoundException e) {		// 예외가 발생하면
			System.out.println("There is no file that you surch");
			return; //프로그램을 종료. (지금 이게 main함수인데, main함수를 종료시키면 종료
			//System.exit(1);이라고 해도 같음.
		}
		bubble();
		
		for(int i =0 ; i<n ; i++) {
			System.out.println("이름 : " + name[i]+ ", 전화번호 : "+ phone[i]);
			
		}
		

	}
	
	public static void bubble() {
		for(int i = n-1; i > 0; i--) {
			for(int j=0; j<i; j++) {
				if(name[j].compareTo(name[j+1]) > 0) {//name[i] > name[j+1] String일 때는 이렇게 안됨.
					String temp = name[j];
					name[j] = name[j+1];
					name[j+1] = temp;
					
					String temp2 = phone[j];
					phone[j] = phone[j+1];
					phone[j+1] = temp2;
				}
			}
		}
	}

}
