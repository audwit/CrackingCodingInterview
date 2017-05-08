package arraysAndStringChapter1;

import java.util.Scanner;

//This solution replacecs duplicate characters with a 0
public class RemoveDuplicateCharactersSol3
{
	// Iterate through the characters and check if the character is duplicate. Replace the duplicate character 
	//with a 0.
	public void removeDuplicateElements(char[] str)
	{
		boolean[] character = new boolean[256];
		int tail =1;
		character[str[0]] = true; 
		for(int i=1;i<str.length;i++)
		{
			if(!character[str[i]]) // if str[i] is unique
			{
				character[str[i]] = true;
				str[tail]=str[i];
				tail++;
			}
		}
		
		for(int i=0;i<tail;i++)
			System.out.print(str[i]);
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		char[] str = input.toCharArray();
		RemoveDuplicateCharactersSol3 rdc = new RemoveDuplicateCharactersSol3();
		rdc.removeDuplicateElements(str);
	}

}
