package queue.arrays.circularQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);

        boolean isEmpty = circularQueue.isEmpty();
        System.out.println(isEmpty);

        int peek = circularQueue.peek();
        System.out.println(peek);

        circularQueue.enQueue(10);
        circularQueue.enQueue(20);
        circularQueue.enQueue(30);
        circularQueue.enQueue(40);
        circularQueue.enQueue(50);
        circularQueue.enQueue(60);

        int result = circularQueue.deQueue();
        System.out.println(result);

        int result1 = circularQueue.deQueue();
        System.out.println(result1);

        int result2 = circularQueue.deQueue();
        System.out.println(result2);

        int peek1 = circularQueue.peek();
        System.out.println(peek1);

        circularQueue.deleteQueue();
    }
}



