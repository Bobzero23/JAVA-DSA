package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent_347 {
    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> storeFrequency= new HashMap<>();

        for (int i: nums) storeFrequency.put(i,storeFrequency.getOrDefault(i,0)+1);

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue <>((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry entry : storeFrequency.entrySet())
        {
            pq.add(entry);
        }

        int [] output = new int [k];
        for (int i=0; i<k;i++)
        {
            output[i]= pq.poll().getKey();
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};

        int[] resul = topKFrequent(nums, 2);

        System.out.println(Arrays.toString(resul));

    }
}
