package collection.map;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MapExam1 {

	public static void main(String[] args) {
		// 리스트는 인덱스 구조, 인덱스 안 숫자만 가능. add()로 추가, 순서있음
		// 맵은 키(key) - 밸류(value) 구조. put()으로 추가, 순서없음.
		
		HashMap<String,Integer> hm = new HashMap<>();
		//같은 키값으로 두개이상 안됨.
		hm.put("이름",28);
		hm.put("이름",29);
		hm.put("이름4",28);
		hm.put("이1름",28);
		hm.put("1이름",28);
		System.out.println(hm);
		//이름의 마지막 값 꺼내보기
		System.out.println(hm.get("이름"));
		
		List<String> ll = new ArrayList<>();
		ll.add("이름1");
		ll.add("이름2");
		ll.add("이름3");
		ll.add("이름4");
		ll.add("이름5");
		ll.add("이름6");
		System.out.println(ll);
		
	}
}
