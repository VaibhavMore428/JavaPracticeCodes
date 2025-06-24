/* 
*					******** IMPORTANT ********
*
* THIS IS SAMPLE SOLUTION. IF YOU FIND BETTER SOLUTION PLEASE CONSIDER USING SAME.
* USE YOUR OWN VARIABLE NAMES - @@@ DO NOT COPY @@@ EXACT VARIABLE NAMES
*
*/
package Solutions;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueTuples_21 {

	public static HashSet<String> uniqueTuples(String input, int len) throws IllegalArgumentException {
		HashSet<String> resultSet = new HashSet<String>();
		
		if(input == null) {
			throw new IllegalArgumentException("Input string cannot be null");
		}
		if(input.length()== 0) {
			throw new IllegalArgumentException("String can't be empty");
		}
		if(len<=0) {
			throw new IllegalArgumentException("Touple length must be greater than zero");
		} 
		if (len > input.length()) {
            throw new IllegalArgumentException("Tuple length cannot be greater than input string length.");
        }
		
		for(int i = 0; i<=input.length()-len;i++) {
			
			String tuple = input.substring(i,i+len);
			
			 resultSet.add(tuple);
		}
		return resultSet;
	}

	public static void main(String[] args) {
		
		String input = "aab";
		String input1 = "abbccde";

		HashSet<String> result = uniqueTuples(input, 2);
		HashSet<String> result1 = uniqueTuples(input1, 2);
		
		if ((result.contains("aa") && result.contains("ab"))
				&& (result1.containsAll(Arrays.asList("ab", "bb", "bc", "cc", "cd", "de")) && result1.size() == 6)) {
			System.out.println("Test passed.");
		} else {
			System.out.println("Test failed.");
		}

	}
}