package Linkedlist;

public class ReverseLinkedList {
	
	
	public static ListNode reverseLinkedList(ListNode head) {
		
		
		ListNode preNode=null;
		
		ListNode currrentNode=head;
		
		while(currrentNode!=null) {	
			ListNode nextNode = currrentNode.next;
			currrentNode.next=preNode;
			preNode=currrentNode;
			currrentNode=nextNode;
		}
		
		
		
		return preNode;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Example ListNode creation (1 -> 2 -> 3 -> 4 -> 5)
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result= reverseLinkedList(head);
        
       while(result!=null) {
    	   System.out.println(result.val+" ");
    	   result=result.next;
       }
	}

}
