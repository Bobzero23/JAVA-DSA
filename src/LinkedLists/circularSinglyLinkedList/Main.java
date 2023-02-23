package LinkedLists.circularSinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList cSLL = new CircularSinglyLinkedList();


        cSLL.insertCSLL(3, 0);
        cSLL.insertCSLL(1, 1);
        cSLL.insertCSLL(2, 2);
        cSLL.insertCSLL(6, 3);
        cSLL.insertCSLL(8, 4);
        cSLL.insertCSLL(0, 5);
        cSLL.insertCSLL(5, 6);

        cSLL.traverseCSLL();
        cSLL.searchCSLL(3);
        cSLL.deleteCSLL(0);
        cSLL.traverseCSLL();
        cSLL.deleteEntireCSLL();
        cSLL.traverseCSLL();
    }
}
