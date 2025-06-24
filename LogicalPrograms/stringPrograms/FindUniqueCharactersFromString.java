package stringPrograms;

import java.util.Map;
import java.util.TreeMap;

/* Use map to store occurence of character in string
 * Once map has all characters with occurence
 * then use advance for concat new string which occurence single character 
 * 
 * */

public class FindUniqueCharactersFromString {
	public static void main(String[] args) {
		String str = "Vaibhav";
		Map<Character, Integer> map = new TreeMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}
		StringBuilder UniqueString = new StringBuilder();

		for (Map.Entry<Character, Integer> ms : map.entrySet()) {
			if (ms.getValue() == 1) {
				UniqueString.append(ms.getKey());
			}
		}
		System.out.println("Uniques Elements are= " + UniqueString);
	}
}
