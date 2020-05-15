package selenium_90days;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaDay_3_Validate_Email {

    public static void main(String[] args)
	{
     String str = "balaji.chandrasekaran@testleaf.com";	
     String pattern = "[a-zA-Z0-9._]+@[a-z0-9]+.[a-z.]{2,}";
     Pattern compile = Pattern.compile(pattern);
     Matcher match = compile.matcher(str);
     System.out.println(match.matches()); 	
	}}

/*
 * 1. Write a java program to verify whether the given String is valid email
 * address. Input: "balaji.chandrasekaran@testleaf.com" output: true Input:
 * "balaji.c@tunatap.co.uk" output: true Input: "naveen e@tl.com" output: false
 * Note: Spl characters like . _ are only allowed 
 */