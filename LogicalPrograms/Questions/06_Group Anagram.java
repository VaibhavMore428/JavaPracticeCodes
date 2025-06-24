import java.io.*;
import java.util.*;

/*
 * This program prints set of anagrams together in given string 
 * 
 * eg. 
 * setOfAnagrams("cat dog tac sat tas god dog") should print "cat tac dog god dog sat tas"
 *
 */

class Solution {
  
  static String input = "cat dog tac sat tas god dog";
  
  static void setOfAnagrams(String inputString){ 
    
    //your code goes here
	  
    Map<String, List<String>>map = new HashMap<String, List<String>>();
    String[] words = inputString.split(" ");
    for(String  word : words) {
    	char[] chars = word.toCharArray();
    	Arrays.sort(chars);
    	String newstring = new String(chars);
    	if(!map.containsKey(newstring)) {
    		map.put(newstring, new ArrayList<>());
    	}
    	map.get(chars).add(word);
    }
    for(List<String>anagram:map.values()) {
    	for(String word:anagram) {
    		System.out.println(word+ " ");
    	}
    }
    
  }
  
  
  public static void main(String[] args) {
    
    String input = "cat dog tac sat tas god dog";
    setOfAnagrams(input);
    
  }
}