package arrays.oneDimensional;

/*main class*/
public class Searching1 {

    /*initializing an Array*/
    int[] arr = {1, 2, 3, 4, 5, 6};

    /*method to search index*/
    public void search(int searched){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == searched){
                System.out.println("The number you are searching is at index: " + i);
                return;
            }
        }
        System.out.println("We couldn't find the number: " + searched);
    }

    /*main method*/
    public static void main(String[] args) {


        /*creating object of the class*/
        Searching1 object = new Searching1();

        /*calling the method using the object*/
        object.search(4);
    }

}
