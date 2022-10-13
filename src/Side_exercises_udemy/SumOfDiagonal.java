package Side_exercises_udemy;

/*Demonstration on how to find the sum of the diagonal of the matrix*/

/*main class*/
public class SumOfDiagonal {

    /*method to solve the Question*/
    public int sumOfDiagonal(int[][] arr){
        /*declaring some variables*/
        int diagonal = 0;

        /*matrix shall nXn*/
        if (arr.length != arr[0].length) return -1;

        /*I have to loop through the matrix */
        for (int i = 0; i < arr.length; i++){
            diagonal = diagonal +  arr[i][i];
        }

        /*returning diagonal*/
        return  diagonal;
    }

    /*main method*/
    public static void main(String[] args) {

        /*creating the object of the class*/
        SumOfDiagonal object = new SumOfDiagonal();

        /*creating the matrix*/
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        /*assigning the method to a variable*/
        int result = object.sumOfDiagonal(arr);

        /*displaying the result*/
        System.out.println("The sum of the Diagonal is: " + result);
    }
}
