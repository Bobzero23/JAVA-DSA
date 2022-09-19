package arrays.twoDimensional;

/*Demonstration on how to traverse a two-dimensional Array*/

/*main class*/
public class Traversal {


    /*declaration*/
    int[][] arr;

    /*constructor*/
    public Traversal(int numberOfRows, int numberOfColumns){
        /*instantiation*/
        arr = new int[numberOfRows][numberOfColumns];

        /*setting all the rows and columns to integer minimum value*/
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    /*method for traversing the array*/
    public void traversal1(){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    /*main method*/
    public static void main(String[] args) {

        /*creating object of the class*/
        Traversal object = new Traversal(3, 3);

        /*calling the traversing method*/
        object.traversal1();
    }

}
