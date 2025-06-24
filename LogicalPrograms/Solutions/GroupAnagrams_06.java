package Solutions;
import java.io.*;
import java.util.*;

public class GroupAnagrams_06 {
  
  static void setOfAnagrams(String inputString) {
    if (inputString == null || inputString.isEmpty()) {
      System.out.println("Input is empty");
      return;
    }

    String[] words = inputString.split(" ");
    Map<String, List<String>> anagramGroups = new HashMap<>();

    for (String word : words) {
      char[] chars = word.toCharArray();
      Arrays.sort(chars);
      String key = new String(chars);  // sorted version is the key

      if (!anagramGroups.containsKey(key)) {
    	    anagramGroups.put(key, new ArrayList<>());
    	}
    	anagramGroups.get(key).add(word);
    }

    // Now print all words from grouped anagrams
    for (List<String> group : anagramGroups.values()) {
      for (String word : group) {
        System.out.print(word + " ");
      }
    }
  }

  public static void main(String[] args) {
    String input = "cat dog tac sat tas god dog";
    setOfAnagrams(input);
  }
}
