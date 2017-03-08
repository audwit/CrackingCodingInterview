package solutions;

import java.util.Scanner;
//1.8 Assume you have a method isSubstring which checks if one word is a substring of
//another Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using
//only one call to isSubstring (i e , “waterbottle” is a rotation of “erbottlewat”)

public class Problelm1Point8
{
	public void isRotation(String str1, String str2)
	{
		if(str1.length()== str2.length())
			{
				String str1str1=str1.concat(str1);
				
				if(str1str1.contains(str2))
					System.out.println("is a rotation");
				else
					System.out.println("is not a rotation");
			}
		else
			System.out.println("is not a rotation");
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		scanner.close();
		Problelm1Point8 p18 = new Problelm1Point8();
		p18.isRotation(str1, str2);
	}

}
