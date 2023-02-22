package LInkedLists.doublyLinkedList;

public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    /**method to create a doubly linked list*/
    public Node createDLL(int nodeValue) {
        head = new Node();
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.prev = null;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }
}
