package array;

import java.util.Arrays;

public class MoveAllZeroToLeft {
			public static void main(String[] args) {
						int[] array = {12,3,0,464,3,2,2,0,4,9,0,8};
						//Arrays.sort(array);
						//System.out.println(Arrays.toString(array));
						for(int i=0;i<array.length;i++) {
							for(int j=i+1;j<array.length;j++) {
								if(array[i]>array[j]) {
									int temp = array[i];
									array[i] = array[j];
									array[j] = temp;
								}
							}
						}
						System.out.println(Arrays.toString(array));
		//Approch two
						int[] array1 = {12,0,3,0};
						int insertPos = array1.length-1;
						for(int i = array1.length-1; i>=0; i--) {
							if(array1[i]!=0) {
								array1[insertPos] = array1[i];
								insertPos--;
							}
						}
						
						while(insertPos>=0) {
							array1[insertPos] = 0;
							insertPos--;
						}
						System.out.println(Arrays.toString(array1));
						
						
			}
}
