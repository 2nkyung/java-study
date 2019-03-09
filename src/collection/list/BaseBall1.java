package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBall1 {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			int ranNum = (int) (Math.random() * 9) + 1;
			if (numList.indexOf(ranNum) == -1) {
				numList.add(ranNum);
			} else {
				i--;
			}
		}
		// 윗부분은 중복값 빼는거
		System.out.println("numList :" + numList);
		Scanner scan = new Scanner(System.in);
		String[] numStr = scan.nextLine().split(",");
		int[] nums = new int[3];
		for (int i = 0; i < numStr.length; i++) {
			nums[i] = Integer.parseInt(numStr[i]);
		}

//		int[] nums = new int[] { 1, 2, 3 };
		int bCnt = 0;
		int sCnt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (numList.indexOf(nums[i]) != -1) {
				if(i==numList.indexOf(nums[i])) {
					sCnt++;
				}
				
			} else {
				bCnt++;
			}
		}
		if (sCnt + bCnt == 0) {
			System.out.println("아웃!");
		} else {
			System.out.println(sCnt + " Strike, " + bCnt + " ball");
		}

	}
}
