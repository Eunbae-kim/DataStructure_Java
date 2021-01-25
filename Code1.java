package chapter01;

public class Code1 {
	static int num; //main함수 안에, 밖에 각각 변수 선언 가능하지만, 클래스 외부에는 변수 선언 할 수 없음.
	
	public static void main(String[] args) {
		int anotherNum = 5; //메서드 내부 변수 선언 -> 그 메서드 내에서만 사용 가능.
		
		num = 2;
		
		System.out.println(num + anotherNum);
		System.out.println("Num: " + num);
		System.out.println("AnotherNum: " + anotherNum);
	}

}

//변수는 데이터를 보관하는 장소. memory
//변수의 선언 : 이름과 타입을 정해 주는 것
//변수는 '적용 범위(scope)'을 가짐
	//메소드 내부에 선언 된 변수는 그 베서드 내부에만 사용 가능.
	//메서드 외부에 선언된 변수는 클래스 전체에서 사용 가능

