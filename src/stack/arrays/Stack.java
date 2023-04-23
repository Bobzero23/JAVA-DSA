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
}
