package exam.ex03;

public class Cat {
	public String name;
	public int age;

	public String toString() {
		return "이 고양이의 이름은" + name + "이구요, 나이는" + age + "입니다.";
	}
	
	public static void main(String[] args) {
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Cat c3 = new Cat();
		c1.name = "이름1";
		c1.age = 0;
		c2.name = "이름2";
		c2.age = 1;
		c3.name = "이름3";
		c3.age = 2;
		
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c2.name);
		System.out.println(c2.age);
		System.out.println(c3.name);
		System.out.println(c3.age);
		
		Cat[] cats = new Cat[5];
//		cats[0] = new Cat();
//		cats[1] = new Cat();
//		cats[2] = new Cat();
//		cats[3] = new Cat();
//		cats[4] = new Cat();
		
		for (int i=0 ; i<cats.length ; i++) {
		cats[i] = new Cat();
		cats[i].name = "이름"+(i+1);
		cats[i].age = i;
		
		}

		for (int i=0 ; i<cats.length ; i++) {
		System.out.println(cats[i].name);
		System.out.println(cats[i].age);
		System.out.println(cats[i]);
		}
	}
}
