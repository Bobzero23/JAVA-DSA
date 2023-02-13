package Test.test3;

public class Main {

    public static class CSLL {
        public Node head;
        public Node tail;
        public int size;

        public Node createCSLL(int nodeValue) {
            Node node = new Node();
            node.value = nodeValue;
            node.next = node;
            head = node;
            tail = node;
            return head;
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
