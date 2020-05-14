package selenium_90days;

public class JavaDay_2_Q1 {

    public static void main(String[] args)
	{
      String str = "asdf1qwer9as8d7";
      char[] ch = str.toCharArray();
      int sum = 0 ;
      int len = ch.length;
	  for(int i=0;i<=len-1;i++) 
	  {
	  if(Character.isDigit(ch[i]))
	  {
			int newsum = Character.getNumericValue(ch[i]);
			sum=sum + newsum;	
		}
		}
		System.out.println("Sum of the digits in the string is: "+sum);
	}
}	
/*
 * Difficulty level: Medium 1. Write a java code to find the sum of the given
 * numbers Input: "asdf1qwer9as8d7" output: 1+9+8+7 = 25 
 */