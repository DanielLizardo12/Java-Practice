package challenges;

/**
 * @author Daniel
 * @Date 28/03/2023
 */

public class FindDuplicateNumber {

    /**
     * Finds a duplicate element in an array of integers using the Floyd's cycle-finding algorithm.
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param ints The input array of integers.
     * @return The duplicate element in the array, or -1 if there is no duplicate element.
     */
    public static int findDuplicate(int[] ints) {
        // If the length of the input array is less than or equal to 1, there is no duplicate element
        if (ints.length <= 1) {
            return -1;
        }

        // Initialize two pointers, slow and fast, to the value of the first element in the array
        int slow = ints[0];
        int fast = ints[0];

        // Use the Floyd's cycle-finding algorithm to find the starting point of the cycle
        do {
            slow = ints[slow];          // Move slow one step forward in the array
            fast = ints[ints[fast]];   // Move fast two steps forward in the array
        } while (slow != fast);

        // Reset fast to the value of the first element in the array
        fast = ints[0];

        // Move both slow and fast forward in the array one step at a time until they meet again
        while (slow != fast) {
            slow = ints[slow];
            fast = ints[fast];
        }

        // The element they meet at is the starting point of the cycle, which is also the duplicate element
        return slow;
    }

}
