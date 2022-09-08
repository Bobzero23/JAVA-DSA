package bigO.timeComplexity;

/*finding the time complexity of the method which find the sum and multiplication of elements of an array*/

/*main class*/
public class Question1 {

    /*method*/
    static void spOfArray(int arr[]){
        int sum = 0; // ------------> O(1)
        int product = 1; // ----------> O(1)
        for (int i = 0; i <= arr.length - 1; i++){ // -------> O(N) n here is the number of element of array
            sum = sum + arr[i]; // -----------> O(1)
            product = product * arr[i]; // ----------> O(1)
        }
        System.out.println("The sum of the array is: " + sum); // -----------> O(1)
        System.out.println("The product of the array is: " + product); // ---------> O(1)
    }

    /*main method*/
    public static void main(String[] args) {

        /*displaying the results*/
        int[] arr = {1, 2, 3, 4, 5}; // ----------> O(1)
        spOfArray(arr); // -------------> O(1)
    }
}
