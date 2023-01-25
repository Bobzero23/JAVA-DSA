package Test.test3;

public class Main {
    public static void main(String[] args) {
        Singly_Linked_List sll_object = new Singly_Linked_List();
        sll_object.insert_node(9, 0);
        sll_object.insert_node(10, 1);
        sll_object.insert_node(50, 2);
        System.out.println(sll_object.head.next.value);
    }

    public static class Singly_Linked_List{
        public Node head;
        public Node tail;
        public int size;

        public Node create_node(int node_value) {
            Node node = new Node();
            node.next = null;
            node.value = node_value;
            head = node;
            tail = node;
            size = 1;
            return head;
        }

        public void insert_node(int node_value, int node_location) {
            Node node = new Node();
            node.value = node_value;

            if (head == null) {
                create_node(node_value);
                return;
            }
            if(node_location == 0) {
                node.next = head;
                tail = node;

            }else if (node_location >= size){
                node.next = null;
                tail.next = node;
                tail = node;
            }else {
                Node temp_node = new Node();
                int index = 0;

                while (index < node_location - 1) {
                    temp_node = temp_node.next;
                }

                Node next_node = new Node();
                temp_node.next = node;
                node.next = next_node;
            }
            size++;
        }
    }

    public static class Node{
        public int value;
        public Node next;
    }
}
