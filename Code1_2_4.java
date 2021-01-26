package chapter1_2;
//���Ͽ��� �̸��� ��ȭ��ȣ�θ� �޾ƿͼ� �̸��� �������� ������������ ����.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code1_2_4 {
	static String [] name = new String [1000]; //�迭�� ũ�� �𸣸�, �ϴ� ����� ũ�� ��Ƴ��Ƶ� ��.
	static String [] phone = new String [1000];
	static int n = 0; //��� ����
	
	public static void main(String[] args) {
		//Scanner�� �̿��ؼ� ������ �о����
		Scanner inFile;
		try { 		//�ѹ� �� �Ʒ� �ڵ带 try
			inFile = new Scanner(new File("input.txt"));
			
			while(inFile.hasNext()) { 	//detect end of the file
				//Scanner.hasNext()�ϴ� ����, ���� ���� ���� �ִ��� boolean���� return ����.
				name[n] = inFile.next();
				phone[n] = inFile.next();
				n++;
			}
			inFile.close();
		
		} catch (FileNotFoundException e) {		// ���ܰ� �߻��ϸ�
			System.out.println("There is no file that you surch");
			return; //���α׷��� ����. (���� �̰� main�Լ��ε�, main�Լ��� �����Ű�� ����
			//System.exit(1);�̶�� �ص� ����.
		}
		bubble();
		
		for(int i =0 ; i<n ; i++) {
			System.out.println("�̸� : " + name[i]+ ", ��ȭ��ȣ : "+ phone[i]);
			
		}
		

	}
	
	public static void bubble() {
		for(int i = n-1; i > 0; i--) {
			for(int j=0; j<i; j++) {
				if(name[j].compareTo(name[j+1]) > 0) {//name[i] > name[j+1] String�� ���� �̷��� �ȵ�.
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
