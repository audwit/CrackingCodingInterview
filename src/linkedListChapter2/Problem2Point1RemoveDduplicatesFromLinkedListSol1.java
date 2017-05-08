package linkedListChapter2;

import java.util.Hashtable;

public class Problem2Point1RemoveDduplicatesFromLinkedListSol1
{
	public void removeDuplicates(Node current)
	{
		Hashtable htable = new Hashtable();
		Node prev = current;
		while(current.next!=null)
		{
			if(htable.containsKey(current.data))
			{
				prev.next = current.next;
				current=current.next;
			}
			else
			{
				htable.put(current.data, true);
				prev=current;
				current=current.next;
			}
		}
		if(current.next==null && htable.containsKey(current.data))
		{
			prev.next=null;
		}
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
		Problem2Point1RemoveDduplicatesFromLinkedListSol1 linkedList = new Problem2Point1RemoveDduplicatesFromLinkedListSol1();
		linkedList.removeDuplicates(head);
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}

}
