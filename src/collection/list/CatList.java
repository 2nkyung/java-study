package collection.list;

import java.util.ArrayList;
import java.util.List;

class Cat {
	private String name;
	private int age;

	public Cat() {
		super();
	}

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}

public class CatList {

	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println(cat);
		List<Cat> catList = new ArrayList<>();
		for(int i=0; i<10; i++) {
			//고양이 이름은 냥이1~냥이 10
			//나이는 랜덤으로 1살부터 30살까지
			Cat c = new Cat();
			catList.add(c);
			c.setName("냥이"+(i+1));
			int ag = (int)(Math.random()*30)+1;
			c.setAge(ag);
		}
		//반복문을 사용하여 위에서 생성된 고양이들을 출력해주세요.
		for(int i=0; i<10; i++) {
			System.out.println(catList.get(i).getName());
			System.out.println(catList.get(i).getAge());
		}
	}

}
