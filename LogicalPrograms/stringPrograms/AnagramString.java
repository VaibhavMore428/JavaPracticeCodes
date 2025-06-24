package stringPrograms;

import java.util.Arrays;

public class AnagramString {
		public static void main(String[] args) {
			String str1 ="Race";
			String str2 ="Care";
			
			if(str1.length() == str2.length()) {
				char[] charstr1 = str1.toCharArray();
				char[] charstr2 = str1.toCharArray();
				
				boolean anagram =	Arrays.equals(charstr1, charstr2);
				if(anagram) {
					System.out.println("Strings are anagram");
				}else {
					System.out.println("Strings are not anagram");
				}
			}else {
				System.out.println("Strings are not anagram");
			}
			
			
		}
}
