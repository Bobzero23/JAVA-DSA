package stack.linkedList;

public class Stack {
    LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }

    public void push(int value) {
        linkedList.insertIntoLinkedList(value, 0);
        System.out.println("The value " + value + " inserted successfully!");
    }

    public boolean isEmpty() {
       return linkedList.head == null;
    }

    public void pop() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("The stack is empty!");
        }else {
            value = linkedList.head.value;
            linkedList.delete(0);
            System.out.println("The value " + value + " was deleted successfully.");
        }
    }

    public void peek() {
        System.out.println("The top value is: " + linkedList.head.value);
    }
}
