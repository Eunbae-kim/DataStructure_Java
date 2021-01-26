package chapter1_2;

import java.util.Scanner;
//BubbleSort 하는 함수를 따로 만들어서, 배열을 넘겨주면 오름차순으로 print하기.
public class Code1_2_3 {
	static int [] data;
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력해주세요. : ");
		int n = kb.nextInt();
		
		data = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("data[" + i + "] = ");
			data[i] = kb.nextInt();
		}
		kb.close();
		bubble(data); //배열을 넘겨줌.
	}
	
	
	//Bubble Sort해주고 print해주는 함수 bubble.
	//return할 것이 없을 때 void
	public static void bubble(int [] data) { // 함수에 배열을 넘겨 받음
		for(int i = data.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(data[j+1]<data[j]) {
					//swap data[j] and data[j+1]
					swap(j,j+1);
					
				}
			}
		}
		
		//sort된 함수를 print
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] +" ");
		}
	}
	
	public static void swap(int j, int i) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

}
