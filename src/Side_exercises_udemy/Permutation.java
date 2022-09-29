package Side_exercises_udemy;

/*Demonstration on how to find if the two arrays are permutation or not no matter if the values are in same index*/
/*The logic I am going to use is that, I am going to loop twice and in the first loop I will take the firs element of
* the first array and then checking if there is a same element in the second array and if there is not, it is
* automatically not permutation..*/

/*main class*/
public class Permutation {

    /*method for finding permutation*/
    public boolean isPermutation(int[] arr1, int[] arr2){

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    return true;
                }
            }
        }
        return false;
    }

    /*main method*/
    public static void main(String[] args) {

        /*creating the object of the class*/
        Permutation object = new Permutation();

        /*instantiating the arrays*/
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 4, 2, 6};

        /*instantiating the result variable*/
        boolean result = object.isPermutation(arr1, arr2);

        /*displaying the result*/
        System.out.println(result);

    }

}
