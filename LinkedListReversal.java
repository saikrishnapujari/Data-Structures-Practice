
public class LinkedListReversal {
	static Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	Node reverse(Node node){
		Node prev = null;
		Node curr = node;
		Node next = null;
		while(curr != null){
			//temporary variable to store next
			next = curr.next;
			//PREV <- CURR
			curr.next = prev;
			
			//Make current as previous
			prev = curr;
			//Make next as current
			curr = next;
		}
		node = prev;
		
		return node;
	}
	
	void traverse(Node node){
		while(node.next != null){
			System.out.println("Elements : "+node.data);
			node = node.next;
		}
		System.out.println("Elements : "+node.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListReversal lr = new LinkedListReversal();
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		System.out.println("Before reversal");
		lr.traverse(head);
		Node newHead = lr.reverse(head);
		System.out.println("After reversal");
		lr.traverse(newHead);
	}

}

