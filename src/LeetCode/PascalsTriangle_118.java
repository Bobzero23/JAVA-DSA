package LeetCode;

import java.util.*;

public class PascalsTriangle_118 {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                List<Integer> previousRow = pascal.get(i - 1);
                int num = previousRow.get(j - 1) + previousRow.get(j);
                row.add(num);
            }

            if (i > 0) {
                row.add(1);
            }

            pascal.add(row);
        }

        return pascal;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = generate(5);

        for (List<Integer> list : result) {
            for (Integer element : list) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
