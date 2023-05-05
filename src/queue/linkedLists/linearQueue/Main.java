package queue.linkedLists.linearQueue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        boolean isEmpty = queue.isEmpty();
        System.out.println(isEmpty);

        queue.enQueue(13);
        queue.enQueue(43);
        queue.enQueue(65);
        queue.enQueue(25);
        queue.enQueue(74);
    }

}
