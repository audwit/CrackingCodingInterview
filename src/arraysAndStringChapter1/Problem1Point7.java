package arraysAndStringChapter1;

import java.util.Scanner;
//1.7 Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
//column is set to 0
public class Problem1Point7
{
	public void formatMartix(int a[][])
	{
		int[] RowsWithZeros = new int[a.length]; 
		int[] ColumnWithZeros = new int[a[0].length]; 
		System.out.println(RowsWithZeros.length +"  " + ColumnWithZeros.length );
		
		// Now iterate through the a[][] and find out which rows and columns have zeroes
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]==0)
					{
						RowsWithZeros[i]=1;
						ColumnWithZeros[j]=1;
					}
				else
					{
						RowsWithZeros[i]=0;
						ColumnWithZeros[j]=0;
					}
			}
		}
		
		// Iterate through the array and replace the appropriate Rows and columns with Zeroes
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(RowsWithZeros[i]==1 || ColumnWithZeros[j]==1)
					a[i][j]=0;
			}
		}
	}
	public static void main(String[] args)
	{
		int row=0,column=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		try
			{
				row = Integer.parseInt(scanner.nextLine()); 
			}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println("Enter the number of columns");
		try
		{
			column = Integer.parseInt(scanner.nextLine()); 
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		int[][] a = new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println("Enter value of Row"+i+"Column"+j);
				a[i][j] = Integer.parseInt(scanner.nextLine());
			}
		}
			
		Problem1Point7 p17 = new Problem1Point7();
		p17.formatMartix(a);
	}
	

}
