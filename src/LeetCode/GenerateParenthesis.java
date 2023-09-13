package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper(result, "", 0, 0, n);
        return result;
    }

    private static void generateParenthesisHelper(List<String> result, String current, int open, int close, int n) {
        if (current.length() == n * 2) {
            result.add(current);
            return;
        }

        if (open < n) {
            generateParenthesisHelper(result, current + "(", open + 1, close, n);
        }

        if (close < open) {
            generateParenthesisHelper(result, current + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        int n = 3; // Change this value to the desired number of pairs of parentheses
        List<String> combinations = generateParenthesis(n);
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}

