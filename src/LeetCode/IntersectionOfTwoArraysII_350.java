package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        for(int num: nums1) {
            list1.add(num);
        }

        for(int num: nums2) {
            list2.add(num);
        }

        for(int num: list2) {
            if(list1.contains(num)) {
                answer.add(num);
                list1.remove((Integer) num);
            }
        }

        int[] result = new int[answer.size()];
        int pointer = 0;
        for(int num: answer) {
            result[pointer++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArraysII_350 object = new IntersectionOfTwoArraysII_350();

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] result = object.intersect(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}
