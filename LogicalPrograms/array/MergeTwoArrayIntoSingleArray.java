package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoArrayIntoSingleArray {
	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 4, 232, 323, 122 };
		int[] arr2 = { 1, 2, 3, 32, 5 };

		int[] arr3 = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[arr1.length + i] = arr2[i];
		}
		System.out.println(Arrays.toString(arr3));
	}
}
