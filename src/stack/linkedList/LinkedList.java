package stack.linkedList;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        return head;
    }

    public void insertIntoLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if(head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        }else{
            node.next = head;
            head = node;
        }
        size++;
    }

    public void delete(int location) {
        if (head == null) {
            System.out.println("The linked list is empty");
            return;
        }else {
            head = head.next;
            if (size == 0) {
                tail = null;
            }
            size--;
        }
    }
}
