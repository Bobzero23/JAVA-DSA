package searching_algorithms;

public class LinearSearch {

    public static boolean isAvailable(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean result = isAvailable(nums, 7);
        System.out.println(result);
    }
}
