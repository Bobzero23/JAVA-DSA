package Test.test3;

public class Main {
    public static void main(String[] args) {
        Singly_Linked_List sll_object = new Singly_Linked_List();
        sll_object.create_node(5);
        System.out.println(sll_object.head.value);
    }

    public static class Singly_Linked_List{
        public Node head;
        public Node tail;
        public int size;

        public Node create_node(int node_value) {
            Node node = new Node();
            node.value = node_value;
            node.next = null;
            head = node;
            tail = node;
            size = 1;
            return head;
        }

        public void insert_node(int node_value, int node_location) {

        }
    }

    public static class Node{
        public int value;
        public Node next;
    }
}
