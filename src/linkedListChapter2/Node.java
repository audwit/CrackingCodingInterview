package linkedListChapter2;

public class Node
{
	int data;
	Node next;
	
	
	

	public Node(int data)
	{
		this.data=data;
		//head=this;
		next=null;
		
	}
	public Node()
	{
		
	}
	
	public void insertNode(int data)
	{
		Node node = new Node();
		node.data=data;
		node.next = null;
		Node temp;
		
		temp=this;
		while(temp.next != null)
		{
			temp=temp.next;
		}
		temp.next = node;
	}
	
}
