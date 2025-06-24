/* 
*					******** IMPORTANT ********
*
* THIS IS SAMPLE SOLUTION. IF YOU FIND BETTER SOLUTION PLEASE CONSIDER USING SAME.
* USE YOUR OWN VARIABLE NAMES - @@@ DO NOT COPY @@@ EXACT VARIABLE NAMES
*
*/
package Solutions;

import java.util.Arrays;

public class secondSmallest_04 {
	public static int secondSmallest(int[] x) {

		/*if (x.length < 2) {
			return (0);
		}

		int Smallest = Integer.MAX_VALUE; // Max 32 bit integer
		int SecSmallest = Integer.MAX_VALUE;
		int Elem;
		for (int i = 0; i < x.length; i++) {
			Elem = x[i];
			if (Elem < Smallest) {
				SecSmallest = Smallest;
				Smallest = Elem;
			} else if (Elem < SecSmallest) {
				SecSmallest = Elem;
			}
		}
		return (SecSmallest);*/
		
		
		if(x.length ==1) {
			return x[0];
		}
		for(int i =0; i<x.length-1 ;i++) {
			for(int j = i+1; j<x.length; j++) {
				if(x[i]<x[j]) {
					int temp = x[i];
					x[i] = x[j]; 
					x[j] = temp;
				}
			}
		}
		return (x[x.length-2]);
	}

	public static void main(String args[]) {

		int[] a = { 0 };
		int[] b = {3, 0, 1,5 };

		boolean result = true;
		result &= secondSmallest(a) == 0;
		result &= secondSmallest(b) == 1;

		if (result) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}
}
