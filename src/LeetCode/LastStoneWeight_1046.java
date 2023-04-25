package LeetCode;

import java.util.Arrays;

public class LastStoneWeight_1046 {

    static int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }

        int size = stones.length;
        while(size <= 2) {
            Arrays.sort(stones);
            int lastPointer = stones.length - 1;
            int beforeLastPointer = stones.length - 2;
            int currentLast = stones[lastPointer] - stones[beforeLastPointer];
            size--;
            stones[lastPointer] = currentLast;
        }

        return stones[1] - stones[0];
    }

    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};

        int result = lastStoneWeight(stones);
        System.out.println(result);
    }
}
