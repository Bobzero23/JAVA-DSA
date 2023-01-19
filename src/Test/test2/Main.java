package Test.test2;

public class Main {

    public static void main(String[] args) {
        Linked_list ls = new Linked_list();
        ls.create_linked_list(5);
        System.out.println("The head of our linked list is: " + ls.head.value);
    }
}
