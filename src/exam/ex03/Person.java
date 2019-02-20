package exam.ex03;

public class Person {
	public String name;
	public int age;
// Person 배열을 통하여 방(인덱스)3개를 만들고, 각 사람의 이름과 나이를 정하세요.
	// 출력 예시 )
	// p[0].name => 이름0
	// p[0].age => 0

	public static void main(String[] args) {
		Person[] p = new Person[3];
		for (int i = 0; i < p.length; i++) {
			p[i] = new Person();
			p[i].name = "이름"+(i+1);
			p[i].age = i;

		}

		// 아래의 출력값은
		// p[0].name => 이름0
		// p[0].age => 0
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].name);
			System.out.println(p[i].age);
		}

	}

}
