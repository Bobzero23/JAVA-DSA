package LInkedLists.Singly_LinkedList_demo;

public class Main {
    public static void main(String[] args) {
        Singly_LinkedList sLL = new Singly_LinkedList();
        sLL.create_singly_linkedList(5);
        System.out.println(sLL.head.value);
        sLL.insert_into_linked_list(10, 1);
        System.out.println(sLL.head.next.value);
        sLL.insert_into_linked_list(20, 3);
        System.out.println(sLL.head.next.next.value);
    }
}
