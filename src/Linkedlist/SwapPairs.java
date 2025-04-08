package Linkedlist;
//https://leetcode.com/problems/swap-nodes-in-pairs/description/
public class SwapPairs {
	//Time Complexity = O(n)	
    // Space Complexity: O(1)
	public static ListNode swapPairs(ListNode head) {
		 // Create a dummy node to ease things
		ListNode dummy = new ListNode(0);
		dummy.next=head;
		ListNode point = dummy;
		
		// Ensure nodes we are swapping are not null
		while (point.next != null && point.next.next != null) {

			 // Identify nodes to swap
			ListNode swap1 = point.next;
			ListNode swap2 = point.next.next;
          
			 // Actually swap
			swap1.next = swap2.next;
			swap2.next = swap1;
			
			// Prepare for next
			point.next = swap2;
			point = swap1;
		}

		return dummy.next;

	}

	// Optional: Helper to print the list (for testing)
	public static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + (head.next != null ? " → " : ""));
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		ListNode swaped = swapPairs(head);
		System.out.print("Rotated List: ");
		printList(swaped); // Output: 2->1->4->3
	}

}
