package selenium_90days;

public class JavaDay_1_OccuranceinString {

    public static void main(String[] args)
	{
    	String input = "You have no choice other than following me!";
    	int charCount = 0; 
         for(char ch: input.toCharArray()){
             if(ch == 'o'){
                 charCount++;
             }
         }    
         System.out.println("Occurance of o is : " +charCount);
     }
}



		/*
		 * 1. Write a Java Program to find the occurance of the character 'o' in the
		 * following String. Input: "You have no choice other than following me!"
		 * output: Occurance of o is: 6 2. Check for the palindrome of the given string:
		 * Input: "malayalam" output: Yes, Palindrome Input: "testleaf" output: No, not
		 * a palindrome1. 		 */
