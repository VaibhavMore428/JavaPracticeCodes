package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class PrintCharacterOccurenceOfString {
		public static void main(String[] args) {
			String str= "aaabbccca";
			//output = "4a2b3c"
			
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			for(int i=0; i<str.length();i++) {
				char ch = str.charAt(i);
				if(!map.containsKey(ch)) {
					map.put(ch, 1);
				}else {
					map.put(ch, (map.get(ch))+1);
				}
			}
			StringBuilder compressString = new StringBuilder();
			for(Map.Entry<Character, Integer> ms : map.entrySet()) {
				compressString.append(ms.getValue()+""+ms.getKey());
			}
		System.out.println("Compress String is= "+compressString);
		
		}
}
