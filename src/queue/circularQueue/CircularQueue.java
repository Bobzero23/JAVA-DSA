package queue.circularQueue;

public class CircularQueue {
    int[] array;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    public CircularQueue(int size) {
        this.array = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        this.size = size;
        System.out.println("The queue is created successfully with size: " + size);
    }

    public boolean isEmpty() {
       return topOfQueue == -1;
    }

    public boolean isFull() {
        if (topOfQueue + 1 == beginningOfQueue) {
            return true;
        }else return beginningOfQueue == 0 && topOfQueue + 1 == size;
    }
    
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The queue is full.");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            array[topOfQueue] = value;
            System.out.println("The value " +value+ " is successfully inserted." );
        } else  {
            if (topOfQueue + 1 == size) {
                topOfQueue = 0;
            }else {
                topOfQueue++;
            }
            topOfQueue++;
            array[topOfQueue] = value;
            System.out.println("The value " +value+ " is successfully inserted." );
        }
    }

}
