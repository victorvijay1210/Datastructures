package Linkedlist;

import java.util.List;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/?envType=study-plan-v2&envId=top-interview-150
public class DeleteDuplicates {

//Time Complexity: O(n)
//Space Complexity: O(1)
	public static ListNode deleteDuplicates(ListNode head) {
	    if (head == null || head.next == null) return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode prev = dummy;
		ListNode curr = head;

		while (curr != null) {

			// If the current node is a duplicate
			if (curr.next != null && curr.val == curr.next.val) {

				// Move to the last duplicated node
				while (curr.next != null && curr.val == curr.next.val) {
					curr = curr.next;
				}

				// Skip the duplicated nodes
				prev.next = curr.next;
			} else {
				// We have found a unique node
				prev = prev.next;
			}

			// Move to the next node
			curr = curr.next;
		}

		return dummy.next;
	}

	public static ListNode createList(int[] values) {
		if (values.length == 0)
			return null;
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
			if (current.next != null)
				System.out.print(" -> ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[][] testCases = { { 1, 2, 3, 3, 4, 4, 5 }, // 1,2,5
				{ 1, 1, 1, 2, 3 }, // 2,3

		};

		for (int i = 0; i < testCases.length; i++) {
			System.out.print("Original List " + (i + 1) + ": ");
			ListNode head = createList(testCases[i]);
			printList(head);

			ListNode result = deleteDuplicates(head);
			System.out.print("After deleting Duplicates: ");
			printList(result);
			System.out.println("---------------------------------");
		}
	}

}
