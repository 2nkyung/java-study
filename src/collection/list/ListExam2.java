package collection.list;

import java.util.ArrayList;

public class ListExam2 {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			numList.add(i);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(numList.get(i));
		}
//10의 배수로 찍어내기
		ArrayList<Integer> numList2 = new ArrayList<>();
		for (int i = 100; i >= 10; i -= 10) {
			numList2.add(i);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(numList2.get(i));
		}
	}
}
