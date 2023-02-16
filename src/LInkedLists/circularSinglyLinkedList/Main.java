package LInkedLists.circularSinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList cSLL = new CircularSinglyLinkedList();
        cSLL.createCSLL(5);
        System.out.println(cSLL.head.next.value);
        cSLL.insertCSLL(3, 4);
        cSLL.insertCSLL(1, 1);
        cSLL.insertCSLL(2, 2);

        System.out.println(cSLL.head.next.next.value);
        System.out.println(cSLL.head.next.next.next.value);
        System.out.println(cSLL.head.next.next.next.next.value);

        cSLL.traverseCSLL();
    }
}
