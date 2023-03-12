package LeetCode;

import java.util.*;

/*Leetcode 228 */

public class SummaryRanges {

 public List<String> summaryRanges(int[] nums) {
     List<String> ranges = new ArrayList<>();

     if (nums == null || nums.length == 0) {
         return ranges;
     }

     int start = nums[0], end = nums[0];
     for (int i = 1; i < nums.length; i++) {
         if (nums[i] == end + 1) {
             end = nums[i];
         } else {
             if (start == end) {
                 ranges.add(String.valueOf(start));
             } else {
                 ranges.add(start + "->" + end);
             }
             start = end = nums[i];
         }
     }

     if (start == end) {
         ranges.add(String.valueOf(start));
     } else {
         ranges.add(start + "->" + end);
     }

     return ranges;
 }

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        SummaryRanges summaryRanges = new SummaryRanges();
        List<String> result = summaryRanges.summaryRanges(nums);
        System.out.println(result);
    }

}
