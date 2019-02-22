package data;

public class Array2 {
	
	 
	public static int[] initArray(int size) {
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = (int) (Math.random() * 20) + 1;
		}
		return nums;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] =" + array[i]);
		}
	}

	public static int[] extendsSize(int size, int[] array) {
		int[] tmp = array;
		array = new int[size+array.length];
		
		for(int i=0; i<tmp.length; i++) {
			array[i] = tmp[i];
		}
		return array;
	}
	
	public static void main(String[] args) {
//		System.out.println(args.length);
//		for(String str:args) {
//			System.out.println(str);
//		}
		int[] nums = initArray(5);
		nums = extendsSize(2,nums);
		printArray(nums);
	}
}
		//		
//		int[] nums = new int[3];
//		nums[0] = 3;
//		nums[1] = 24;
//		nums[2] = 6;
//
//		int[] tmps = nums;
//		nums = new int[5];
//		nums[0] = tmps[0];
//		nums[1] = tmps[1];
//		nums[2] = tmps[2];
//
//		for (int num : nums) {
//			System.out.println(num);
//		}
//	}
//}
