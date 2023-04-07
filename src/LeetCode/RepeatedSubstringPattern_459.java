package LeetCode;

public class RepeatedSubstringPattern_459 {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int len = 1; len <= n/2; len++) {
            if (n % len == 0) {
                String sub = s.substring(0, len);
                int i = len;
                while (i < n && sub.equals(s.substring(i, i+len))) {
                    i += len;
                }
                if (i == n) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern_459 object = new RepeatedSubstringPattern_459();
        boolean result = object.repeatedSubstringPattern("abab");
        System.out.println(result);
    }
}
