package arrays.twoDimensional;

/*Demonstration on how to access a cell in tow-dimensional Array*/

/*main class*/
public class Accessing1 {

    /*array declaration*/
    int[][] arr;

    /*constructor*/
    public Accessing1(int numberOfRows, int numberOfColumns){

        /*instantiation*/
        arr = new int[numberOfRows][numberOfColumns];

        /*setting every element as integer minimum value*/
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }

    }

    /*method for accessing*/
    public void accessing1(int row, int col){
        try {
            System.out.println("Accessing row#" + row + " column#" + col);
            System.out.println("The Accessed index is: " + arr[row][col]);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    /*main method*/
    public static void main(String[] args) {

        /*creating the object of the Class*/
        Accessing1 object = new Accessing1(4, 4);

        /*calling a method*/
        object.accessing1(2,2);
    }
}
