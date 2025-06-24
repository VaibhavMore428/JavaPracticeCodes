package array;

import java.util.Arrays;

public class ReverseOrderArray {
	public static void main(String[] args) {
		int arr[] = {90,1, 12, 21231, 1233, 42, 213 };
		
		/*
		Arrays.sort(arr);
		System.out.println("Largest element="+arr[arr.length-1]);
		System.out.println("second Largest element="+arr[arr.length-2]);
		*/

		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
