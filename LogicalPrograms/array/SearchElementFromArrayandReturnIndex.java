package array;

import java.util.Scanner;

public class SearchElementFromArrayandReturnIndex {
			public static void main(String[] args) {
				int arr[] = {90,1, 12, 21231, 1233, 42, 213 };
				Scanner sc = new Scanner(System.in);
				System.out.println("Search number= ");
				int serachNumber = sc.nextInt();
				boolean found = false;
				for(int i=0; i<arr.length;i++) {
					if(arr[i]==serachNumber) {
						System.out.println("Element found at index= "+i);
						found = true;
						break;
					}
				}
				
				if(!found) {
					System.out.println("Element not found");
				}
			}
}
