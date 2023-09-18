package searching_algorithms;

public class BinarySearch {

     static  boolean search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;

            if (nums[mid] == target) return true; else if (
                    nums[mid] < target
            ) i = mid + 1; else j = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        boolean result = search(nums, 9);
        System.out.println(result);
    }
}
