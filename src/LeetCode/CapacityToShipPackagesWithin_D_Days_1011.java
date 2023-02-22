package LeetCode;

/* Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
 Output: 15
 Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
 1st day: 1, 2, 3, 4, 5
 2nd day: 6, 7
 3rd day: 8
 4th day: 9
 5th day: 10

 Note that the cargo must be shipped in the order given,
 so using a ship of capacity 14 and splitting the packages into parts like
 (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed. */

/**Solved using binary Search*/
public class CapacityToShipPackagesWithin_D_Days_1011 {
    static int shipWithinDays(int[] weights, int days) {
        int min = 0;
        int max = 0;
        int toReturn = 0;

        for (int weight: weights) {
            min = Math.max(min, weight); //finding the highest weight
            max += weight; //finding the total of the all weights
        }

        while (min <= max) {
            int mid = (min + max) / 2;
            int requiredDays = findNumberOfDaysRequired(weights, mid);

            if (requiredDays > days) {
                min = mid + 1;
            }else {
                toReturn = mid;
                max = mid - 1;
            }
        }

        return toReturn;
    }

    static int findNumberOfDaysRequired(int[] weights, int capacity) {
        int requiredDays = 1; // the 1 coming from the constraints of the question
        int currentWeight = 0;

        for (int weight: weights) {
            currentWeight += weight;
            if (currentWeight > capacity) {
                requiredDays++;
                currentWeight = weight;
            }
        }
        return requiredDays;
    }

    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        System.out.println(shipWithinDays(weights, days));
    }
}


