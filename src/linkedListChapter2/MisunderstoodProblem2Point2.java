package linkedListChapter2;

import java.util.Scanner;

public class MisunderstoodProblem2Point2
{
	public void PrintNtoEnd(Node temp, int n)
	{
		int numberOfNodes=0;
		while(temp!=null)
		{
			if(numberOfNodes>=n-1)
			{
				System.out.print(temp.data+" ");
			}
			temp=temp.next;
			numberOfNodes++;
		}
		if(numberOfNodes<n)
			System.out.print("The value of n should not be less than number of links");
	}
	public static void main(String[] args)
	{
		Node node = new Node(5);
		Node head = node;
		node.insertNode(5);
		node.insertNode(6);
		node.insertNode(7);
		node.insertNode(7);
		node.insertNode(6);
		
		MisunderstoodProblem2Point2 nToEnd = new MisunderstoodProblem2Point2();
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();
		nToEnd.PrintNtoEnd(head, Integer.parseInt(n));
	}

}
