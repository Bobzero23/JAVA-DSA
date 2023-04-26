package queue.arrays;

public class Queue {
    int[] array;
    int topOfQueue;
    int beginningOfQueue;

    public Queue(int size) {
        this.array = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The queue is successfully created with size of: " + size);
    }

    public boolean isFull() {
        return topOfQueue == array.length - 1;
    }

    public boolean isEmpty() {
        return beginningOfQueue == - 1;
    }
}
