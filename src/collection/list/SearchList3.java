package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList3 {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			int ranNum = (int) (Math.random() * 45) + 1;
			numList.add(ranNum);
		}

		System.out.println(numList);
//		System.out.println(numList.indexOf(6));
		Scanner scan = new Scanner(System.in);
		System.out.println(" ,를 기준으로 숫자 6개를 입력하세요.");
		String numStr = scan.nextLine();
		System.out.println("입력하신 숫자는 :" + numStr);
		String[] numStrs = numStr.split(",");
		int cnt = 0;
		for (String str : numStrs) {
			int num = Integer.parseInt(str);
			if (numList.indexOf(num) != -1) {
				cnt++;
			}
		}
		System.out.println("numList :" + numList);
		System.out.println("맞춘 갯수는 : " + cnt);
		scan.close();
	}
}

