package linkedListChapter2;

public class Problem2PointFour
{
	public void addLinkedLists(Node head1,Node head2)
	{
		int sum=0;
		int carry=0;
		Node result=new Node();
		Node temp=result;
		while(head1!=null || head2!=null)
		{
			if(head1!=null && head2!=null)
				{
					sum = head1.data + head2.data+carry;
					carry = head1.data + head2.data>=10 ? 1:0;
				}
			if(head1!=null && head2==null) // When linked list2 is exhausted but list1 is not
			{
				sum = head1.data;
				carry = head1.data + head2.data>=10 ? 1:0;
			}
			if(head1==null && head2!=null)// When list1 is exhausted list2 is not
				sum = head2.data;
			
			//Update the value of sum if there is a value to be carried
			if(carry==1)
				sum=sum%10;
			temp.data=sum;
			//Create a new node to write each digit on the linked list
			Node node = new Node();
			temp.next=node;
			temp=temp.next;
			//advance head1 and head2
			head1=head1.next;
			head2=head2.next;
			
		}
		if(carry==1)
			{
				temp.data=1;
				temp.next=null;
			}
			
		
		System.out.println("Calculated");
	}
	public static void main(String[] args)
	{
		Node node1 = new Node(5);
		Node head1 = node1;
		node1.insertNode(2);
		node1.insertNode(3);
		
		
		Node node2 = new Node(5);
		Node head2 = node2;
		node2.insertNode(3);
		node2.insertNode(4);
		
		Problem2PointFour p24= new Problem2PointFour();
		p24.addLinkedLists(head1, head2);
		

	}

}
