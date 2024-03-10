package LeetCode;


import java.util.List;
import java.util.Stack;

public class ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next;

        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public static void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static ListNode reverseListWithStack(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        ListNode reversedList = new ListNode();
        ListNode ptr = reversedList;

        while (!stack.isEmpty()) {
            ptr.next = new ListNode(stack.pop());
            ptr = ptr.next;
        }

        return reversedList.next;
    }

    public static ListNode reverseLinkedList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode previousNode = null;
        ListNode nextNode = null;
        ListNode currentNode = head;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list");
        printList(head);

        System.out.println("Reversed list");
        ListNode reversedList = reverseLinkedList(head);
//        ListNode reversedList = reverseListWithStack(head);
        printList(reversedList);
    }
}
