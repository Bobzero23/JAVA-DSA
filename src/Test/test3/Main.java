package Test.test3;

public class Main {
    public static void main(String[] args) {
        Singly_Linked_List sll_object = new Singly_Linked_List();
        sll_object.insert_node(9, 0);
        sll_object.insert_node(10, 1);
        sll_object.insert_node(50, 2);
        sll_object.insert_node(68, 3);
        sll_object.insert_node(59, 4);
        sll_object.insert_node(26, 5);
        sll_object.insert_node(95, 6);
        sll_object.traversal();
        sll_object.search(68);
        sll_object.delete(3);
        sll_object.traversal();
        sll_object.search(68);
    }

    public static class Singly_Linked_List{
        public Node head;
        public Node tail;
        public int size;

        /**METHOD TO CREATE A NODE IN SINGLY LINKED LIST*/
        public Node create_node(int node_value) {
            Node node = new Node();
            node.next = null;
            node.value = node_value;
            head = node;
            tail = node;
            size = 1;
            return head;
        }

        /**METHOD TO INSERT A NODE IN A SINGLY LINKED LIST*/
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

        /**METHOD TO TRAVERSAL THE SINGLY LINKED LIST*/
        public void traversal() {
            if (head == null) {
                System.out.println("The linked list is empty..");
            }else {
                Node temp_node = head;
                for (int i = 0; i < size; i++) {
                    System.out.print(temp_node.value);
                    if (i != size - 1) {
                        System.out.print(" -> ");
                    }
                    temp_node = temp_node.next;
                }
                System.out.println();
            }
        }

        /**METHOD TO SEARCH FOR A NODE IN SINGLY LINKED LIST*/
        boolean search(int nodeToSearch) {
            if (head == null) {
                System.out.println("The linked list is empty");
            }else {
                Node temp_node = head;
                for (int i = 0; i < size; i++) {
                    if (temp_node.value == nodeToSearch) {
                        System.out.println("Node found at location " + i + "\n");
                        return true;
                    }
                    temp_node = temp_node.next;
                }
            }
            System.out.println("The node you are searching is not Available");
            return false;
        }

        /**METHOD TO DELETE A NODE IN SINGLY LINKED LIST*/
        public void delete(int location) {
            if (head == null) {
                System.out.println("Linked list is empty");
                return;
            }else if (location == 0) { // deleting the first element
                    head = head.next;
                    size--;
                    if (size == 0) { // deleted element was the only element we had
                        tail = null;
                    }
            }else if (location >= size - 1) { // deleting the last element
                Node temp_node = head;
                for (int i = 0; i < size; i++) {
                    temp_node = temp_node.next;
                }
                if (temp_node == head) { // the last element deleted was the only element we had
                    head = tail = null;
                    size--;
                    return;
                }
            }else{
                Node temp_node = head;
                for (int i = 0; i < location - 1; i++) {
                    temp_node = temp_node.next;
                }
                temp_node.next = temp_node.next.next;
                size--;
            }
        }

        public void deleteEntireLinkedList() {
            head = null;
            tail = null;
            System.out.println("The entire linked list is deleted successfully..");
        }
    }

    public static class Node{
        public int value;
        public Node next;
    }
}
