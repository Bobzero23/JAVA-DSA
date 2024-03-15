package arrayList;

import java.util.*;

public class Methods {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 5, 3, 6, 0, 2, 1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        list.sort(Collections.reverseOrder());
        System.out.println(list);

    }
}
