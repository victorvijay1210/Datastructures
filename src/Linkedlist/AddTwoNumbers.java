package Linkedlist;

//https://leetcode.com/problems/add-two-numbers/description/?envType=study-plan-v2&envId=top-interview-150
//add-two-numbers in a linked list
public class AddTwoNumbers {

//Time complexity: O(n)
//Space complexity: O(n)
public ListNode addTwoNumbers(ListNode l1,ListNode l2) {
	
	ListNode resultNode = new ListNode(0);
	ListNode ptr= resultNode;
	
	int carry = 0;  // Set default carry
	
	while(l1!=null || l2!=null) {
		
		int sum = 0 + carry;  // Initialize sum
		
		if(l1!=null) {	 // Use number from first list
			sum=sum + l1.val;
			l1=l1.next;
		}
		
		if(l2!=null) { // Use number from 2nd list
			sum=sum+l2.val;
			l2=l2.next;
		}
		
		carry=sum/10;  // Get sum and carry
		sum=sum%10;
		ptr.next=new ListNode(sum);
		ptr=ptr.next;
		
	}
	
	if(carry==1) {
		ptr.next=new ListNode(1);
	}
	
	
	return resultNode.next;
	
}

    public static void main(String[] args) {
        // First number: 342 -> represented as 2 -> 4 -> 3
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        // Second number: 465 -> represented as 5 -> 6 -> 4
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        AddTwoNumbers solver = new AddTwoNumbers();
        ListNode result = solver.addTwoNumbers(l1, l2);

        // Expected result: 807 -> represented as 7 -> 0 -> 8
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) System.out.print(" -> ");
            result = result.next;
        }
        System.out.println();
    }
}
