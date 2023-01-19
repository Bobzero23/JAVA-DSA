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
}
