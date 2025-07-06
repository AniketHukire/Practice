package Assignments;

public class middlenode {
	//node class to represend every node in the linked list
	static class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	//main class
	static public class MiddleNodeUsingSize{
		Node head;
		
		//method to add node at the end of list
		public void add( int data) {
			Node  newNode = new Node(data);
			
			if ( head == null)
			{
				head = newNode;
				return;
			}
			
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			
			temp.next = newNode;
		}
		//methode to count the number of nodes in the list
		 public int getSize() {
			 int count = 0;
			 Node temp = head;
			 
			 while(temp != null) 
			 {
				 count++;
				 temp = temp.next;
			 }
			 
			 return count;
		 }
		 //methode to find and prind midle node using getsize
		 public void printMiddle() {
			 int size = getSize(); // calling getSize method
			 if ( size == 0)
			 {
				 System.out.println(" The List is empty");
				 return;
			 }
			 int middelindex = size/2;
			 Node temp = head;
			 for( int i = 0; i < middelindex; i++)
			 {
				 temp = temp.next;
			 }
			 System.out.println("Middel Node data:- "+temp.data);
		 } 
	}
	public static void main(String [] args) {
		 MiddleNodeUsingSize list = new MiddleNodeUsingSize();
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 list.add(40);
		 list.add(50);
		 
		 list.printMiddle();
	 }
}
