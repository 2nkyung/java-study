package oop.inherit;

class Mother1 {
	int age = 55;
	String name = "울엄마";
//생성자
	Mother1() {
		System.out.println("난 엄마 생성자!");
	}
//메소드
	void attack() {
		System.out.println("엄마가 등짝 스매싱 기술을 시전합니다.");
	}
}

public class Extends1 extends Mother1 {
	Extends1() {
		System.out.println("난 확장 생성자!");
		attack();
	}

	public static void main(String[] args) {
		// Mother m = new Mother();
		// System.out.println(m.age);
		Extends1 e = new Extends1();
		//Mother() 생성자만 실행,
		//void attack() 메소드는 실행안함;
		System.out.println(e.age);
		System.out.println(e.name);
//이건안됨
//Extends1 e = new Extends1();
//e.eat();
//Mother m = new Mother();
//
	}
}
