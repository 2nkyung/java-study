package collection.list;

import java.util.ArrayList;
import java.util.List;

class Dog {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}

public class DogList {
// dogList를 만들어서 반복문으로 1~10까지 Dog를 총 10개 생성하여 
//name => 강아지1~강아지10, age => 1~10
	public static void main(String[] args) {
		List<Dog> dogList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Dog d = new Dog();
			d.setName("강아지" + (i + 1));
			d.setAge(i + 1);
			dogList.add(d);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(dogList.get(i).getName() + "의 나이는" + dogList.get(i).getAge() + "입니다.");

		}
	}
}
