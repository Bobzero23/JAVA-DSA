package Test;

/*Demonstration on how to solve the Given array, return true if sequence of 1,2,3 appears somewhere in the array.

/*main class*/
public class Attempt {

    /*method to solve the question*/
    public boolean solver(int[] arr){
        if (arr.length < 3) return false;
        for (int i = 0; i < arr.length - 2; i++){
            if (arr[i] == 1){
                if (arr[i + 1] == 2){
                    if (arr[i + 2] == 3){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /*main method*/
    public static void main(String[] args) {
        /*creating object of the class*/
        Attempt object = new Attempt();

        /*creating the array*/
        int[] arr = {1, 1, 2, 4, 1};

        /*assigning the method to a variable*/
        boolean result = object.solver(arr);

        /*displaying the result*/
        System.out.println(result);

    }
}
