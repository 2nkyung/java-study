package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {
	static final List<Map<String, String>> LIST;
	static {
		LIST = new ArrayList<>();
		Map<String, String> game1 = new HashMap<>();
		game1.put("이름", "슈퍼마리오");
		game1.put("가격", "30,000원");
		LIST.add(game1);
		System.out.println(game1);

		game1 = new HashMap<>();
		System.out.println(game1);
		game1.put("이름", "스트리트파이터1");
		game1.put("가격", "35,000원");
		LIST.add(game1);
		System.out.println(game1);
		
		game1 = new HashMap<>();
		game1.put("이름", "스트리트파이터2");
		game1.put("가격", "40,000원");
		LIST.add(game1);
		System.out.println(game1);
		System.out.println(LIST);
	}

	public static Map<String, String> searchGame(String name) {
		for (int i = 0; i < LIST.size(); i++) {
			Map<String, String> game = LIST.get(i);
			if (name.equals(game.get("이름"))) {
				return game;
			}
		}
		return null;
	}
	
	public static List<Map<String, String>> searchGameList(String name) {
		List<Map<String, String>> gameList = new ArrayList<>();
		for (int i = 0; i < LIST.size(); i++) {
			Map<String, String> game = LIST.get(i);
			if (game.get("이름").indexOf(name) != -1) {
				gameList.add(game);
			}
		}
		return gameList;
	}


	public static void main(String[] args) {
		
		Map<String, String> game = searchGame("슈퍼마리오");
		if (game == null) {
			System.out.println("그딴건 없다!");
		} else {
			System.out.println(game);
		}

		List<Map<String, String>> gameList = searchGameList("스트리트");
		if (gameList.size() == 0) {
			System.out.println("넌 맨날 없는 것만 찾더라");
		} else {
			System.out.println(gameList);
		}

//		System.out.println(LIST.size());
//	
//		// 반복문을 이용해서 이름이 슈퍼마리오일 경우에만 출력해라 (나 ver.)
////		for(int i = 0; i < LIST.size(); i++) {
////		 if("슈퍼마리오".equals(LIST.get(i).get("이름"))) {
////			System.out.println(LIST.get(i));
////		 }
////		}
//
//		// 반복문을 이용해서 이름이 슈퍼마리오일 경우에만 출력해라 (선생님ver.)
//		for (int i = 0; i < LIST.size(); i++) {
//			Map<String, String> game = LIST.get(i);
//			if (game.get("이름").equals("슈퍼마리오")) {
//				System.out.println(game);
//			}
//		}
	}
}
