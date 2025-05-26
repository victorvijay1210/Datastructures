package Basics;

public class RemoveDuplicates {
	
	public static ListNode removeDuplicate(ListNode head) {
		
		
		ListNode prev= head;
		ListNode temp = prev.next;
		
		while(temp!=null) {
			
			if(prev.val==temp.val) {
				temp=temp.next;
				continue;
			}
			
			prev.next=temp;
			prev=temp;
			temp=temp.next;
		}
		
		
		prev.next=null;
		
		
		
		return head;
		
	}
	
	
	
	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		head.next= new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(3);
		head.next.next.next.next=new ListNode(4);
		
	ListNode result= removeDuplicate(head);
		
		while(result!=null) {
			System.out.println(result.val +" ");
			result=result.next;
		}
	}
	
	
	

}
