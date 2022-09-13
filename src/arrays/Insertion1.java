package arrays;

/*main class*/
public class Insertion1 {

    /*declaring an Array*/
    int[] arr = null;

    /*constructor*/
    public Insertion1(int sizeOfArray){
        /*this will set the array elements to the min
        integer value and avoid the zeros*/
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    /*insertion method*/
    public void insertion1(int location, int toBeInserted){

        /*catching the index out of bounds*/
        try {
            /*inserting if the cell is empty*/
            if (arr[location] == Integer.MIN_VALUE){
                arr[location] = toBeInserted;
                System.out.println("Successfully Inserted!!");
            }else{
                System.out.println("The cell is occupied..");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
    }

    /*main method*/
    public static void main(String[] args) {

        /*creating object of the class*/
        Insertion1 object = new Insertion1(10);

        /*initialization*/
        object.insertion1(0,0);
        object.insertion1(1,10);
        object.insertion1(2, 20);
        object.insertion1(1, 30);
        object.insertion1(12, 120);
    }






}
