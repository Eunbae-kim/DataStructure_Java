package chapter01;

public class Code1 {
	static int num; //main�Լ� �ȿ�, �ۿ� ���� ���� ���� ����������, Ŭ���� �ܺο��� ���� ���� �� �� ����.
	
	public static void main(String[] args) {
		int anotherNum = 5; //�޼��� ���� ���� ���� -> �� �޼��� �������� ��� ����.
		
		num = 2;
		
		System.out.println(num + anotherNum);
		System.out.println("Num: " + num);
		System.out.println("AnotherNum: " + anotherNum);
	}

}

//������ �����͸� �����ϴ� ���. memory
//������ ���� : �̸��� Ÿ���� ���� �ִ� ��
//������ '���� ����(scope)'�� ����
	//�޼ҵ� ���ο� ���� �� ������ �� ������ ���ο��� ��� ����.
	//�޼��� �ܺο� ����� ������ Ŭ���� ��ü���� ��� ����

