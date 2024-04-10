package Linkedlist;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/**
public class MergeTwoSortedList {

public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode result = null;
        ListNode current= null;

        while(list1!=null && list2!=null){

          if(list1.val<=list2.val){


            if(current==null){
                current=list1;
                result=current;
            }
            else{
                current.next=list1;
                current=current.next;
                
            }
            list1=list1.next;
          }
          
        else{

          if(current==null){
                current=list2;
                result=current;
            }
            else{
                current.next=list2;
                current=current.next;
               
            }
        list2=list2.next;

        }

        

        }

    while(list1!=null){
      current.next=list1;
      list1=list1.next;
      current=current.next;

    }
    while(list2!=null){
      current.next=list2;
      current=current.next;
      list2=list2.next;
      

    }
    return result;


    }
}
*/