package Side_exercises_udemy;

/*Demonstration on how to find the max product of Two integers in the array*/
/*The Logic is to create a variable which you are going to assign the value of the products as you loop through the
* array and if you find the greater product you assign it, if you find the less product you keep going until you
* finish looping the whole values in the array */

/*main class*/
public class MaxProduct {

    /*method to calculate the max product*/
    public String maxProduct(int[] arr){

        /*declarations*/
        int max_products = 0;
        String pairs = "";

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] * arr[j] > max_products){
                    max_products = arr[i] * arr[j];
                    pairs = Integer.toString(arr[i]) + " and  " + Integer.toString(arr[j]);
                }
            }
        }
        return pairs;
    }


    /*main method*/
    public static void main(String[] args) {

        /*create the object of the class*/
        MaxProduct object = new MaxProduct();

        /*create an array*/
        int[] arr = {10, 20, 30, 40 , 50, 60, 70};

        /*creating the output variable */
        String output = object.maxProduct(arr);

        /*displaying the output*/
        System.out.println("The max product pairs are: " + output);

    }
}
