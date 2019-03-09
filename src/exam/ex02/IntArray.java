package exam.ex02;

public class IntArray {

	public int[] nums = new int[10];

	public boolean compare(int num) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				return false;

			if (nums[i] == num)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		IntArray ia = new IntArray();
		for (int i = 0; i < ia.nums.length; i++) {
//			ia.nums[i] = (int) (Math.random() * 10) + 1;
//			if (ia.compare(ia.nums[i])) {
//				i--;
//			}

			int num = (int) (Math.random() * 10) + 1;
			if (ia.compare(num)) {
				i--;
			} else {
				ia.nums[i] = num;
			}
		}

		// 오름차순 ; 작 -> 큰 순서
//		for (int i = 0; i < ia.nums.length; i++) {
//			for (int j = i + 1; j < ia.nums.length; j++) {
//				if (ia.nums[i] > ia.nums[j]) {
//					int tmp = ia.nums[i];
//					ia.nums[i] = ia.nums[j];
//					ia.nums[j] = tmp;
					// 자리를 바꿔주기
//				}
//			}
//		}

		for (int i = 0; i < ia.nums.length; i++) {
			System.out.println("ia.nums[" + i + "]=" + ia.nums[i]);
		}

		// 내림차순 ;
		for (int i = 0; i < ia.nums.length; i++) {
			for (int j = i + 1; j < ia.nums.length; j++) {
				if (ia.nums[i] < ia.nums[j]) {
					int tmp = ia.nums[j];
					ia.nums[j] = ia.nums[i];
					ia.nums[i] = tmp;
					// 자리를 바꿔주기
				}
			}
		}
		for (int i = 0; i < ia.nums.length; i++) {
			System.out.println("ia.nums[" + i + "]=" + ia.nums[i]);
		}

	}
}
