package exam.ex03;

public class Execute {

	public static void main(String[] args) {
		// 반복문으로 dogs배열안의
		// 개개의 dog의이름과 나이를 입력하여 출력하는 코드를 작성하세요.
		// ex -> dogs[0].name => 멍멍이1
		// ex -> dogs[1].age => 1
		Dog[] dogs = new Dog[10];
		for (int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog();
			;
		}

		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i]);
		}
	}
}
