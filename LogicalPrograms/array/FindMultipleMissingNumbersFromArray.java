package array;

import java.util.HashSet;
import java.util.Set;

public class FindMultipleMissingNumbersFromArray {
	 public static void main(String[] args) {
	        int[] array = {1, 2, 4, 6, 7, 9}; // missing: 3, 5, 8
	        int n = 9; // range is from 1 to 9

	        // Use a HashSet to store all numbers present in the array
	        Set <Integer> set = new HashSet<>();
	        for (int num : array) {
	            set.add(num);
	        }

	        System.out.print("Missing Numbers are: ");
	        for (int i = 1; i <= n; i++) {
	            if (!set.contains(i)) {
	                System.out.print(i + " ");
	            }
	        }
	    }
}
