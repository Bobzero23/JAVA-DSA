package queue.linkedLists.linearQueue;

public class Queue {

    LinkedList linkedList;

    public Queue(){
        linkedList = new LinkedList();
        System.out.println("The queue is successfully created");
    }

    public boolean isEmpty() {
        return linkedList.head == null;
    }

    public void enQueue(int value) {
        linkedList.insert_into_linked_list(value, linkedList.size);
        System.out.println("The value " +value+ " inserted successfully.");
    }
}
