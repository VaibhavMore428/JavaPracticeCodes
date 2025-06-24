package array;

public class FindMissingNumberInArray {
		public static void main(String[] args) {
			int[] array = {1,2,3,5};
			int Arraysum = 0;
			int sumWithMissingNumber = 0;
			for(int i=0; i<array.length-1;i++) {
				Arraysum = Arraysum+array[i];	
			}
			for(int i=0; i<5;i++) {
				sumWithMissingNumber = sumWithMissingNumber+i;	
			}
			
			int missingNumber = sumWithMissingNumber-Arraysum  ;
			System.out.println("Missing Number is ="+missingNumber);
		}
}
