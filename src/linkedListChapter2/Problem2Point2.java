package linkedListChapter2;

import java.util.Scanner;

public class Problem2Point2
{
	public void NthFromEnd(Node temp1, int n)
	{
		int length=0;
		Node temp2=temp1;
		while(temp1!=null) // Finding the length of the linked list
		{
			temp1=temp1.next;
			length++;
		}
		if(length-n>0)
		{
			for(int i=0;i<length-n-1;i++)
			{
				temp2=temp2.next;
			}
			System.out.println("length is"+ length );
			System.out.println("Nth node from the last is "+ temp2.data );
		}
		else
			System.out.println("Invalid value of n");
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
		
		Problem2Point2 nToEnd = new Problem2Point2();
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();
		nToEnd.NthFromEnd(head, Integer.parseInt(n));
	}

}
