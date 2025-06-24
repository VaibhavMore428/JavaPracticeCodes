package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateElementsInArray {
	public static void main(String[] args) {

		int[] arr = { 2,12, 3, 2, 1, 3 };
		//Using List
		List<Integer> ls = new ArrayList<Integer>() ;
		for(int j=0;j<arr.length-1;j++) {
			for(int k=j+1;k<arr.length;k++) {
				if(arr[j]==arr[k]) {
					if(!ls.contains(arr[j])) {
						ls.add(arr[j]);
					}
				}
			}
		}
		System.out.println("Duplicate elements using List= "+ls);
		
		
		//using Map
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();	
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], (map.get(arr[i]) )+ 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println("\nMap elements= "+map);
		System.out.println("\nDuplicate array Elements are:= ");
		for (Map.Entry<Integer, Integer> ms : map.entrySet()) {
			if (ms.getValue() > 1) {
				System.out.println(ms.getKey());
			}
		}
	}
}
