package stack.arrays;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        boolean isStackEmpty = stack.isEmpty();
        System.out.println(isStackEmpty);
        boolean isStackFull = stack.isFull();
        System.out.println(isStackFull);
    }
}
