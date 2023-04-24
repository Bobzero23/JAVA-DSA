package stack.arrays;

public class Stack {
    int[] array;
    int topOfStack;

    public Stack (int size) {
        this.array = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with the size of: " + size);
    }

    public boolean isEmpty(){
        return topOfStack == -1;
    }

    public boolean isFull(){
        return topOfStack == array.length - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full!");
        }else {
            topOfStack++;
            array[topOfStack] = value;
            System.out.println("The value " +value+ " was successfully added to the stack.");
        }
    }

    public  void pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return;
        }else {
            topOfStack--;
            System.out.println("The element " + array[topOfStack] + " was deleted successfully.");
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return -1;
        }else {
            return array[topOfStack];
        }
    }
}
