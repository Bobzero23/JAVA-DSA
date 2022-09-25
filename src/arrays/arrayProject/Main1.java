package arrays.arrayProject;

/*Demonstration on how to do the same project without using the Array*/

import java.util.Scanner;

/*main class*/
public class Main1 {

    /*main method*/
    public static void main(String[] args) {

        /*Create the scanner object*/
        Scanner object = new Scanner(System.in);

        /*Asking for the number of the days we gonna do it*/
        System.out.println("Hom many number of the days needed: ");

        /*assigning them to the integer*/
        int days = object.nextInt();

        /*instantiating the integer number as zero*/
        int counter = 0;

        /*Looping until that number of the days*/
        for (int i = 1; i <= days; i++){
            System.out.println("Enter the temperature of the " + i + "'s day: ");
            int sum = object.nextInt();
            counter += sum;
        }

        /*create the average variable which will calculate the average*/
        double average = counter / days;

        /*displaying the average*/
        System.out.println("The temperature average is: " + average);
    }
}

/*See is not really possible without using array*/