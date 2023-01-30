package LInkedLists.Singly_LinkedList_demo;

public class Singly_LinkedList {

    /*Their types are node because both of them will be pointed to the node*/
    public Node head;
    public Node tail;
    public int size;


    /*method to create a singly linked list*/
    public Node create_singly_linkedList(int node_value) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = node_value;
        head = node;
        tail = node;
        size = 1;
        return  head;
    }

    /*method to insert a value to a singly linked list*/
    public void insert_into_linked_list(int node_value, int location) {
        Node node = new Node();
        node.value = node_value;

        /*if there is no linked list yet, then we create a linked list*/
        if(head == null) {
            create_singly_linkedList(node_value);
            return;
        }else if (location == 0) { //inset at the beginning
            node.next = head;
            head = node;
        }else if (location >= size) { //insert at the end
            node.next = null;
            tail.next = node;
            tail = node;
        }else{ //insert anywhere
            Node temp_node = head;
            int index = 0;
            while(index < location - 1) {
                temp_node = temp_node.next;
            }
            Node next_node = temp_node.next;
            temp_node.next = node;
            node.next = next_node;
        }
        size++;
    }

    /*method to traversal the singly linked list*/
    public void traversal_singly_linked_list(){
        if (head == null) {
            System.out.println("There is no value in the singly linked list..");
        }else {
            Node temp_node = head;
            for (int i = 0; i < size; i++) {
                System.out.print(temp_node.value);
                temp_node = temp_node.next;

                if (i != size - 1) {
                    System.out.print(" -> ");
                }
            }

        }
    }


    /*method to search a node in singly linked list*/
    public boolean search(int nodeToSearch) {
        if (head == null) {
            System.out.println("\nThe linked list is empty..");
        }else {
            Node temp_node = head;
            for(int i = 0; i < size; i++) {
                if (temp_node.value == nodeToSearch) {
                    System.out.println("\nThe node is found at location " + i);
                    return true;
                }
                temp_node = temp_node.next;
            }
        }
        System.out.println("\nThe node you are looking for is unavailable");
        return false;
    }

    public void delete(int location) {
        if (head == null) { // if the linked list has no element
            System.out.println("The linked list is empty");
            return;
        }else if (location == 0) {// if we have to delete the first element
            head = head.next;
            size--;
            if (size == 0) { // if the element we deleted was the only element in the sll
                tail = null;
            }
        }else if (location >= size - 1) { // if we have to delete the last element
            Node temp_node = head;
            for (int i = 0; i < size - 1; i++) {
                temp_node = temp_node.next;
            }
            if (temp_node == head) { // if the element we deleted was the only element in the sll
                head = tail = null;
                size--;
                return;
            }
            temp_node.next = null; // in case there was more element in the sll
            tail = temp_node;
            size--;
        }else { // if we have to delete the element at any location
            Node temp_node = head;
            for (int i = 0; i < location - 1; i++) {
                temp_node = temp_node.next;
            }
            temp_node.next = temp_node.next.next;
            size--;
        }
    }

    /*deleting the entire singly linked list*/
    public void deleteEntireLinkedList() {
        head = null;
        tail = null;
        System.out.println("The Entire singly linked list deleted successfully..");
    }
}
