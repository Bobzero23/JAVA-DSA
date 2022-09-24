package arrays.twoDimensional;

/*Demonstration on how to do deletion inside a two-dimensional array*/

/*main class*/
public class Deletion1 {

    /*declaring a two-dimensional array*/
    int[][] arr;

    /*constructor*/
    public Deletion1(int numberOfRows, int numberOfColumns){

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
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++){
                if (arr[row][col] == value){
                    System.out.println("The number you are searching is at row: " + row + ", col: " + col);
                    return;
                }
            }
        }
        System.out.println("The number you are searching for is not available..");
    }

    /*method for deletion*/
    public void deletion1(int valueToDelete){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[0].length; col++){
                if (arr[row][col] == valueToDelete){
                    arr[row][col] = Integer.MIN_VALUE;
                    System.out.println("Deletion Successful");
                    return;
                }
            }
        }
        System.out.println("The value you want to delete is not available..");
    }


    /*main method*/
    public static void main(String[] args) {

        /*creating the object of the class*/
        Deletion1 object = new Deletion1(3, 3);
        System.out.println();

        /*inserting elements using the object*/
        object.inserting1(0, 0, 1);
        object.inserting1(0,1,2);
        object.inserting1(0,2, 3);
        System.out.println();

        /*searching for element*/
        object.searching1(2);
        System.out.println();

        /*deleting element*/
        object.deletion1(2);
        System.out.println();

        /*searching to see if the number is really deleted*/
        object.searching1(2);


    }
}
