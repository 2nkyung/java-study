package collection.map;

import java.util.HashMap;
import java.util.Set;

public class MapExam2 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("나이", "33");
		map.put("주소", "전라도 광주");
		map.put("직업", "도적");
		System.out.println(map);
		//키들로 구성되어있는 set을 넘겨서 스트링 배열을 만든다
		Set<String> keys = map.keySet();
		System.out.println(keys.size());
		//향상된 for문
		for(String key:keys) {
			System.out.println(key + " : " + map.get(key));
		}
		
	}
}
