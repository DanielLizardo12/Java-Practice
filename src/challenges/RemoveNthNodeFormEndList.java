package challenges;

import java.util.Iterator;

public class RemoveNthNodeFormEndList {

  public static void main(String[] args) {
    ListNode listNode5 = new ListNode(5);
    ListNode listNode4 = new ListNode(4, listNode5);
    ListNode listNode3 = new ListNode(3, listNode4);
    ListNode listNode2 = new ListNode(2, listNode3);
    ListNode listNode = new ListNode(1, listNode2);

    System.out.println(removeNthFromEnd(listNode, 2));
    //removeNthFromEnd(listNode, 1);
  }

  public static ListNode removeNthFromEnd(ListNode head, int n) {

    ListNode reversedListNode = reverseListNode(head);

    ListNode current = reversedListNode;
    int i = 1;
    while (i < n - 1 && current != null) {
      current = current.next;
      i++;
    }

    assert current != null;
    current.next = current.next.next;

    while (current.next != null) {
      System.out.println(current.val);
      current = current.next;
    }

    return reverseListNode(current);
  }

  public static ListNode reverseListNode(ListNode listNode) {

    ListNode next;
    ListNode current = listNode;
    ListNode prev = new ListNode();

    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    listNode = prev;
    return listNode;
  }

}
