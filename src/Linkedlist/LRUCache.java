package Linkedlist;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/lru-cache/?envType=study-plan-v2&envId=top-interview-150
//Time complexity : O(1)

class LRUCache {

	Node head = new Node(0, 0);
	Node tail = new Node(0, 0);
	Map<Integer, Node> map = new HashMap<>();
	int capacity;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		head.next = tail;
		tail.prev = head;
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			Node data = map.get(key);
			// move data to the top
			// remove the node
			remove(data);
			// insert it
			insert(data);
			return data.value;
		}
		return -1;
	}

	public void put(int key, int value) {
		// if value is already present we move it to top
		if (map.containsKey(key)) {
			remove(map.get(key));
		}
		// if cache is full
		if (capacity == map.size()) {
			remove(tail.prev);
		}
		// tail.prev --> least recently used
		insert(new Node(key, value));
	}

	void remove(Node node) {
		map.remove(node.key);
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}

	void insert(Node node) {
		map.put(node.key, node);
		Node headNext = head.next;
		head.next = node;
		node.prev = head;
		headNext.prev = node;
		node.next = headNext;
	}

	// implementation of doubly linked list
	class Node {
		Node prev;
		Node next;
		int key, value;

		Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	public static void main(String[] args) {
		LRUCache lRUCache = new LRUCache(2);
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
