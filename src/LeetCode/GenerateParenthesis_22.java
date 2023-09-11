package LeetCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
public class GenerateParenthesis_22 {
    public static void main(String[] args) {
        GenerateParenthesis_22 sol = new GenerateParenthesis_22();
        List<String> result = sol.generateParenthesis(3);
        System.out.println(result.toString());
    }

    Stack<Character> stack = new Stack<>();
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backtrack(0, 0, n);
        return res;
    }

    private void backtrack(int openN, int closedN, int n) {
        if (openN == closedN && closedN == n) {
            Iterator<Character> vale = stack.iterator();
            StringBuilder temp = new StringBuilder();
            while (vale.hasNext()) {
                temp.append(vale.next());
            }
            res.add(temp.toString());
        }
        if (openN < n) {
            stack.push('(');
            backtrack(openN + 1, closedN, n);
            stack.pop();
        }
        if (closedN < openN) {
            stack.push(')');
            backtrack(openN, closedN + 1, n);
            stack.pop();
        }
    }
}
