package Test;

/*main class*/
public class Attempt {

    /*first method*/
    public void method1(String str1){
        System.out.println(str1.indexOf("x"));
    }

    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i+1, i+2).equals("x");

        // Another approach -- .startsWith() simplifies the logic
        // String x = str.substring(i);
        // return x.startsWith("xx");
    }

    /*main method*/
    public static void main(String[] args) {

        /*creating the object of the class*/
        Attempt object = new Attempt();

        /*instantiating the string*/
        String str = "taxing";

        /*calling method 1*/
        object.method1(str);

        /*calling method 2*/
        object.doubleX(str);

    }
}
