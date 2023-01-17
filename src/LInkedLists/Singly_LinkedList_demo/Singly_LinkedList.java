package LInkedLists.Singly_LinkedList_demo;

public class Singly_LinkedList {

    /*Their types are node because both of them will be pointed to the node*/
    public Node head;
    public Node tail;
    public int size;


    public Node create_singly_linkedlist(int node_value) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = node_value;
        head = node;
        tail = node;
        size = 1;
        return  head;
    }
}
