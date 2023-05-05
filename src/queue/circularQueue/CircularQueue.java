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
            }
            topOfQueue++;
            array[topOfQueue] = value;
            System.out.println("The value " +value+ " is successfully inserted." );
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
            return -1;
        }else {
            int result = array[beginningOfQueue];
            array[beginningOfQueue] = Integer.MIN_VALUE; //setting this value to show that it's deleted
            if (beginningOfQueue == topOfQueue) { //this means we only have one element
                beginningOfQueue = topOfQueue = -1; //that why we set them both to -1 after deleting
            }else if (beginningOfQueue + 1 == size) { //if so, since it is circular queue
                beginningOfQueue = 0; //this will become the next beginning of the queue
            }else {
                beginningOfQueue++;
            }
            return result;
        }
    }

    public int peek() {
        if (isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }else {
            return array[beginningOfQueue];
        }
    }

    public void deleteQueue() {
        array = null;
        System.out.println("The queue is successfully deleted");
    }

}






