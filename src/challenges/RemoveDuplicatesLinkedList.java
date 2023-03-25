package challenges;

import java.util.LinkedList;
import java.util.Objects;

/**
 * @author Daniel
 * @Date 25/03/2023
 */

public class RemoveDuplicatesLinkedList {
    /**
     * Removes duplicates from a linked list and returns the result as a new linked list.
     * Time complexity: O(n^2), where n is the number of nodes in the linked list.
     * Space complexity: O(n), since the method creates a new linked list to store the result.
     */
    public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> linkedList) {
        // Check if the linked list is null or has fewer than two elements.
        if (linkedList == null || linkedList.size() < 2) {
            return linkedList;
        }

        // Initialize an index variable i to 0.
        int i = 0;
        // Loop over the linked list until the second-to-last element.
        while (i < linkedList.size() - 1) {
            // Check if the current element is equal to the next element.
            if (Objects.equals(linkedList.get(i), linkedList.get(i + 1))) {
                // If so, remove the next element.
                linkedList.remove(i + 1);
            } else {
                // If not, move on to the next pair of elements.
                i++;
            }
        }

        // Return the modified linked list.
        return linkedList;
    }
}
