package linkedListChapter2;

public class Problem2Point3DeletingAMiddleNode
{
	//This will not work if someone tries to delete the last node of the linked List
	public void deletingAMiddleNode(Node temp)
	{
		temp.data=temp.next.data;
		temp.next=temp.next.next;
	}
	public static void main(String[] args)
	{
		Node node = new Node(5);
		Node head = node;
		node.insertNode(5);
		node.insertNode(6);
		Node temp=node.next.next;
		node.insertNode(7);
		node.insertNode(7);
		node.insertNode(6);
		
		Problem2Point3DeletingAMiddleNode sol = new Problem2Point3DeletingAMiddleNode();
		sol.deletingAMiddleNode(temp);
		System.out.print("asddf");
	}
}
