package Side_exercises_udemy;

/*Demonstration on how to find if the two arrays are permutation or not no matter if the values are in same index*/
/*The logic I am going to use is that, as long as the length of these two arrays are same then if the sum and the
* multiplication of the two arrays are same then these two arrays are permutation... but this only works for integers*/

/*main class*/
public class Permutation {

    /*method for finding permutation*/
    public boolean isPermutation(int[] arr1, int[] arr2){

        /*checking if the lengths are same*/
        if (arr1.length != arr2.length){
            return false;
        }

        /*creating variables*/
        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 1;
        int mul2 = 1;

        /*looping through the arrays*/
        for (int i = 0; i < arr1.length; i++){
            sum1 += arr1[i];
            sum2 += arr2[i];
            mul1 *= arr1[i];
            mul2 *= arr2[i];
        }

        /*checking the results conditions*/
        if ( sum1 == sum2 && mul1 == mul2){
            return true;
        }

        return false;
    }

    /*main method*/
    public static void main(String[] args) {

        /*creating the object of the class*/
        Permutation object = new Permutation();

        /*instantiating the arrays*/
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 4, 2, 5};

        /*instantiating the result variable*/
        boolean result = object.isPermutation(arr1, arr2);

        /*displaying the result*/
        System.out.println(result);

    }

}
