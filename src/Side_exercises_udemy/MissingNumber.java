package Side_exercises_udemy;

/*Demonstration on how to find the missing number in a particular array*/
/*The approach is to just find the sum of the original array and abstract to the given array*/
/*To find the sum of the numbers from 1, we use this equation n(n+1)/2 */

/*main class*/
public class MissingNumber {

    /*declarations*/
    int sum1 = 0;
    int sum2 = 0;



    /*method to calculate the missing number*/
    public void missingNumber(int[] arr){
        for (int i : arr){
            sum1 += i;
        }
        sum2 = 10 * (10 + 1) / 2;
        int difference = sum2 - sum1;
        System.out.println("The missing number is: " + difference);
    }

    /*main method*/
    public static void main(String[] args) {

        /*creating object of the class*/
        MissingNumber object = new MissingNumber();

        /*instantiating the array*/
        int[] arr = {1, 2, 3, 5, 6, 7, 8 , 9, 10};

        /*calling the method*/
        object.missingNumber(arr);
    }
}
