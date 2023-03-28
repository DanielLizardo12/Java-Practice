package challenges;

import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * @author Daniel
 * @Date 27/03/2023
 */

public class ReverseLinkedList {

    public static LinkedList<Integer> reverse(LinkedList<Integer> linkedList) {

        if (linkedList == null || linkedList.size() == 0) return null;

        if (linkedList.size() == 1) return linkedList;

        LinkedList<Integer> result = new LinkedList<>();

        new LinkedList<>(linkedList)
                // Returns an iterator over the elements in this deque in reverse sequential order.
                // The elements will be returned in order from last (tail) to first (head).
                .descendingIterator()
                // Performs the given action for each remaining element until all elements have been processed
                .forEachRemaining(result::add);

        return result;

    }

}
