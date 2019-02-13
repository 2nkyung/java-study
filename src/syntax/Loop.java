package syntax;

public class Loop {
	public static void main(String[] args) {
		// 반복문 - for
		int i = 1;
		for (; i <= 10; i++) {
			System.out.println(i);
		}
		//for문안에 있는 i는 for문이 끝나면 사라짐
		//i가 11이 되는지 확인하기위해 정수형 i를
		//마지막에 불러옴
		System.out.println(i);
	}
}
