package LeetCode;

import java.util.Arrays;

public class NumberOfSegmentInAString_434 {
    public String[] countSegments(String s) {
//        if(s.length() == 0) return 0;

        int result = 0;

        String[] sArray = s.split(" ");

        for(String str: sArray) {
            if(!str.equals(" ")) result++;
        }

        return sArray;
    }

    public static void main(String[] args) {
//        String s = ", , , ,        a, eaefa";
        int counter = 0;
        NumberOfSegmentInAString_434 object = new NumberOfSegmentInAString_434();

        String[] result = object.countSegments(", , , ,        a, eaefa");

        System.out.println(Arrays.toString(result));

        for(String str: result) {
//            System.out.println(str);
            if(str.equals(" ")) {
                counter++;
            }
        }

        System.out.println(counter);

        System.out.println(result.length);
    }
}
