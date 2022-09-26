package arrays.arrayProject;

/*Demonstration on how to do the same project using Arrays*/

/*imports*/
import java.util.Scanner;

/*main class*/
public class Main2 {

    /*main method*/
    public static void main(String[] args) {

        /*Create the scanner object*/
        Scanner object = new Scanner(System.in);

        /*Asking for the number of the days we gonna do it*/
        System.out.println("Hom many number of the days needed: ");

        /*assigning them to the integer*/
        int days = object.nextInt();

        /*initializing an array*/
        int[] temps = new int[days];

        /*instantiating the integer variables*/
        int counter1 = 0;
        int counter2 = 0;

        /*Looping until that number of the days*/
        for (int i = 0; i < days; i++){
            System.out.println("Enter the temperature of the " + i + "'s day: ");
            temps[i] = object.nextInt();
            counter1 += temps[i];
        }

        /*create the average variable which will calculate the average*/
        double average = counter1 / days;

        /*calculating the days above the average*/
        for (int i = 0; i < temps.length; i++){
            if (temps[i] > average){
                counter2++;
            }
        }

        /*displaying the average*/
        System.out.println("The temperature average is: " + average);

        /*displaying the days above the average*/
        System.out.println("The number of days above the average is: " + counter2);

    }
}

/*See now is possible using array*/
