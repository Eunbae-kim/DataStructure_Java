package chapter1_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code1_3_2 {
	//data�� ������ ������ �ڷᱸ��.
		static String [] words = new String[100000];
		static int [] counts = new int[100000];
		static int n = 0 ; //�ܾ� ����� ����
							
		public static void main(String[] args) {
			
			Scanner kb = new Scanner(System.in);
			
			
			while( true ) {
				System.out.print("$ ");
				String command = kb.next();
				if(command.equals("read")) { //String �� �ܼ��ϰ� command =="read"��� �� �� ����.
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
				Scanner inFile = new Scanner(new File(fileName));// ������ �д� ��ĳ��
				while(inFile.hasNext()) { //���� data�� �����ϸ�
					String str = inFile.next(); //�ҷ�����
					String trimmed = trimming(str);
					if(trimmed != null) {
						String t = trimmed.toLowerCase();
						addWords(trimmed);
					}
				}
				
				inFile.close();
			} catch (FileNotFoundException e) {
				System.out.println("There is no file here");
				return;
			} 
		}

		
		private static String trimming(String str) {
			int i =0;
			while(i < str.length() && !Character.isLetter(str.charAt(i))) { //���ĺ��� �̴� ������ loop ����
			//while(str.charAt(i) >= 'a' && str.charAt(i) <='z') {
				i++;
			}
			
			int j =-1;
			while(j > 0 && !Character.isLetter(str.charAt(i))) { //���ĺ��� �̴� ������ loop ����
			//while(str.charAt(i) >= 'a' && str.charAt(i) <='z') {
				j--;
			}
			
			//���ڿ� �ȿ� ���ĺ��� �ϳ��� ������ i>j
			if(i>j) {
				return null;
			}else {
				String trimmed = str.substring(i, j+1); //[i,j]
				return trimmed;
			}
		}


		public static void addWords(String str) {
			int index = findWords(str);//��� �ҷ��� �ܾ �̹� word[] �迭�� �����ϴ��� �˾ƺ��� �Լ�.
			if(index != -1) { // found!
				counts[index]++;
			}else { //not found!
				int i=n-1;
				while(i>=0 && words[i].compareToIgnoreCase(str)>0) {
					words[i+1] = words[i];
					counts[i+1] =counts[i];
					i--;
				}
				words[n+1] = str;
				counts[n+1] = 1;
				n++;
			}
		}


		private static int findWords(String str) {
			//���� �ܾ� ã���� index�� return�ϰ�
			// ��ã���� -1 return
			for(int i=0; i<n; i++) {
				if(words[i].equals(str)) { //words[]���� str�� ��ġ�ϸ�
					return i; //�� index�� return
				}
			}
			return -1; //���� �ܾ ������ -1
		}
		
		
		static void saveAs(String fileName) {
			//���Ϸ� ��� : PrintWriter�� FileWriter�̿��ؼ� 
			try {
				PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
				for(int i=0; i<n; i++) {
					//System.out.println(words[i] + " " +counts[i]);
					outFile.println(words[i] + " " +counts[i]);
				}
				
				outFile.close(); //�� ������ �ݱ�!
			} catch (IOException e) {
				System.out.println("Save Failed.");
				return;
			}
		}

	}
