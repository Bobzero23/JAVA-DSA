package LInkedLists.circularSinglyLinkedList;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    /**method to create circular singly linked list (CSLL)*/
    public Node createCSLL (int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    /**method to insert a node into a circular singly linked list*/
    public void insertCSLL(int nodeValue, int location) {
        Node node = new Node(); //creating the new node
        node.value = nodeValue; //initializing the value

        if (head == null) { //if there is no linked list yet,then we create it
            createCSLL(nodeValue);
            return;
        }else if (location == 0) { //inserting to the beginning
            node.next = head;
            head = node;
             tail.next = head;
        }else if (location >= size) { //inserting to the end
                tail.next = node;
                tail = node;
                tail.next = head;
        } else { //inserting anywhere else
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    /**method for traversing circular singly linked list*/
    public void traverseCSLL() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println();
        }else {
            System.out.println("The linked list is empty or doesn't exist..");
        }
    }

    /**method for searching in circular singly linked list*/
    public boolean searchCSLL(int nodeValue) {
        if (head == null) {
            System.out.println("The linked list is empty");
            return false;
        }else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("The node found at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("The node you are looking for does not exist");
        return false;
    }
}
