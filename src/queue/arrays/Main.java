package queue.arrays;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        int peekResult = queue.peek();
        System.out.println(peekResult);

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);

        int peekResult2 = queue.peek();
        System.out.println(peekResult2);


        int answer = queue.deQueue();
        System.out.println(answer);
        int answer1 = queue.deQueue();
        System.out.println(answer1);

        queue.deleteQueue();

    }

}
