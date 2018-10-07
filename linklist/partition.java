import java.util.Scanner;
class Node
{
	int data;
	Node next;
}
public class partition
{

	public Node create(int n,Node head)
	{
		Scanner s = new Scanner(System.in);
		Node tmp = null;
		System.out.println("Enter the data's to insert");
		while(n > 0)
		{
			n--;
			int d = s.nextInt();
			Node newnode = new Node();
			newnode.data = d;
			if(head == null)
			{
				head = newnode;
				tmp = newnode;
			}
			else
			{
				tmp.next = newnode;
				tmp = tmp.next;
			}
		}
		return head;
	}
	public void display(Node head)
	{
		Node tmp = head;
		while(tmp != null)
		{
			System.out.println(tmp.data + " ");
			tmp = tmp.next;
		}
	}
	public Node shift(Node head)
	{
		Node ptr = head,eptr = null,e = null,o = null,optr = null;
		while(ptr != null)
		{
			if(ptr.data % 2 == 0)
			{
				if(e == null)
				{
					e = ptr;
					eptr = ptr;
				}
				else
				{
					eptr.next = ptr;
					eptr = eptr.next;
				}
			}
			else
			{
				if(o == null)
				{
					o = ptr;
					optr = ptr;
				}
				else
				{
					optr.next = ptr;
					optr = optr.next;
				}	
			}
			ptr = ptr.next;
			if(optr!=null) optr.next = null;
			if(eptr!=null) eptr.next=null;
		}
		if(e == null) return o;
		else if(o == null) return e;
		else
		{
		optr.next = e;		 
		return o;
		}
	}
	public static void main(String args[])
	{
		Node head = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of linklist");
		int n = sc.nextInt();
		partition obj = new partition();
		head = obj.create(n,head);
		Node p = obj.shift(head);
		System.out.println("After shifting odd and even element list is");
		obj.display(p);
	}
}
