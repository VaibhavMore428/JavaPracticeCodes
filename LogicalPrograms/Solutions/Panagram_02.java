/* 
*					******** IMPORTANT ********
*
* THIS IS SAMPLE SOLUTION. IF YOU FIND BETTER SOLUTION PLEASE CONSIDER USING SAME.
* USE YOUR OWN VARIABLE NAMES - @@@ DO NOT COPY @@@ EXACT VARIABLE NAMES
*
*/
package Solutions;
import java.io.*;
import java.util.*;

public class  Panagram_02 {	
	public static void main(String[] args) {
		
		boolean success = true;

		success = success && "".equals(findMissingLetters("The quick brown fox jumps over the lazy dog"));
		success = success && "abcdefghijklmnopqrstuvwxyz".equals(findMissingLetters(""));

		if (success) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
	}
	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

		public static String findMissingLetters(String sentence) {
			Set<Character> missing = new HashSet<Character>();
			
			for (char c : ALPHABET.toCharArray()) {
				missing.add(c);
			}

			for (char ch : sentence.toLowerCase().toCharArray()) {
				if (Character.isLetter(ch)) {
					missing.remove(ch);
				}
			}
			List<Character> ls = new ArrayList<Character>(missing);
			Collections.sort(ls);
			StringBuilder result = new StringBuilder();
			
			for (char c : ls) {
				result.append(c);
			}
			return result.toString();
		}
}