package oop.inherit;

public class Final {
//	파이널 변수는 값을 초기화해줘야한다
	final int num;

	Final() {
		num = 3;
	}

	public static void main(String[] args) {
		Final f = new Final();
//		System.out.println(f.num);
//		f.num = 3;
	}
}
