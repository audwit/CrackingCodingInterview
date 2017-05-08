package arraysAndStringChapter1;

import java.util.Scanner;

public class ReverseString
{
	public void reverseStringInput(String input)
	{
		char[] x = input.toCharArray();
		char y;
		int length = input.length();
		
			for(int i=0; i<=length/2-1;i++)
			{
				y=input.charAt(i);
				x[i] = x[length-1-i];
				x[length-1-i] = y;
			}
		
		for(int i=0; i<x.length;i++)
			System.out.println(x[i]);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner = new  Scanner(System.in);
		String input = scanner.nextLine();
		
		ReverseString rs = new ReverseString();
		rs.reverseStringInput(input);
	}

}
