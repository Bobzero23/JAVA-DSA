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

    /**method to forward traverse circular doubly linked list*/
    public void forwardTraverseCDLL() {
        Node tempNode = head;
        if (head != null) {
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
        System.out.println();
    }

    /**method to backward traverse circular doubly linked list*/
    public void backwardTraverseCDLL() {
        Node tempNode = tail;
        if (tail != null) {
            for (int i = size; i > 0; i--) {
                System.out.print(tempNode.value);
                tempNode = tempNode.prev;
                if (i != 1) {
                    System.out.print(" -> ");
                }
            }
        }else {
            System.out.println("The linked list does not exist");
        }
        System.out.println();
    }

    /**method to search for a node in circular doubly linked list*/
    public boolean searchCDLL(int nodeValue) {
        Node tempNode = head;
        if (head != null) {
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("The node is found at location: " + i);
                    return true;
                }else {
                    tempNode = tempNode.next;
                }
            }
        }else {
            System.out.println("The linked list does not exist");
        }
        System.out.println("The node you are looking for does not exist");
        return false;
    }

    /**method to delete a node circular doubly linked list*/
    public void deleteNodeInCDDL(int location) {
        if (head == null) {
            System.out.println("The linked list does not exist");
            return;
        }else if (location == 0) {
            if (size == 1) {
                head.next = null;
                head.prev = null;
                head = tail = null;
                size--;
                return;
            }else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;
            }
        }else if (location >= size) {
            if (size == 1) {
                head.next = null;
                head.prev = null;
                head = tail = null;
                size--;
                return;
            }else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
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

    /**method to delete the entire circular doubly linked list*/
    public void deleteEntireCDLL() {
        Node tempNode = head;
        if (head != null) {
            for (int i = 0; i < size; i++) {
                tempNode.prev = null;
                tempNode = tempNode.next;
            }
            head = tail = null;
        }
        System.out.println("The entire CDLL is deleted successfully");
    }
}




