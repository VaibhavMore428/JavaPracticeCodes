package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfPairsArrayCode {
	public static void main(String[] args) {
		int[] arr= {1,5,7,-1,5};
		int sum =6;
		Arrays.sort(arr);
		List<int[]> ls = new ArrayList<int[]>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					ls.add(new int[] {arr[i],arr[j]});
				}
			}
		}
		System.out.println("All possible pairs are:= "+Arrays.deepToString(ls.toArray()));
	}	
}


/* Logic
 * 	Sort array then
 	use for-loop to iterate and compare given sum with sum of current and next elem6ent
 	if sum is equal then add those element in list
 	then print the list
*/
