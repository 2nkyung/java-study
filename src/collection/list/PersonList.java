package collection.list;

import java.util.ArrayList;
import java.util.List;

class Person {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

public class PersonList {

	public static void main(String[] args) {
//		Person p = new Person();
//		p.setName("홍길동");
//		System.out.println(p.getName());

		List<Person> pList = new ArrayList<>();
		// 반복문으로 총 10개의 person을 생성하여 pList에 add하면된다.
		// 각 person의 이름은 이름+1,2,3,4,5,6,7,8,9,10 입니다.

		for (int i = 0; i < 10; i++) {
			Person p = new Person();
			pList.add(p);
			p.setName("이름" + (i + 1));
		}
		
		for (int i = 0; i < 10; i++) {
		Person p = pList.get(i);
		System.out.println(p.getName());
		}
			
		}
	}

