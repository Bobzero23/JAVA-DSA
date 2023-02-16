package Test.test3;

public class Main {

    public static class CSLL {
        public Node head;
        public Node tail;
        public int size;

        /**method to create a circular singly linked list*/
        public Node createCSLL(int nodeValue) {
            Node node = new Node();
            node.value = nodeValue;
            node.next = node;
            head = node;
            tail = node;
            return head;
        }

        /**method to insert a node into circular singly linked list*/
        public void insertCSLL(int nodeValue, int location) {
            Node node = new Node();
            node.value = nodeValue;

            if (head == null) {
                createCSLL(nodeValue);
                return;
            }else  if (location == 0) {
                head.next = node;
                head = node;
            }
        }
    }

    public static class Node {
        public int value;
        public Node next;
    }
    public static void main(String[] args) {
        CSLL object = new CSLL();
        object.createCSLL(10);
        System.out.println(object.head.next.value);
    }
}
