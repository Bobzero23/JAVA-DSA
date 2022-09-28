package Side_exercises_udemy;

/*Demonstration to check if the array is unique, or it contains duplicates*/
/*The logic I will use is that, take the first  element and check if there is the same element available in the array
* and if yes is duplicate if no it is unique*/

/*main class*/
public class IsUnique {

    /*method to check if the array is unique*/
    public boolean isUnique(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    /*main method*/
    public static void main(String[] args) {

        /*creating the object of the class*/
        IsUnique object = new IsUnique();

        /*instantiating an array*/
        int[] arr = {1, 2, 3, 4, 5, 6};

        /*initializing the result variable*/
        boolean result = object.isUnique(arr);

        /*displaying the output*/
        System.out.println(result);
    }
}
