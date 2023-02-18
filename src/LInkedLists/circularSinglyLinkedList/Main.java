package LInkedLists.circularSinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList cSLL = new CircularSinglyLinkedList();


        cSLL.insertCSLL(3, 0);
        cSLL.insertCSLL(1, 1);
        cSLL.insertCSLL(2, 2);

        cSLL.traverseCSLL();
        cSLL.searchCSLL(3);
    }
}
