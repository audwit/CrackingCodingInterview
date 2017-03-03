package solutions;

import java.util.Scanner;

//This solution replacecs duplicate characters with a 0
public class RemoveDuplicateCharactersSol2
{
	// Iterate through the characters and check if the character is duplicate. Replace the duplicate character 
	//with a 0.
	public void removeDuplicateElements(char[] str)
	{
		boolean[] character = new boolean[256];
		
		for(int i=0;i<str.length;i++)
		{
			if(!character[str[i]])
			{
				character[str[i]] = true;
			}
			else
				str[i] = 0; 
		}
		System.out.println(str);
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		char[] str = input.toCharArray();
		RemoveDuplicateCharactersSol2 rdc = new RemoveDuplicateCharactersSol2();
		rdc.removeDuplicateElements(str);
	}

}
