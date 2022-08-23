package recursion;

/*Demonstration on how to the recursion method call itself as long as the condition satisfies */

/*main class*/
public class Example1 {

    /*Recursion method*/
    static  void rec(int i){
        if(i > 0){
            rec(i - 1);
            System.out.println(i);
        }else{
            System.out.println("i is less than one..");
        }
    }

    /*main method*/
    public static void main(String[] args) {

        /*calling the recursion method*/
        rec(5);

    }
}
