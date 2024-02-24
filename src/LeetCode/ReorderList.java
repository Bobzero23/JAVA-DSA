package LeetCode;
/*NOT SETTLED*/
public class ReorderList {


      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public static void reorderList(ListNode head) {

        //Find middle of list using a slow and fast pointer approach
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse the second half of the list using a tmp variable
        ListNode second = slow.next;
        ListNode prev = slow.next = null;
        while (second != null) {
            ListNode tmp = second.next;
            second.next = prev;
            prev = second;
            second = tmp;
        }

        //Re-assign the pointers to match the pattern
        ListNode first = head;
        second = prev;
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
    }

    public static void main(String[] args) {
        ReorderList reorderList = new ReorderList();

        ReorderList.ListNode head = reorderList.new ListNode(1);
        head.next = reorderList.new ListNode(2);
        head.next.next = reorderList.new ListNode(3);
        head.next.next.next = reorderList.new ListNode(4);
        head.next.next.next.next = reorderList.new ListNode(5);

        System.out.println("Original list: ");
        printList(head);

        System.out.println("Reordered list: ");
        reorderList(head);
        printList(head);
    }

    private static void printList(ListNode head) {
          ReorderList.ListNode current = head;

          while (current != null) {
              System.out.print(current.val + " ");
              current = current.next;
          }
        System.out.println();
    }
}
