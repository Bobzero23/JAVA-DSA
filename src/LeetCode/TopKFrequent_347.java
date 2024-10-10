package LeetCode;

import java.util.*;

public class TopKFrequent_347 {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> frequencies = new HashMap<>();

        for (int num: nums) frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(frequencies.entrySet());

        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = list.get(i);
            result[i] = entry.getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};

        int[] resul = topKFrequent(nums, 2);

        System.out.println(Arrays.toString(resul));

    }
}
