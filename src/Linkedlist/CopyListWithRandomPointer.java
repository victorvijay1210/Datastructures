package Linkedlist;

import java.util.Random;

//https://leetcode.com/problems/copy-list-with-random-pointer/description/?envType=study-plan-v2&envId=top-interview-150
public class CopyListWithRandomPointer {
// Time Complexity: O(n)
//Space Complexity: O(n)
	public static Node copyRandomList(Node head) {

		if (head == null) {
			return null;
		}

		Node curr = head;

		// Adding new Nodes and copying values
		while (curr != null) {
			Node newNode = new Node(curr.val);
			newNode.next = curr.next;
			curr.next = newNode;
			curr = newNode.next;
		}

		// Joining random pointer values for new Node
		curr = head;// to traverse the entire node we again initialize curr pointer at the head
		while (curr != null) {
			if (curr.random != null) {
				curr.next.random = curr.random.next;
			}
			curr = curr.next.next;

		}

		// connecting random pointer nodes together
		curr = head;// to traverse the entire node we again initialize curr pointer at the head
		Node newHead = head.next;// new head for new copied noded
		Node newCurr = newHead;// to traverse the entire node we again initialize newCurr pointer at the new
								// head

		while (curr != null) {

			curr.next = newCurr.next;
			curr = curr.next;
			if (curr != null) {
				newCurr.next = curr.next;
				newCurr = newCurr.next;
			}
		}

		return newHead;

	}

	public static void main(String[] args) {

		// Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
		// Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
		// Explanation: The original linked list is [7,13,11,10,1].
		// The copied linked list is [7,13,11,10,1].
		// The random pointer of node 7 is null, so it is not set to any node.
		// The random pointer of node 13 is node 7, so it is set to node 7, and so on.
		Node head = new Node(7);
		head.next = new Node(13);
		head.next.next = new Node(11);
		head.next.next.next = new Node(10);
		head.next.next.next.next = new Node(1);
		head.random = null;
		head.next.random = head;
		head.next.next.random = head.next.next.next.next;
		head.next.next.next.random = head.next.next;
		head.next.next.next.next.random = head;

		// Call copyRandomList to copy the list
		Node copiedHead = copyRandomList(head);

		// Print the copied list
		Node curr = copiedHead;
		while (curr != null) {
			System.out.println("Node Value: " + curr.val);
			if (curr.random != null) {
				System.out.println("Random Value: " + curr.random.val);
			} else {
				System.out.println("Random Value: null");
			}
			curr = curr.next;
		}

	}
}
