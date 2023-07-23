package hackerRank;

//Question 5: Merge and Sort the elements in two Linked-List
//Skill Mapping: Intermediate
//Description: Consider two Linked-List with N number of integers in Data-Node respectively.
//Task 1- WAP in Java to merge both Linked-Lists.
//Task 2 - Sort the output Linked-List basis of its Data-Node in ascending order.
//Sample input: Linked-List-1:- 25->35->12->4->36->48
//Linked-List-2:- 8->32->22->45->63->49
//Output:- 4->8->12->22->25->32->35->36->45->48->49->63

public class LL_merge_sort {
	static class ListNode{
		int val;
		ListNode next;
		
		ListNode(int val){
			this.val=val;
		}
	}
	public static ListNode merge(ListNode h1,ListNode h2) {
		ListNode c1=h1;
		ListNode p1=null;
		while(c1!=null ) {              //just go to end of LL1 and enterr address of h2 in last node address part 
			p1=c1;
			c1=c1.next;
		}
		p1.next=h2;
		return h1;
	}
	public static ListNode msLL(ListNode h1) {   
		ListNode c1=h1;
		int temp;
		ListNode c2=null;
		while(c1!=null ) {
			c2=c1.next;
			while(c2!=null) {
				if(c2.val<=c1.val) {                   //just swap data not address
					temp=c1.val;					//i have not tried to change the link
					c1.val=c2.val;
					c2.val=temp;
				}
				c2=c2.next;
			}
			c1=c1.next;
		}
		
		return h1;
		}
	public static void printLL(ListNode head) {
		ListNode curr=head;
		while(curr!=null) {
			System.out.print(curr.val+" -> ");
			curr=curr.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		ListNode h1=new ListNode(6);                //insert data like this or using methods insert at beg,middlevor end
		h1.next=new ListNode(2);
		h1.next.next=new ListNode(15);
		h1.next.next.next=new ListNode(2);
		h1.next.next.next.next=new ListNode(3);
		h1.next.next.next.next.next=new ListNode(40);
		h1.next.next.next.next.next.next=new ListNode(6);
		
		ListNode h2=new ListNode(5);
		h2.next=new ListNode(10);
		h2.next.next=new ListNode(14);
		h2.next.next.next=new ListNode(13);
		h2.next.next.next.next=new ListNode(12);
		h2.next.next.next.next.next=new ListNode(4);
		h2.next.next.next.next.next.next=new ListNode(16);
		
		System.out.println("Original Linked List 1: ");
		printLL(h1);
		System.out.println("Original Linked List 2: ");
		printLL(h2);
		
	
		ListNode head= merge(h1,h2);                           
		System.out.println("After merge elements in LL");
		printLL(head);
		
		ListNode msHead=msLL(head);
		System.out.println("After sorting elements in LL");
		printLL(msHead);

	}

}

//                   	TEST CASE 1
//Original Linked List 1: 
//6 -> 2 -> 15 -> 2 -> 3 -> 40 -> 6 -> null
//Original Linked List 2: 
//5 -> 10 -> 14 -> 13 -> 12 -> 4 -> 16 -> null
//After merge elements in LL
//6 -> 2 -> 15 -> 2 -> 3 -> 40 -> 6 -> 5 -> 10 -> 14 -> 13 -> 12 -> 4 -> 16 -> null
//After sorting elements in LL
//2 -> 2 -> 3 -> 4 -> 5 -> 6 -> 6 -> 10 -> 12 -> 13 -> 14 -> 15 -> 16 -> 40 -> null

