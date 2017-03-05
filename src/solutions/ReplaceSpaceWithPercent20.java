package solutions;

import java.util.Scanner;

// Performing all these operations on a string would be very inefficient as string is immutable
// 
public class ReplaceSpaceWithPercent20
{
	public void formatString(String input)
	{
		char[] charArray = input.toCharArray();
		StringBuilder strBldr = new StringBuilder();
		for(int i=0; i<charArray.length;i++)
		{
			if(charArray[i]==' ')
			{
				strBldr.append('%');
				strBldr.append('2');
				strBldr.append('0');
			}
			else
				strBldr.append(charArray[i]);
		}
		System.out.println(strBldr);
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		ReplaceSpaceWithPercent20 rswp = new ReplaceSpaceWithPercent20();
		rswp.formatString(input);
	}

}
