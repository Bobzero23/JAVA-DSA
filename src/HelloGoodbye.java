import java.util.Scanner;

public class HelloGoodbye {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first parameter: ");
        String firstParam = scanner.nextLine();

        System.out.println("Enter second parameter: ");
        String secondParam = scanner.nextLine();

        System.out.println("Hello " + firstParam + " and " + secondParam);
        System.out.println("Goodbye " + firstParam + " and " + secondParam);

    }
}
