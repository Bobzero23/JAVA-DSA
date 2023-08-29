package Test.test3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main{
    public static void main(String[] args) {
        Set<List<Integer>> set = new HashSet<>();

        set.add(Arrays.asList(1, 5, 6));
        set.add(Arrays.asList(1, 5, 6));
        System.out.println(set);

    }
}