package Basics;

import Linkedlist.ListNode;

public class ReverseLinkedListii {
	
	
	public static ListNode reverse(ListNode head, int left, int right) {
		
		
		
		ListNode dummyNode = new ListNode(0);
		
		ListNode currentNode=head;
			
		dummyNode.next=currentNode;
		
		ListNode preLeftNode = dummyNode;
		
		for(int i=0;i<left-1;i++) {
			currentNode=currentNode.next;
			preLeftNode=preLeftNode.next;
		}
		
		ListNode subHeadNode=currentNode;
		
		
		ListNode previousNode =null;
		
		for(int i=0; i<right-left+1;i++) {
			ListNode nextNode= currentNode.next;
			currentNode.next=previousNode;
			previousNode=currentNode;
			currentNode=nextNode;
		}
		
		preLeftNode.next=previousNode;
		subHeadNode.next=currentNode;
       		
		
		
		return dummyNode.next;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Example ListNode creation (1 -> 2 -> 3 -> 4 -> 5)
		 ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(4);
	        head.next.next.next.next = new ListNode(5);
   
	    ListNode result=  reverse(head, 2, 4);
	        
	    // Output the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
	        
	}

}
