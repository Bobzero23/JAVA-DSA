package Side_exercises_udemy;

/*Here how to print pair of array's element but the point is to measure the time complexity*/

/*main class*/
public class PrintPairs {

    /*method to print pairs*/
    static void printPairs(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i] + "" + arr[j] + ", ");
            }
            System.out.println();
        }
    }


    /*main method*/
    public static void main(String[] args) {

        /*initializing an array*/
        int[] arr = {1, 2, 3, 4, 5};

        /*calling a method*/
        printPairs(arr);
    }
}
