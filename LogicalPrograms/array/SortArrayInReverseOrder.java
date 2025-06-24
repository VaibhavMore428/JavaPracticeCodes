package array;

import java.util.Arrays;

public class SortArrayInReverseOrder {
		public static void main(String[] args) {
			int[] array = {12,3,11,222,32,2,3,44342,1};
			int temp;
			for(int i=0; i<array.length-1;i++) {
				for(int j=i+1; j<array.length; j++) {
					if(array[i]<array[j]) {
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
			System.out.println("Array is reversed order= "+Arrays.toString(array));
			
		}
		
}
