package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList2 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			int ranNum = (int) (Math.random() * 20) + 1;
			numList.add(ranNum);
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("맞출번호를 ,를 기준으로 입력하세요.");
		String strNum = scan.nextLine();
		String[] strNums = strNum.split(",");
		ArrayList<Integer> anList = new ArrayList<>();
		for (int i = 0; i < strNums.length; i++) {
			int num = Integer.parseInt(strNums[i]);
			anList.add(num);
		}
		int num = 0;
		for (int i = 0; i < anList.size(); i++) {
			int anNum = anList.get(i);
			if (numList.indexOf(anNum) != -1) {
				num++;
			}
		}
		System.out.println("numList :" + numList);
		System.out.println("anList :" + anList);
		System.out.println("맞춘 갯수 :" + num);

//		int num = 0;
//		for (int i = 0; i < 5; i++) {
//			int ranNum = (int) (Math.random() * 20) + 1;
//			System.out.println(numList.indexOf(ranNum));
//			if (numList.indexOf(ranNum) != -1) {
//				num++;
//			}
//		}
//		System.out.println("맞은 갯수는" + num);
	}
}
