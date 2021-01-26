package chapter1_3;
//입력으로 하나틔 텍스트 파일을 익는다.
//텍스트 파일에 등장하는 모든 단어들의 목록을 만들고, 각 단어가 텍스트 파일에 얼마나 등장하는지 센다.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code1_3_1 {
	//data를 저장할 변수들 자료구조.
	static String [] words = new String[100000];
	static int [] counts = new int[100000];
	static int n = 0 ; //단어 목록의 길이
						
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		
		while( true ) {
			System.out.print("$ ");
			String command = kb.next();
			if(command.equals("read")) { //String 비교 단순하게 command =="read"라고 할 수 없음.
				String fileName = kb.next();
				makeIndex(fileName);
			}else if(command.equals("find")) {
				String str = kb.next();
				int index = findWords(str);
				if (index > -1) {
					System.out.println("The word " +words[index] + " appears " + counts[index] + " times");
				}else {
					System.out.println("The word" + str + " does not appear.");
				}
			}else if(command.equals("savesa")) {
				
			}else if(command.equals("exit")) {
				break;				
			}
		}
		
		kb.close();
		
		for(int i=0; i<n; i++) {
			System.out.println("words["+i+"] = " + words[i]+ " " + "counts["+i+"] = " + counts[i]);
		}
	}
	
	
	public static void makeIndex(String fileName) {
		try {
			Scanner inFile = new Scanner(new File(fileName));// 파일을 읽는 스캐너
			while(inFile.hasNext()) { //다음 data가 존재하면
				String str = inFile.next(); //불러오기
				addWords(str); 
			}
			
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("There is no file here");
			return;
		} 
	}

	
	public static void addWords(String str) {
		int index = findWords(str);//방금 불러온 단어가 이미 word[] 배열에 존재하는지 알아보는 함수.
		if(index != -1) { // found!
			counts[index]++;
		}else { //not found!
			words[n] = str;
			counts[n] = 1;
			n++;
		}
	}


	private static int findWords(String str) {
		//같은 단어 찾으면 index를 return하고
		// 못찾으면 -1 return
		for(int i=0; i<n; i++) {
			if(words[i].equals(str)) { //words[]에서 str과 일치하면
				return i; //그 index를 return
			}
		}
		return -1; //같은 단어가 없으면 -1
	}
	
	
	static void saveAs(String fileName) {
		//파일로 출력 : PrintWriter와 FileWriter이용해서 
		try {
			PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
			for(int i=0; i<n; i++) {
				//System.out.println(words[i] + " " +counts[i]);
				outFile.println(words[i] + " " +counts[i]);
			}
			
			outFile.close(); //다 썼으면 닫기!
		} catch (IOException e) {
			System.out.println("Save Failed.");
			return;
		}
	}

}
