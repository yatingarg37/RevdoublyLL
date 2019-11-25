package assignments;

import java.util.Scanner;


public class revddll {
	Node head;

	static class Node {
		int data;
		Node next;
		Node prev;
		Node(int d) {
			data = d;
			next=null;
			prev=null;
		}
	}

	public static void display(revddll dl) {
		Node temp = dl.head;
		while (temp.next != null) {
			temp = temp.next;
		}
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp = temp.prev;
		}
	}
	public static void main(String arg[]) {
		revddll li = new revddll();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of data you want to enter");
		int n=sc.nextInt();
		System.out.println("Enter the data value");
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			insert(li,num);
		}
		li.display(li);
	}
	public static revddll insert(revddll li, int num) {
		Node new_Node = new Node(num);
		if(li.head==null) {
			li.head=new_Node;
		}
		else {
			Node temp=li.head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=new_Node;
			new_Node.prev=temp;
		}
		return li;
	}
}
