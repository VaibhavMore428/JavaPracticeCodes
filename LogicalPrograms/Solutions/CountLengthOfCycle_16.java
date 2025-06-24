/* 
*						**** IMPORTANT ****
* THIS IS SAMPLE SOLUTION. IF YOU FIND BETTER SOLUTION PLEASE CONSIDER USING SAME.
* USE YOUR OWN VARIABLE NAMES - @@@ DO NOT COPY @@@ EXACT VARIABLE NAMES
*
*/
package Solutions;

import java.util.Map;
import java.util.HashMap;

public class CountLengthOfCycle_16 {


  public static int countLengthOfCycle( int[] arr, int startIndex ) {
  Map<Integer, Integer> visited = new HashMap<>();
	/*
	 * int count = 1; int index = startIndex; while(!visited.containsKey(index)){
	 * if(arr[index] > arr.length) return -1; visited.put(index, count); count++;
	 * index = arr[index]; } return count - visited.get(index);
	 */
  Map<Integer,Integer>visit = new HashMap<>();
  		int count=1;
  		int index= startIndex;
  		while(!visit.containsKey(index)) {
  				if(arr[index]>arr.length) return -1;
  				visited.put(index, count);
  				count++;
  				index = arr[index];
  		}
  	return count-visit.get(index);
  }

  public static void main( String[] args ) {
  
   boolean testsPassed = true;
  
  testsPassed &= countLengthOfCycle(new int[]{1, 0}, 0) == 2;
  testsPassed &= countLengthOfCycle(new int[]{1, 2, 0}, 0) == 3;
  
  if(testsPassed) {
    System.out.println( "Test passed." );
    //return true;
  } else {
    System.out.println( "Test failed." );
    //return false;
  }


  }
}
