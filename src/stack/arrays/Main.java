package stack.arrays;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        boolean isStackEmpty = stack.isEmpty();
        System.out.println(isStackEmpty);

        boolean isStackFull = stack.isFull();
        System.out.println(isStackFull);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        stack.pop();
    }
}
