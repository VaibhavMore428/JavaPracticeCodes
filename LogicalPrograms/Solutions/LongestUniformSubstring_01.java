/* 
*					******** IMPORTANT ********
*
* THIS IS SAMPLE SOLUTION. IF YOU FIND BETTER SOLUTION PLEASE CONSIDER USING SAME.
* USE YOUR OWN VARIABLE NAMES - @@@ DO NOT COPY @@@ EXACT VARIABLE NAMES
*
*/
package Solutions;

import java.util.*;

public class LongestUniformSubstring_01 {

  private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

  static int[] longestUniformSubstring(String str){
   /* int longestStart = -1;
    int longestLength = 0;
    int ix = 1;
    int length = input.length();
    while(ix < length) {
      int start = ix - 1;
      int currentLength = 1;
      while(ix < length && input.charAt(ix) == input.charAt(ix - 1) ){
        ix++;
        currentLength++;
      }
      if(currentLength > longestLength){
        longestStart = start;
        longestLength = currentLength;
      }
      ix++;
    }*/	  
	  if(str.isEmpty()|| str== null) {
		  return new int[]{ -1, 0 };
	  }
	  int maxCount = 1;
		int maxStartIndex = 0;

		int currentCount = 1; 	
		int CurrentStartIndex = 0;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				currentCount++;
			} else {
				currentCount = 1;
				CurrentStartIndex = i;
			}
			if (currentCount > maxCount) {
				maxCount = currentCount;
				maxStartIndex = CurrentStartIndex;
			}
		}
    return new int[]{ maxStartIndex, maxCount };
  }

  public static void main(String[] args) {
    testCases.put("", new int[]{-1, 0});
    testCases.put("10000111", new int[]{1, 4});
    testCases.put("aabbbbbCdAA", new int[]{2, 5});

    boolean pass = true;
    for(Map.Entry<String,int[]> testCase : testCases.entrySet()){
      int[] result = longestUniformSubstring(testCase.getKey());
      pass = pass && (Arrays.equals(result, testCase.getValue()));
    }
    if(pass){
      System.out.println("All tests pass!");
    } else {
      System.out.println("At least one failure! :( ");
    }
  }
}