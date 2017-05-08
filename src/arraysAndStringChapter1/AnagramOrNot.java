package arraysAndStringChapter1;

import java.util.Arrays;
import java.util.Scanner;

// To find if a string is an anagram or not we need to check
// 1. number of characters are the same
// 2. Count of each unique character should be the same
public class AnagramOrNot
{
	public void isAnagram(String s,String t)
	{
		char[] charSArray = s.toCharArray();
		int[] charCountArrayS = new int[256];
		int numberOfUniqueCharactersS=0;
		for(char c: charSArray) // This loop finds out count of each unique character and number of Unique Characters
		{
			if(charCountArrayS[c]==0)
				numberOfUniqueCharactersS++;
			charCountArrayS[c]++;
		}
		// Lets find out the count of each unique char and number of unique chars for T to
		char[] charTArray = t.toCharArray();
		int[] charCountArrayT = new int[256];
		int numberOfUniqueCharactersT=0;
		
		// We could have wrote a method to do this rather than copying the same code over here
		for(char c: charTArray) // This loop finds out count of each unique character and number of Unique Characters
		{
			if(charCountArrayT[c]==0)
				numberOfUniqueCharactersT++;
			charCountArrayT[c]++;
		}
		
		if(numberOfUniqueCharactersS == numberOfUniqueCharactersT)
			{
				if(Arrays.equals(charCountArrayS, charCountArrayT))
					System.out.println("S and T are anagram");
				else 
					System.out.println("S and T are NOT anagram");;
			}
		else
			System.out.println("S and T are NOT anagram");
		
	}

	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String inputS = scanner.nextLine();
		
		String inputF = scanner.nextLine();
		AnagramOrNot result = new AnagramOrNot();
		result.isAnagram(inputS, inputF);
		
		
	}

}
