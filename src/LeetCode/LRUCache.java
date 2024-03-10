package LeetCode;

import java.util.HashMap;
import java.util.Map;

class DoublyListNode {
    int value;
    int key;
    DoublyListNode next;
    DoublyListNode prev;
}


public class LRUCache {
    private Map<Integer, DoublyListNode> cache = new HashMap<>();
    private int capacity;
    private DoublyListNode head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new DoublyListNode();
        tail = new DoublyListNode();
        head.next = tail;
        tail.prev = head;
    }

    /** always adding a new node next to the head*/
    private void addNodeToHead(DoublyListNode node) {
    }
}
