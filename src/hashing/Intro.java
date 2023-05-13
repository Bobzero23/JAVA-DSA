package hashing;

import java.util.HashMap;

public class Intro {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Bobzero", 495803);
        map.put("TheProblem", 5903480);
        map.put("Rajabu", 435093);

        int result = map.get("Bobzero");
        System.out.println(result);
    }
}
