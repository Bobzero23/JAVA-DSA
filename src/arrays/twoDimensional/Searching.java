package arrays.twoDimensional;

/*Demonstration on how to do the searching inside a two-dimensional array*/

/*main class*/
public class Searching {

    /*declaring a two-dimensional array*/
    int[][] arr;

    /*constructor*/
    public Searching(int numberOfRows, int numberOfColumns){

        /*instantiation*/
        arr = new int[numberOfRows][numberOfColumns];

        /*setting all elements to integer value at first*/
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    /*method to insert a value*/
    public void inserting1(int row, int col, int valueToInsert){

        /*handling exceptions*/
        try {
            /*checking if the cell is empty*/
            if (arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = valueToInsert;
                System.out.println("value inserted successfully..");
            }else {
                System.out.println("The cell is already occupied");
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }

    /*method for searching*/
    public void  searching1(int value){

    }

    /*main method*/
    public static void main(String[] args) {

        /*creating the object of the class*/
        Searching object = new Searching(3, 3);

    }

}
