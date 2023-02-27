package LinkedLists.circularDoublyLinkedList;

public class CircularDoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    /**method to create a circular doubly linked list*/
    public Node createCDLL(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = newNode;
        newNode.prev = newNode;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    /**insertion in circular doubly linked list*/
    public void insertToCDLL(int location, int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;

        if(head == null) {
            createCDLL(nodeValue);
            return;
        }else if(location == 0) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }else if(location >= size) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        }else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    /**method to forwardly traverse circular doubly linked list*/
    public void forwardTraversal() {
        Node tempNode = new Node();

        if (head != null) {
            tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                tempNode = tempNode.next;
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
            }
        }else {
            System.out.println("The linked list does not exist");
        }
    }

    /**method to backward traverse circular doubly linked list*/
    public void backwardTraversal() {
        Node tempnNode = new Node();

        if (tail != null) {
            tempnNode = tail;
            for (int i = size; i > 0; i--) {
                System.out.print(tempnNode.value);
                tempnNode = tempnNode.prev;
                if (i > 1) {
                    System.out.print(" -> ");
                }
            }
        }
    }

    /**method for search a node in circular doubly linked list*/
    public void searchCDLL(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("The node is found at location: " + i);
                    return;
                }else {
                    tempNode = tempNode.next;
                }
            }
        }else {
            System.out.println("The linked list does not exits");
        }
    }
}








