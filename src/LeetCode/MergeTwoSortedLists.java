package LeetCode;

public class MergeTwoSortedLists {
    public static class Node {
        int value;
        Node next;

        public Node (){};
        public Node (int value) {
            this.value = value;
        }

        public Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static Node mergeTwoLinkedLists(Node list1, Node list2) {
        Node result = new Node(Integer.MIN_VALUE);
        Node pointer = result;

        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                pointer.next = list1;
                list1 = list1.next;
            }else {
                pointer.next = list2;
                list2 = list2.next;
            }

            pointer = pointer.next;
        }

        pointer.next = (list1 == null) ? list2 : list1;
        return result.next;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        /*creating the first list*/
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next =new Node(5);

        /*creating the second list*/
        Node list2 = new Node(2);
        list2.next = new Node(4);

        /*merging two lists*/
        Node answer = mergeTwoLinkedLists(list1, list2);

        /*printing the result*/
        printList(answer);


    }
}
