package array;

import java.util.*;

public class FIndandRemoveDuplicateElementsFromArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 3, 45, 5, 6 };

		// Using Set
		Set<Integer> ls = new HashSet<Integer>();
		for (int element : array) {
			ls.add(element);
		}
		System.out.println("Non_Duplicate element List using set= " + ls);
		// Using Map
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < array.length; i++) {
			int ele = array[i];

			if (!map.containsKey(ele)) {
				map.put(ele, 1);
			} else {
				map.put(ele, map.get(ele) + 1);
			}
		}
		List<Integer> list = new ArrayList<>(map.keySet());
		int[] arraywithDuplicates = new int[list.size()];

		for (int j = 0; j < list.size(); j++) {
			arraywithDuplicates[j] = list.get(j);
		}
		System.out.println("\nNon_Duplicate Array using map");
		System.out.println(Arrays.toString(arraywithDuplicates));

	}
}
