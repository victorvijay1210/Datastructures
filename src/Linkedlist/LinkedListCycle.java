package Linkedlist;

//https://leetcode.com/problems/linked-list-cycle/?envType=study-plan-v2&envId=top-interview-150
public class LinkedListCycle {

	//Time Complexity = O(n)
	//Space Complexity = O(1)
	  public static boolean  hasCycle(ListNode head) {
	        
	        ListNode slow = head;
	        ListNode fast = head;

	        while(fast!=null && fast.next!=null){

	           slow = slow.next;
	           fast=fast.next.next;
	           if(slow==fast){
	            return true;
	           }   
	   
	        }
	     return false;
	    }

	  //linked list cycle creation
	  private static ListNode createCycleList(int[] values, int pos) {
	        if (values.length == 0) return null;

	        ListNode head = new ListNode(values[0]);
	        ListNode current = head;
	        ListNode cycleNode = null;

	        if (pos == 0) cycleNode = head;

	        for (int i = 1; i < values.length; i++) {
	            current.next = new ListNode(values[i]);
	            current = current.next;
	            if (i == pos) {
	                cycleNode = current;
	            }
	        }

	        if (pos != -1) {
	            current.next = cycleNode;
	        }

	        return head;
	    }
	  public static void main(String[] args) {
	        // Test case 1: head = [3,2,0,-4], pos = 1
	        int[] values1 = {3, 2, 0, -4};
	        int pos1 = 1;
	        ListNode head1 = createCycleList(values1, pos1);
	        System.out.println("Test case 1 (should be true): " + hasCycle(head1));

	        // Test case 2: head = [1,2], pos = 0
	        int[] values2 = {1, 2};
	        int pos2 = 0;
	        ListNode head2 = createCycleList(values2, pos2);
	        System.out.println("Test case 2 (should be true): " + hasCycle(head2));

	        // Test case 3: head = [1], pos = -1
	        int[] values3 = {1};
	        int pos3 = -1;
	        ListNode head3 = createCycleList(values3, pos3);
	        System.out.println("Test case 3 (should be false): " + hasCycle(head3));
	    }

}
