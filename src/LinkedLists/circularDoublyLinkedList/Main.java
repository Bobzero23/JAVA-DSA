package LinkedLists.circularDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cDLL_Object = new CircularDoublyLinkedList();
        cDLL_Object.createCDLL(9);
        System.out.println(cDLL_Object.head.value);

        cDLL_Object.insertToCDLL(0, 0);
        cDLL_Object.insertToCDLL(1, 1);
        cDLL_Object.insertToCDLL(2, 2);
        cDLL_Object.insertToCDLL(3, 3);
        cDLL_Object.insertToCDLL(4, 4);
        cDLL_Object.insertToCDLL(5, 5);
        cDLL_Object.insertToCDLL(6, 6);
        cDLL_Object.insertToCDLL(7, 7);
        cDLL_Object.insertToCDLL(8, 8);

        cDLL_Object.forwardTraverseCDLL();

    }
}