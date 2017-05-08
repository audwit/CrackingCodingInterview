package linkedListChapter2;

public class Problem2Point1RemoveDduplicatesFromLinkedListSol2
{
	void removeDuplicateNodes(Node head)
	{
		Node current=head;
		Node runner;
		Node runnerPrev=head;
		
			while(current!=null && current.next!=null)
			{
				runner=current.next;
				runnerPrev=current;
				while(runner!=null)
				{
					if(current.data==runner.data)
						{
							runnerPrev.next=runner.next;
							runner=runner.next;
						}
					else
					{
						runnerPrev=runner;
						runner=runner.next;
					}
				}
				current=current.next;
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
		Problem2Point1RemoveDduplicatesFromLinkedListSol2 linkedList = new Problem2Point1RemoveDduplicatesFromLinkedListSol2();
		linkedList.removeDuplicateNodes(head);
		
		// Print the linked list
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}

	}


