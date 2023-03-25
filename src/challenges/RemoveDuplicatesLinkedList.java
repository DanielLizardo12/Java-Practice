package challenges;

import java.util.LinkedList;
import java.util.Objects;

/**
 * @author Daniel
 * @Date 25/03/2023
 */

public class RemoveDuplicatesLinkedList {

    /**
     * Removes duplicates from a linked list.
     * Time complexity: O(n), where n is the number of nodes in the linked list.
     * Space complexity: O(n), due to the recursive call stack.
     */
    public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> linkedList) {
        return checkIfNodeIsDifferent(linkedList, 0);
    }

    /**
     * Helper method that recursively checks whether each node in the linked list
     * is different from its next node, and removes duplicates if found.
     */
    private static LinkedList<Integer> checkIfNodeIsDifferent(
            LinkedList<Integer> linkedList, int currentIndex) {

        // Check whether the current index is within the bounds of the linked list.
        if (currentIndex + 1 < linkedList.size()) {
            // Compare the current node with the next node.
            if (Objects.equals(linkedList.get(currentIndex), linkedList.get(currentIndex + 1))) {
                // If they are equal, remove the next node.
                linkedList.remove(currentIndex + 1);
            }
            // Recursively check the next node in the linked list.
            checkIfNodeIsDifferent(linkedList, currentIndex + 1);
        }

        // Return the modified linked list.
        return linkedList;
    }
}
