/* 
*					******** IMPORTANT ********
*
* THIS IS SAMPLE SOLUTION. IF YOU FIND BETTER SOLUTION PLEASE CONSIDER USING SAME.
* USE YOUR OWN VARIABLE NAMES - @@@ DO NOT COPY @@@ EXACT VARIABLE NAMES
*
*/

public class Solution
{

  public static double findMedianSortedArrays(int[] A, int[] B) {
  int m = A.length, n = B.length;
  int l = (m + n + 1) / 2;
  int r = (m + n + 2) / 2;
  return (getkth(A, 0, B, 0, l) + getkth(A, 0, B, 0, r)) / 2.0;
  }

  public static double getkth(int[] A, int aStart, int[] B, int bStart, int k) {
  if (aStart > A.length - 1) return B[bStart + k - 1];
  if (bStart > B.length - 1) return A[aStart + k - 1];
  if (k == 1) return Math.min(A[aStart], B[bStart]);

  int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
  if (aStart + k / 2 - 1 < A.length) aMid = A[aStart + k / 2 - 1];
  if (bStart + k / 2 - 1 < B.length) bMid = B[bStart + k / 2 - 1];

  if (aMid < bMid)
     return getkth(A, aStart + k / 2, B, bStart, k - k / 2);// Check: aRight + bLeft
  else
     return getkth(A, aStart, B, bStart + k / 2, k - k / 2);// Check: bRight + aLeft
  }


  public static boolean doTestsPass()
  {
  boolean result = true;
  result = result && findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4}) == 2.5;
  result = result && findMedianSortedArrays(new int[]{1, 3}, new int[]{2}) == 2.0;
  return result;
  };


  public static void main(String[] args)
  {
  if(doTestsPass())
  {
    System.out.println("All tests pass");
  }
  else
  {
    System.out.println("There are test failures");
  }
  }
}
