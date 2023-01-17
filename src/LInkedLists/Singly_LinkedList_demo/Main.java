package LInkedLists.Singly_LinkedList_demo;

public class Main {
    public static void main(String[] args) {
        Singly_LinkedList sLL = new Singly_LinkedList();
        sLL.create_singly_linkedlist(5);

        System.out.println(sLL.head.value);
    }
}
