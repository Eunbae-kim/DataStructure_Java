package chapter01;
//�迭
// �迭 �����ϰ� for���� while������ ����ϱ� 
public class Code5 {

	public static void main(String[] args) {
		//declare the array
		int [] grades; //�迭 �̸� ����
		grades = new int[5]; //new ��ɾ�� �Բ� ������ �迭�� ����� �ֱ�
		
		//���� �� ������ int [] grades = new int[5]; �� �������� �ٿ��� ��Ÿ�� �� �� �ִ�.
		
		//assign some values to the array
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
		//print out each value
		for(int i=0; i< grades.length ; i++) { //grades.length �迭 ũ��
			System.out.println(grades[i]);
		}
		
		//for�� ��� while������ ��Ÿ����.
		int i = 0;
		while(i < grades.length){
			System.out.println(grades[i]);
			i++;
		}

		
		}
	}


