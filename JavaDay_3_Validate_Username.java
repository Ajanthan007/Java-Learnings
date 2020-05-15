package selenium_90days;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaDay_3_Validate_Username {

    public static void main(String[] args)
	{
     String str = "Testleaf@123";	
     String pattern = "[a-zA-Z0-9_ @ $]{8,}";
     Pattern compile = Pattern.compile(pattern);
     Matcher match = compile.matcher(str);
     System.out.println(match.matches()); 	
	}}

/*
 * 2. Write a java program to
 * validate the given username is valid or not Input: "Balaji_1" output: false
 * Input: "Testleaf$123" output: false Note: 1. It should contain minimum 8
 * characters. 2. It allows alpha numeric characters and spl characters like .
 * _ @ $
 */