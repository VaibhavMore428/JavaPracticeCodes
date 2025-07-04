 import java.util.HashSet;

public class Solution {

  public static HashSet<String> uniqueTuples( String input, int len ) {
    // your code
	  HashSet<String> result = new HashSet<String> ();
	  if(input ==null || input.length()==0 || len>=input.length()){
		  return result;
	  }
		 for(int i=0; i<input.length()-len; i++) {
			 String tuple = input.substring(i,i+len);
			 result.add(tuple);
		 }
    return result;
  }

  public static void main( String[] args ) {
    String input = "aab";
    HashSet<String> result = uniqueTuples( input, 2 );
    if( result.contains( "aa" ) && result.contains( "ab" ) ) {
      System.out.println( "Test passed." );
     
    } else {
      System.out.println( "Test failed." );
      
    }
  }
}