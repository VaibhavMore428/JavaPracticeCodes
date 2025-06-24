package stringPrograms;

import java.util.HashSet;
import java.util.Set;

public class CommonCharacterAmongMultipleStrings {

	public static void main(String[] arges) {
		String str1 = "India";
		String str2 = "Antartica";
		String str3 = "Africa";
		String str4 = "Irani";
		
		Set<Character> SetA1 = CommonElements(str1.toCharArray());
		Set<Character> SetA2 = CommonElements(str2.toCharArray());
		Set<Character> SetA3 = CommonElements(str3.toCharArray());
		Set<Character> SetA4 = CommonElements(str4.toCharArray());

		SetA1.retainAll(SetA2);
		SetA1.retainAll(SetA3);
		SetA1.retainAll(SetA4);
		System.out.println("Common element from Arrays= " + SetA1);
	}

	public static Set<Character> CommonElements(char[] arr) {
		Set<Character> set = new HashSet<Character>();
		for (char element : arr) {	
			set.add(element);
		}
		return set;
	}
}
/*
 * Logic- create method which returns character set from passed arrayOfCharacter. then Use
 * retainAll method from set it will store common elements from Array2 and
 * removed all uncommon elements do it same for all set
 */