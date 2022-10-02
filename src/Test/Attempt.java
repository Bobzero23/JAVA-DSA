package Test;

/*main class*/
public class Attempt {

    /*first method*/
    public String method1(String str1){
        String back = str1.substring(str1.length() - 4, str1.length());
        String front = str1.substring(1, str1.length() - 4);
        return "back is: " + back + "\nfront is: " + front;
    }

    /*second method*/
    public String method2 (String str2){
        return str2.substring(1, str2.length()-1);
    }

    /*main method*/
    public static void main(String[] args) {

        /*creating the object of the class*/
        Attempt object = new Attempt();

        /*instantiating the string*/
        String str = "Bobzero";

        /*calling method1 in a variable*/
        String result1 = object.method1(str);

        /*displaying the result*/
        System.out.println(result1);

        /*Instantiating the string*/
        String str2 = "Bobzero";

        /*calling the method2 in a variable*/
        String result2 = object.method2(str2);

        /*displaying the result*/
        System.out.println(result2);


    }
}
