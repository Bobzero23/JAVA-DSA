package arrays.twoDimensional;

/*Demonstration on how to do insertion in two Dimensional Array*/

/*main class*/
public class Insertion1 {

    /*declaration*/
    int[][] arr;

    /*constructor*/
    public Insertion1(int numberOfRows, int numberOfColumns){
        /*instantiation*/
        arr = new int[numberOfRows][numberOfColumns];

        /*setting all the rows and columns to integer minimum value*/
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    /*method to do insertion*/
    public void insert1(int row, int col, int valueToInsert){
        try { // handling all possible exceptions
            if (this.arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = valueToInsert;
                System.out.println("Successfully Inserted");
            }else {
                System.out.println("The cell is already occupied");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    /*main*/
    public static void main(String[] args) {
        /*initializing the object*/
        Insertion1 object = new Insertion1(3,3);

        /*calling the method*/
        object.insert1(0, 0, 1);
        object.insert1(4, 0, 1);
    }


}
