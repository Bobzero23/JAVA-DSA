package LinkedLists.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dLL_object = new DoublyLinkedList();
        dLL_object.createDLL(8);

        dLL_object.insertDLL(0, 3);
        dLL_object.insertDLL(1, 6);
        dLL_object.insertDLL(2, 2);
        dLL_object.insertDLL(3, 7);
        dLL_object.insertDLL(4, 1);
        dLL_object.insertDLL(9, 5);

        System.out.println(dLL_object.head.next.next.value);

        dLL_object.forwardlyTraverseDLL();
        dLL_object.backwardlyTraverseDLL();
        dLL_object.searchDLL(7);

        dLL_object.deleteNode(3);
        dLL_object.forwardlyTraverseDLL();
        dLL_object.searchDLL(7);


    }
}
