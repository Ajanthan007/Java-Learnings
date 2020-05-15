package selenium_90days;

public class JavaDay_2_FindingCharacter {

    public static void main(String[] args)
	{
    	String str ="1. It is Work from Home  not Work for Home";
    	
    	String strNo = str.replaceAll("[^0-9]", "");
    	int num = strNo.length();
    	System.out.println("The count of numbers in string is:" + num );
    	
    	String strupper = str.replaceAll("[A-Z]", "");
    	int upper = strupper.length();
    	System.out.println("The count of Uppercase letters in string is:" +(str.length()- upper) );
    	
    	String strlower = str.replaceAll("[a-z]", "");
    	int lower = strlower.length();
    	System.out.println("The count of Lowercase letters in string is:" +(str.length()- lower));
    	
    	String strchar = str.replaceAll(" ", "");
    	int splchar = strchar.length();
    	System.out.println("The count of space in string is:" + (str.length()-splchar) );
    	
	}}
/*
 * 3. Write a java program to find the number of Uppercase, lowercase, numbers
 * and spaces in the following String. Input:
 * "1. It is Work from Home not Work for Home"
 */