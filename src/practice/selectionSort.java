package practice;

import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 2, 7, 1 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);
	}
}
