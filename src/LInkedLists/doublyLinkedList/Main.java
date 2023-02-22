package LInkedLists.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dLL_object = new DoublyLinkedList();
        dLL_object.createDLL(8);
        System.out.println(dLL_object.head.value);
    }
}
