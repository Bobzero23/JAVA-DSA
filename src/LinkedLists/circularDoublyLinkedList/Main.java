package LinkedLists.circularDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cDLL_Object = new CircularDoublyLinkedList();
        cDLL_Object.creatCDLL(9);
        System.out.println(cDLL_Object.head.value);
    }
}
