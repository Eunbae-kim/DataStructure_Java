package chapter01;
// n개의 정수를 입력 받아 순서대로 배열에 저장하고
// 모든 정수를 한칸 씩 오른 쪽으로 shif한 뒤, 마지막 정수는 배열의 첫 칸으로 이동하라.
import java.util.Scanner;

public class Code7 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요. : ");
		int n = kb.nextInt();
		
		//배열 선언
		int [] data;
		data = new int[n];
		
		for(int i=0; i<n ; i++) {
			System.out.print("배열" + i +"의 값을 입력하세요. : ");
			int figure = kb.nextInt();
			data[i] = figure;
		}
		
		
		//모든 정수를 한칸씩 오른쪽으로
		//그 전에 마지막 칸 데이터 저장
		int last = data[n-1];
		
		for(int i=n-2; i>=0 ; i--) {
			data[i+1] = data[i];
		}
		data[0] = last;
		
		for(int i=0; i<n ; i++) {
			System.out.print(data[i]+" ");
		}
		

	}

}
