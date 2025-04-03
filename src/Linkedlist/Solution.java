package Linkedlist;

//https://leetcode.com/problems/reverse-linked-list-ii/description/?envType=study-plan-v2&envId=top-interview-150
//reverse-linked-list-ii
public class Solution {

//	Time Complexity: O(n) 
//	Space Complexity: O(1) 
	
	public ListNode reverseBetween(ListNode head,int left,int right) {
		
		// create a dummy node to mark the head of this list
		ListNode dummyNode = new ListNode(0);	
		dummyNode.next=head;
		ListNode preleftNode=dummyNode;
		ListNode currentNode=head;
		
		for(int i=0;i<left-1;i++) {
			currentNode=currentNode.next;
			preleftNode=preleftNode.next;		 
			
		}
		
		
		
	 // make a marker to node where we start reversing
		ListNode sublistHeadNode= currentNode;
		
		ListNode previousNode=null;
		
		for(int i=0;i<=right-left;i++) {		
			ListNode nextNode= currentNode.next;
			currentNode.next=previousNode;
			previousNode=currentNode;
			currentNode=nextNode;		
		}
		
	 
		
		// Join the remaining pieces
		preleftNode.next=previousNode;
		sublistHeadNode.next=currentNode;
		
		
		return dummyNode.next;
		
		
		
	}

    // Test the function
    public static void main(String[] args) {
        // Example ListNode creation (1 -> 2 -> 3 -> 4 -> 5)
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Call reverseBetween method
        Solution solution = new Solution();
        ListNode result = solution.reverseBetween(head, 2, 4);
        

        // Output the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

