package selenium_90days;

public class JavaDay_2_ReverseEvenStrings {

    public static void main(String[] args)
	{
    	String input = "When the world realise its own mistake, corona will dissolve automatically";
		String[] splitInput = input.split(" ");
		for (int i = 0; i < splitInput.length; i++) 
		{
			if(i%2 != 0)
			{
				StringBuffer buffer = new StringBuffer(splitInput[i]);
				splitInput[i] = buffer.reverse().toString();
			}
		}
		for (int i = 0; i < splitInput.length; i++) 
		{
			System.out.print(splitInput[i]+" ");
		}
}	}
/*
 * 2. Write a java program
 * to do the following. Input:
 * "When the world realise its own mistake, corona will dissolve automatically"
 * output:
 * "When eht world esilaer its nwo mistake, anoroc will evlossid automatically"
 */