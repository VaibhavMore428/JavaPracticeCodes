/* 
*    ****** IMPORTANT ******
* THIS IS SAMPLE SOLUTION. IF YOU FIND BETTER SOLUTION PLEASE CONSIDER USING SAME.
* USE YOUR OWN VARIABLE NAMES - @@@ DO NOT COPY @@@ EXACT VARIABLE NAMES
*
*/
package Solutions;

import java.util.LinkedHashMap;
import java.util.Map;
public class FirstNonRepeating_11 {

	 public static char findFirst(String input)
	  {
	    // code goes here
		 Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		 for(int i =0; i<input.length(); i++) {
			 char ch = input.charAt(i);
			 if(!map.containsKey(ch)) {
				 map.put(ch, 1);
			 }else {
				 map.put(ch, map.get(ch)+1);
			 }
		 }
		 for(Map.Entry<Character, Integer>ms: map.entrySet()) {
			 if(ms.getValue()==1) {
				 return ms.getKey();
			 }
		 }
	    return '-';
	  }


  public static void main(String[] args){
        String[] inputs = {"apple","racecars", "ababdc"};
    char[] outputs = {'a', 'e', 'd' };

    boolean result = true;
    for(int i = 0; i < inputs.length; i++ )
    {
      result = result && findFirst(inputs[i]) == outputs[i];
      if(!result)
        System.out.println("Test failed for: " + inputs[i]);
      else
        System.out.println("Test passed for: " + inputs[i]);
    }

  }
}