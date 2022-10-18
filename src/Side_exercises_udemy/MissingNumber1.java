package Side_exercises_udemy;

/*Demonstration on how to find the missing number in a given to a give in int x*/

/*main class*/
public class MissingNumber1 {

    /*solver method*/
    public int missingNumber(int[] array, int arraySize){
        int expectedSum = 0;
        int actualSum = 0;
        int missing = 0;

        // for expected sum
        for (int i = 1; i <= arraySize; i++){
            expectedSum += i;
        }

        // for actual sum
        for (int i = 0; i < arraySize - 1; i++){
            actualSum += array[i];
        }

        // Finding the missing number
        missing = expectedSum - actualSum;

        // Returning the missing number
        return missing;

    }

    /*main method*/
    public static void main(String[] args) {

        // Creating object of the array
        MissingNumber1 object = new MissingNumber1();

        // Creating the array
        int[] array = {1, 2, 3, 4, 6};

        // Assigning the method to a variable
        int result = object.missingNumber(array, 6);

        // Displaying the result
        System.out.println("The missing number is: " + result);


    }
}
