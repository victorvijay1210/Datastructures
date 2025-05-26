package Linkedlist;

public class RemoveDuplicates {
	
	//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
	//time complexity is O(n).
	//space complexity is O(1)
	public static ListNode removeDuplicates(ListNode head) {
		if (head == null) return null;
		ListNode prev=head;
		ListNode temp=prev.next;
		
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

	
	

	public static ListNode createList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Utility: Print linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {1, 2, 3, 4},                 // No Duplicates
            {5, 5, 5, 5},                 // All Duplicates
            {1, 1, 2, 3, 3, 4, 4, 4, 5}, // Some Duplicates
            {7},                          // Single Element
            {},                           // Empty List
            {1, 2, 3, 4, 4, 4},          // Duplicates at End
            {1, 1, 1, 2, 3}              // Duplicates at Start
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.print("Original List " + (i + 1) + ": ");
            ListNode head = createList(testCases[i]);
            printList(head);

            ListNode result = removeDuplicates(head);
            System.out.print("After Removing Duplicates: ");
            printList(result);
            System.out.println("---------------------------------");
        }
    }
}
