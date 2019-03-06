package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("홍길동1");
	list.add("11");
	list.add("서울시 강서구");
	List<String> list2 = new ArrayList<>();
	list2.add("홍길동2");
	list2.add("22");
	list2.add("서울시 강서구");
	System.out.println(list2);
	
	Map<String,String> map = new HashMap<>();
	map.put("이름","홍길동1");
	map.put("나이","11");
	map.put("주소","서울시 강서구");
	Map<String,String> map2 = new HashMap<>();
	map2.put("이름","홍길동2");
	map2.put("나이","22");
	map2.put("주소","서울시 강서구");
	System.out.println(map2);
	
	//add는 배열을 한칸 늘리고 늘리자마자 삽입
	List<Map<String,String>> mapList = new ArrayList();
	mapList.add(map);
	mapList.add(map2);
	System.out.println(mapList);
	System.out.println(mapList.get(1).get("나이"));
}
}