package oop.inherit;

class Dogg {
	String name;
	int age;
}

class Catt {
	int age;
}

class Food {
	int n;
}

public class What {
	public static void main(String[] args) {
		
		Dogg[] dogs = new Dogg[5];
		for (int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dogg();
			dogs[i].age = i + 1;
//			System.out.println(dogs[i].age);
		}
		
		Catt[] catts = new Catt[5];
		for (int i = 0; i < catts.length; i++) {
			catts[i] = new Catt();
			catts[i].age = i + 1;
		}
		
		Food[] foods = new Food[5];
		for (int i = 0; i < foods.length; i++) {
				foods[i] = new Food();
				foods[i].n = i + 1;
		}		
System.out.println("이 개의 나이는"+ dogs[4].age +"살입니다.");
System.out.println("이 고양이의 나이는"+ catts[3].age +"살입니다.");
System.out.println("이 음식의 유통기한은 "+ foods[3].n +"개월 입니다.");
		}
}
