package solutions;

import java.util.Scanner;

public class RemoveDuplicateCharactersSol1
{
	public void removeDuplicateChars(char[] str)
	{
		int  tail=1; //Idea is to have all unique characters up to tail
		int length= str.length;
		for(int i=1;i<length;i++) 
		{
			int j;
			for(j=0;j<tail;j++)
			{
				// if i and j are the same we want to replace i with 0 or null.
				// Then forward march with i and compare with all the element upto j
				if(str[i]==str[j]) 
				{
					//str[i]='0';
					break;
				}
			}
			// if i does not match with any elements upto j
			// copy i to tail and increment tail
			if(j==tail)
			{
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
		char[]  input = scanner.nextLine().toCharArray();
		RemoveDuplicateCharactersSol1 rdc = new RemoveDuplicateCharactersSol1();
		rdc.removeDuplicateChars(input);
	}

}
