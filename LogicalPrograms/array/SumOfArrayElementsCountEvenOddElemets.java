package array;

public class SumOfArrayElementsCountEvenOddElemets {
	public static void main(String[] arg) {
		int[] array = {1,2,3,4, 5};
		int sum =0;
		int evenCount =0;
		int oddCount= 0;
		for(int i= 0; i<array.length; i++) {
			sum = sum+array[i];
			if(array[i]%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		System.out.println("Sum of Array elements are= "+sum
			+" evenNumberCount = "+evenCount+" oddNumberCount= "+oddCount );
		
		
	}
	
}
