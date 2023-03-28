package challenges;

import java.math.BigInteger;

/**
 * @author Daniel
 * @Date 28/03/2023
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        String reversedFirstListNodeString = String.valueOf(reversedListToString(reverseListNode(l1)));
        String reversedSecondListNodeString = String.valueOf(reversedListToString(reverseListNode(l2)));

        BigInteger bigInteger = BigInteger.valueOf(Integer.parseInt(reversedFirstListNodeString)
                + Integer.parseInt(reversedSecondListNodeString));
        String reversedListNodesSum = bigInteger + "";

        return listNodeReversedListNodeSum(reversedListNodesSum);
    }

    private static ListNode listNodeReversedListNodeSum(String str) {
        ListNode head = null;
        ListNode current = null;

        for (int i = str.length() - 1; i >= 0; i--) {
            // Get the value of the current character as an integer
            int value = Character.getNumericValue(str.charAt(i));

            // Create a new ListNode with the current value
            ListNode newNode = new ListNode(value);

            // If this is the first node, set it as the head of the list
            if (head == null) {
                head = newNode;
            } else {
                // Otherwise, add the new node to the end of the list
                current.next = newNode;
            }
            current = newNode;
        }
        return head;
    }

    private static StringBuilder reversedListToString(ListNode current) {
        StringBuilder reversedListString = new StringBuilder();

        while (current != null) {
            reversedListString.append(current.val);
            current = current.next;
        }

        return reversedListString;
    }

    private static ListNode reverseListNode(ListNode head) {
        ListNode prev = null;
        ListNode current = head;


        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


      public static class ListNode {
        public int val;
        public ListNode next;
        ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
