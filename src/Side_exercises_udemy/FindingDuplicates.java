package Side_exercises_udemy;

/** Demonstration on how to find the duplicates in an integer array*/

/*main class*/
public class FindingDuplicates {

    /*solver method*/
    public int[] findingDuplicates(int[] array){
        int[] duplicates = new int[100];
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                     duplicates[i] = i;
                }
            }
        }
        return duplicates;
    }

    /*main method*/
    public static void main(String[] args) {

        //Creating the object of the clas
    }

}
