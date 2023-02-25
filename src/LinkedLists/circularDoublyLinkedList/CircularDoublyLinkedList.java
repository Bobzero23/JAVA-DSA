package LinkedLists.circularDoublyLinkedList;

public class CircularDoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    /**method to create a circular doubly linked list*/
    public Node creatCDLL(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = newNode;
        newNode.prev = newNode;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }
}
