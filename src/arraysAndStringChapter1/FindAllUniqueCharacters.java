package arraysAndStringChapter1;

import java.util.Scanner;

public class FindAllUniqueCharacters
{
	public boolean hasUniqueCharacters1(String str)
	{
		boolean[] checker = new boolean[256];
		for(int i=0; i<str.length(); i++)
		{
			int val = str.charAt(i);
			if(checker[val])
				return false;
			else
				checker[val]=true;
		}
		return true;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		FindAllUniqueCharacters findAllUniqueCharacters = new FindAllUniqueCharacters();
		if(findAllUniqueCharacters.hasUniqueCharacters1(inputString))
			System.out.println("All of the characters are unique");
		else
			System.out.println("There are duplicate characters");
	}

}
