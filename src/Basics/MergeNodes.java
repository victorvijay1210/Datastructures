package Basics;

 public class MergeNodes {

	  // Follow the steps below to use this file

	  // 1. In the main file, create an instance of this class:
	  // NewClass1 instance1 = new NewClass1();

	  // 2. Call the method to get the greeting message:
	  // System.out.println(instance1.sayHelloFromNewClass());
	  
	  //   int[] list1Arr = {1, 2, 4};
	   //     int[] list2Arr = {1, 3, 4};
	   
	   
	   public static ListNode mergeNodes(ListNode list1, ListNode list2){
	     
	     ListNode headNode = new ListNode(Integer.MAX_VALUE);
	     
	     ListNode resultNode = headNode;
	     
	     while(list1!=null && list2!=null){
	       
	       if(list1.val<=list2.val){
	         resultNode.next=list1;
	         resultNode=resultNode.next;
	         list1=list1.next;
	       }
	       else{
	         resultNode.next=list2;
	         resultNode=resultNode.next;
	         list2=list2.next;
	       }
	     }
	     
	     while(list1!=null){
	        resultNode.next=list1;
	         resultNode=resultNode.next;
	         list1=list1.next;
	     }
	     
	     while(list2!=null){
	        resultNode.next=list2;
	         resultNode=resultNode.next;
	         list2=list2.next;
	     }
	     
	     return headNode.next;
	   }

	  public static ListNode createNode(int[] values){
	    ListNode head = new ListNode(0);
	    ListNode dummy=head;
	    
	    for(int num:values){
	      dummy.next= new ListNode(num);
	      dummy=dummy.next;
	    }
	    return head.next;
	  }
	  
	  public static void printListNode(ListNode node){
	    
	    while(node!=null){
	      System.out.println(node.val);
	      node=node.next;
	    }
	    System.out.println();
	  }

	   public static void main(String[] args) {
	        int[] list1Arr = {1, 2, 4};
	        int[] list2Arr = {1, 3, 4};
	        ListNode list1 = createNode(list1Arr);
	        ListNode list2 = createNode(list2Arr);
	        
	    ListNode merged = mergeNodes(list1,list2);
	    printListNode(merged);
	   }

	} 


