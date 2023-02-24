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

    /**method to forwardly traverse doubly linked list*/
    public void forwardlyTraverseDLL() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                tempNode = tempNode.next;
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
            }
        }else {
            System.out.println("The linked list is empty or not found");
        }
        System.out.println();
    }

    /**method to backwardly traverse doubly linked list*/
    public void backwardlyTraverseDLL(){
        if (tail != null) {
            Node tempNode = tail;
            for (int i = size - 1; i >= 0; i--) {
                System.out.print(tempNode.value);
                tempNode = tempNode.prev;
                if (i != 0) {
                    System.out.print(" -> ");
                }
            }
        }else {
            System.out.println("The linked list does not exist");
        }
        System.out.println();
    }

    /**method to search a node in doubly linked list */
    public boolean searchDLL(int nodeToSearch) {
        if (head == null) {
            System.out.println("The linked list is empty or doesn't exist");
        }else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeToSearch) {
                    System.out.println("The node with value " + nodeToSearch + " is found at location: " + i);
                    return true;
                }else {
                    tempNode = tempNode.next;
                }
            }
        }
        System.out.println("The node is not found");
        return false;
    }

    /**method to delete a node in doubly linked list*/
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The linked list does not exist");
            return;
        }else if (location > size) {
            System.out.println("You have passed the size of the linked list");
        } else if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
            }else {
                head = head.next;
                head.prev = null;
                size--;
            }
        }else if (location == size) {
            Node tempNode = tail.prev;
            if (size == 1) {
                head = null;
                tail = null;
                size--;
            }else {
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
        }else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    /**method to delete the entire doubly linked list*/
    public void deleteEntireDLL() {
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
    }
}





/**INSERTION SKETCHING
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

