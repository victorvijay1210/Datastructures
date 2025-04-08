package Linkedlist;
//https://leetcode.com/problems/rotate-list/description/?envType=study-plan-v2&envId=top-interview-150
public class RotateLinkedList {
	
	//Time:O(n)
	//Space:O(1)
	public ListNode rotateRight(ListNode head , int k) {
		// Edge cases: empty list or only one node or no rotation
        if (head == null || head.next == null || k == 0) return head;	
        
     // Step 1: Find the length and tail of the list
		int length=1;
		ListNode tail=head;
		while(tail.next!=null) {
			tail=tail.next;
			length++;
		}
	
		// Step 2: Make the list circular for easy travesing
		tail.next=head;
		
// Step 3: Normalize k if k > length (find how may times to rotate for example in rotation i.e K=7 then the actuall rotation itself 2 i.e k=2)
	   k=k%length;
	  
	// Step 4: Find the new tail (length - k steps from head)
	 int stepToNewTailNode=length-k;
	 ListNode newTail=head;

	 for(int i=1;i<stepToNewTailNode;i++) {
		 newTail=newTail.next;
	 }
	 // Step 5: Set new head and break the circle
	 ListNode newHead=newTail.next;
	 newTail.next=null;

		return newHead;
		
	}
	
	
	
	 // Optional: Helper to print the list (for testing)
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " → " : ""));
            head = head.next;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        RotateLinkedList rll = new RotateLinkedList();

        // Create the linked list: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;
        ListNode rotated = rll.rotateRight(head, k);

        System.out.print("Rotated List: ");
       printList(rotated);  // Output: 4 → 5 → 1 → 2 → 3
    }

}
