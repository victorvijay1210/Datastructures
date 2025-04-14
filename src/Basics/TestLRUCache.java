package Basics;

import java.util.HashMap;
import java.util.Map;


public class TestLRUCache {
	
	Node head = new Node(0, 0);
	Node tail= new Node(0, 0);
	Map<Integer, Node> map = new HashMap<>();
	int initialCapacity ;
	
	//Set Initial capacity
	TestLRUCache(int initialCapacity){
		this.initialCapacity=initialCapacity;
		head.next=tail;
		tail.prev=head;
	}
	
	
	 int get(int key) {
		
		if(map.containsKey(key)) {
			 Node data = map.get(key);
			remove(data);
			insert(data);
			return data.value;
			
		}
		
		
		return -1;
		
		
	}
	
	
	
	void put(int key, int value) {
   if(map.containsKey(key)) {
     remove(map.get(key));
   }
   
   // if capacity is full we will remove node which is located just before tail
   if(initialCapacity==map.size()) {
	   remove(tail.prev);
   }
    	
  	insert(new Node(key, value));
    }
    
    
    void insert(Node node) {
     map.put(node.key, node);
     Node headNext=head.next;
     node.prev=head;
     head.next=node;
     node.next=headNext;
     headNext.prev=node;
 
    
    }
    
    void remove(Node node) {
    map.remove(node.key);
   
    node.prev.next=node.next;
    node.next.prev=node.prev;
    	
    }
	
	
	
	
	
	
	//Create Node
	class Node {
		
		Node next;
		Node prev;
		int key;
		int value;
		
		Node(int key,int value){
			this.key=key;
			this.value=value;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestLRUCache lRUCache = new TestLRUCache(2);
		lRUCache.put(1, 1); // cache is {1=1}
		lRUCache.put(2, 2); // cache is {1=1, 2=2}
		lRUCache.get(1); // return 1
		lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		lRUCache.get(2); // returns -1 (not found)
		lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
		System.out.println(lRUCache.get(1)); // return -1 (not found)
		System.out.println(lRUCache.get(3)); // return 3
		System.out.println(lRUCache.get(4)); // return 4

	}

}
