package array;

import java.util.HashSet;
import java.util.Set;

public class CommonElementAmongMultipleArrays {
	public static void main(String[] arges) {
		int[] A1 = { 21, 2, 4, 12, 2, 4, 5, 21 };
		int[] A2 = { 1, 5, 7, 21, 2, 4 };
		int[] A3 = { 21, 2, 4, 6, 3, 9 };
		int[] A4 = { 98, 3, 22, 21, 2, 4 };
		Set<Integer> SetA1 = CommonElements(A1);
		Set<Integer> SetA2 = CommonElements(A2);
		Set<Integer> SetA3 = CommonElements(A3);
		Set<Integer> SetA4 = CommonElements(A4);

		SetA1.retainAll(SetA2);
		SetA1.retainAll(SetA3);
		SetA1.retainAll(SetA4);
		System.out.println("Common element from Arrays= " + SetA1);
	}

	public static Set<Integer> CommonElements(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for (int element : arr) {
			set.add(element);
		}
		return set;
	}
}
/*
 * Logic create method which will return set from passed array to it. then Use
 * retainAll method from set it will store common elements from Array2 and
 * removed all uncommon elements do it same for all set
 */