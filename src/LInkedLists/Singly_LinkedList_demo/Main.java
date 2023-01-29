package LInkedLists.Singly_LinkedList_demo;

public class Main {
    public static void main(String[] args) {
        Singly_LinkedList sLL = new Singly_LinkedList();

        /**inserting values to the singly linked list*/
        sLL.create_singly_linkedList(5);
        sLL.insert_into_linked_list(10, 1);
        sLL.insert_into_linked_list(20, 3);
        sLL.insert_into_linked_list(28, 4);
        sLL.insert_into_linked_list(70, 5);
        sLL.insert_into_linked_list(90, 6);
        sLL.insert_into_linked_list(60, 7);

        /**calling the traversing method*/
        sLL.traversal_singly_linked_list();
        sLL.search(89);
    }
}
