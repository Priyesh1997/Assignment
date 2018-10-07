import java.util.Scanner;
class Node
{
	int data;
	Node next;
}
public class mergesortlink
{

	Node head;
	public void create(int n)
	{
		Scanner s = new Scanner(System.in);
		Node tmp = null;
		while(n > 0)
		{
			n--;
			System.out.println("Enter the data to insert");
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
	}
	public void display()
	{
		System.out.println("here");
		Node tmp = head;
		while(tmp != null)
		{
			System.out.print(tmp.data + " ");
			tmp = tmp.next;
		}
	}
	public mergesortlink merge(mergesortlink o)
	{
		mergesortlink on = new mergesortlink();
		Node t = head, k = o.head, ptr = null;
		while(t != null && k != null)
		{
			if(t.data < k.data) 
			{
				if(ptr == null)
				{
					on.head = t;
					ptr = t;
					t = t.next;
				}
				else
				{
					ptr.next = t;
					ptr = ptr.next;
					t = t.next;
				}
			}
			else
			{
				if(ptr == null)
				{
					on.head = k;
					ptr = k;
					k = k.next;
				}
				else
				{
					ptr.next = k;
					ptr = ptr.next;
					k = k.next;
				}
			}
		}
 		while(t != null)
 		{
 			ptr.next = t;
 			ptr = ptr.next;
 			t = t.next;
 		}
 		while(k != null)
 		{
 			ptr.next = k;
 			ptr = ptr.next;
 			k = k.next;
 		}
		return on;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first linklist");
		int n = sc.nextInt();
		mergesortlink obj = new mergesortlink();
		obj.create(n);
		System.out.println("first lin list is");
		obj.display();
		System.out.println("\nEnter the size of second linklist");
		int n1 = sc.nextInt();
		mergesortlink obj2 = new mergesortlink();
		obj2.create(n1);
		System.out.println("Second list");
		obj2.display();
		mergesortlink obj3 = obj.merge(obj2);
		System.out.println("After merging sorted linklist is");
		obj3.display();
	}
}