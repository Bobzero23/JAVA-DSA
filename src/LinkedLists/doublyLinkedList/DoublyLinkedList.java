package LinkedLists.doublyLinkedList;

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

    /**method to insert a node in doubly linked list*/
    public void insertDLL(int location, int nodeValue) {
        Node newNode = new Node(); // initializing a new node
        newNode.value = nodeValue; // assigning a value
        if (head == null) { //in case we don't hava a linked list
            createDLL(nodeValue); // then we create one
            return;
        }else if (location == 0) { //inserting from the beginning
            newNode.prev = null; //first node's prev must be null it's DLL
            newNode.next = head; //linking newNode to the first node
            head.prev = newNode; //linking first node to new node
            head = newNode; //linking the head to the newNode
        }else if (location >= size) { //inserting at the end is kinda easy
            newNode.next = null;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            newNode.next = tempNode.next;
            newNode.prev = tempNode;
            newNode.next.prev = newNode;
            tempNode.next = newNode;
        }
        size++;
    }
}




/**SKETCHING
 *
 * First try to link the next and the prev of the new node you created
 *
 * {1,2,3,4,5,newNode,7,8,9,0}
 *
 * 5 = tempNode.value
 * 6 = newNode.value
 *
 * newNode.next = tempNode.next;       6 -> 7
 * newNode.prev = tempNode;            5 -> 6
 * newNode.next.prev = newNode;        7 -> 6
 * tempNode.next = newNode;            6 -> 5
 *
 * */

