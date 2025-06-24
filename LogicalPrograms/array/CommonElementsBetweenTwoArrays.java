package array;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsBetweenTwoArrays {
		public static void main(String[] args) {
				int[] arr1 = {2,3,4,232,323,122};
				int[] arr2 = {1,2,3,32,5};
				List<Integer> commonList = commonElements(arr1,arr2);
				System.out.println("Common elements = "+commonList);
		}

		private static List<Integer> commonElements(int[] arr1, int[] arr2) {
			// TODO Auto-generated method stub
			List<Integer> newList = new ArrayList<>();
			List<Integer> commonElementList = new ArrayList<>();
			
			for(int ele: arr1) {
				newList.add(ele);
			}
			for(int ele1: arr2) {
				if(newList.contains(ele1)) {
					commonElementList.add(ele1);
				}
			}
			return commonElementList;
		}
}
