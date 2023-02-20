package LeetCode;

public class SearchInsertPosition_35 {
    static int searchInsert(int[] nums, int target) {
        //initializing the pointers
        int leftPointer = 0;
        int rightPointer = nums.length; /**nums.length - 1*/

        //looping
        while (leftPointer < rightPointer) { /** <= */
            //initializing the midPointer
            int mid = (leftPointer + rightPointer) / 2;
            if (nums[mid] > target) {
                rightPointer = mid - 1;
            } else if (nums[mid] < target) {
                leftPointer = mid + 1;
            }else { /**why skipping this point on debugging*/
                return mid;
            }
        }

        return leftPointer;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;

        /*int result = searchInsert(nums, target);
        System.out.println(result);*/

        System.out.println(searchInsert(nums, target));
    }
}
