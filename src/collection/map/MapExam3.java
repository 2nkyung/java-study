package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam3 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "가만두지 않겠다.");
		map.put(2, "마지막이다");
		map.put(3, "음.......");
		System.out.println(map);

		HashMap<String, Object> cat = new HashMap<>();
		cat.put("name", "냥이1");
		cat.put("age", 11);
		System.out.println(cat);

		List<HashMap<String, Object>> catList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			cat.put("name", "");
			cat.put("age", "");
			catList.add(cat);
		}
	}
}
