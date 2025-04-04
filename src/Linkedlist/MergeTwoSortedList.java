package Linkedlist;

//Time Complexity: O(n + m)
//Space Complexity: O(n + m)
//https://leetcode.com/problems/merge-two-sorted-lists/description/?envType=study-plan-v2&envId=top-interview-150
public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    	
    	  // Create a sentinal/dummy node to start
    	ListNode headNode = new ListNode(Integer.MAX_VALUE);
    	
        // Create a copy of this node to iterate while solving the problem
    	ListNode resulListNode = headNode;
    	
    	 // Traverse till one of the list reaches the end
    	while(list1!=null && list2!=null) {
    		
    		if(list1.val<=list2.val) {
    			resulListNode.next=list1;
    			list1=list1.next;
    		}
    		
    		else {
    			resulListNode.next=list2;
    			list2=list2.next;
    		}
    		
			resulListNode=resulListNode.next;
    	}
    	
    	  // Use a while loop to add remaining nodes from either list1 or list2
    	while(list1!=null) {
    		resulListNode.next=list1;
    		list1=list1.next;
    		resulListNode=resulListNode.next;
    	}
    	
    	while(list2!=null) {
    		resulListNode.next=list2;
			list2=list2.next;
			resulListNode=resulListNode.next;
    	}
    	
    	// Return the next node to the dummy node (skip the dummy node)
		return headNode.next;
    	

    }

    // Helper method to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Helper method to create a linked list from an array
    public static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Main method to test
    public static void main(String[] args) {
    	MergeTwoSortedList solution = new MergeTwoSortedList();

        // Example 1: Merging two sorted lists
        int[] list1Arr = {1, 2, 4};
        int[] list2Arr = {1, 3, 4};
        ListNode list1 = createList(list1Arr);
        ListNode list2 = createList(list2Arr);
        
        ListNode mergedList = solution.mergeTwoLists(list1, list2);
        System.out.println("Merged List 1:");
        printList(mergedList); // Expected: 1 1 2 3 4 4

        // Example 2: One list is empty
        int[] list3Arr = {};
        int[] list4Arr = {0};
        ListNode list3 = createList(list3Arr);
        ListNode list4 = createList(list4Arr);
        
        ListNode mergedList2 = solution.mergeTwoLists(list3, list4);
        System.out.println("Merged List 2:");
        printList(mergedList2); // Expected: 0

        // Example 3: Both lists are empty
        ListNode list5 = null;
        ListNode list6 = null;

        ListNode mergedList3 = solution.mergeTwoLists(list5, list6);
        System.out.println("Merged List 3:");
        printList(mergedList3); // Expected: (Empty list)
    }
}
