package queue.arrays;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);


        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);

        int answer = queue.deQueue();
        System.out.println(answer);
        int answer1 = queue.deQueue();
        System.out.println(answer1);



    }

}
