package LeetCode;

public class GuessNumberHigherOrLower_374 extends Solution{
    public int guessNumber(int n) {
        if(guess(n) == 0) return n;

        int left = 1;
        int right = n;

        while(left < n) {
            int mid = left + (right - left) / 2;
            if(guess(mid) == 0) {
                return mid;
            }if(guess(mid) == 1) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int n = 3;

        GuessNumberHigherOrLower_374 object = new GuessNumberHigherOrLower_374();

        int result = object.guessNumber(n);

        System.out.println(result);
    }
}

class Solution {

    int target = 1;
    public int guess(int num) {
        if(num == target) {
            return 0;
        }else if (num > target) {
            return -1;
        }else if (num < target) {
            return 1;
        }

        return 0;
    }
}