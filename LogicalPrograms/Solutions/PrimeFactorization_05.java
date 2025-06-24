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

public class PrimeFactorization_05
{
  public static ArrayList<Integer> primeFactorization(int x)
  {
  ArrayList<Integer> factors = new ArrayList<Integer>();
/* if( x < 2 )
    return factors;
  for(int i = 2; i <= x; i++) 
  {
    while( x % i == 0 )
    {
    x = x / i;
    factors.add(i);  
    }    
  }*/
  if(x<2) {
	  factors.add(x)  ; return factors;
  }

  	for(int i=2; i<=x; i++) {
  		if(x%i==0) {
  			factors.add(i);
  			x= x/i;
  		}
  	}
  return factors;
  }

public static void main(String args[])
  {
	
	System.out.println(primeFactorization(6) + " " + primeFactorization(5)); 
	if(primeFactorization(6).equals(Arrays.asList(2,3)) 
			&& 
			primeFactorization(5).equals(Arrays.asList(5))
			) {
		System.out.println("All passed");
	}else {
		System.out.println("Failed");
	}
  
  }
}