package Test.test2;

public class Linked_list {
    public Node head;
    public Node tail;
    public int size;

    public Node create_linked_list(int node_value){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = node_value;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
}
