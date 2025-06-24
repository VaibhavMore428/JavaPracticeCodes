/* 
*					******** IMPORTANT ********
*
* THIS IS SAMPLE SOLUTION. IF YOU FIND BETTER SOLUTION PLEASE CONSIDER USING SAME.
* USE YOUR OWN VARIABLE NAMES - @@@ DO NOT COPY @@@ EXACT VARIABLE NAMES
*
*/
package Solutions;

import java.util.*;

public class SmallestNumber_03 {

	public static int FindMin(int a[]) {
		if (a == null)
			throw new IllegalArgumentException("Invalid input");
		//{ 3, 4, 5, 6, 1, 2 }
		int min =a[0];
		/*
		 * for(int i :a) { if(i<min) { min =i; } }
		 */
		
		for(int i=1 ;i<a.length; i++) {
			if(a[i]<min	) {
				min = a[i];
			}
		}
		
		return min;
		//return FindMinInArray(a, 0, a.length - 1);
	}

	/*private static int FindMinInArray(int a[], int left, int right) {

		if (left == right)
			return a[left];

		if (left > right)
			return a[0];

		int mid = (left + right) / 2;

		if (mid < right && a[mid] > a[mid + 1])
			return a[mid + 1];
		if (mid > left && a[mid - 1] > a[mid])
			return a[mid];

		if (a[right] > a[mid])
			return FindMinInArray(a, left, mid - 1);

		return FindMinInArray(a, mid + 1, right);
	}*/

	public static void main(String args[]) {
		boolean result = true;
		result = result && FindMin(new int[] { 3, 4, 5, 6, 1, 2 }) == 1;
		result = result && FindMin(new int[] { 2, 1 }) == 1;
		result = result && FindMin(new int[] { 1 }) == 1;

		try {
			FindMin(null);
			result = false;
		} catch (Exception e) {
			result = result && true;
		}

		if (result) {
			System.out.println("All tests pass");
		} else {
			System.out.println("There are test failures");
		}
	}
}