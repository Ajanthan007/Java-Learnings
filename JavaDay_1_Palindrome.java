package selenium_90days;

import java.util.Scanner;

public class JavaDay_1_Palindrome {

    public static void main(String[] args)
	{
    	String str = "madam", rev = "";
        int length = str.length();
   
        for ( int i = length - 1; i >= 0; i-- )
           rev = rev + str.charAt(i);
   
        if (str.equals(rev))
           System.out.println(str+" is a palindrome");
        else
           System.out.println(str+" is not a palindrome");
   
     }
  }

		/* 
		 *  2. Check for the palindrome of the given string:
		 * Input: "malayalam" output: Yes, Palindrome Input: "testleaf" output: No, not
		 * a palindrome1.
		 */
