package challenges;

/**
 * @author Daniel
 * @Date 23/03/2023
 */

public class MyLinkedList {

    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // The head of the linked list
    private ListNode head;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        // Set the head to null to indicate an empty list
        head = null;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        // If the list is empty, return -1
        if (head == null) {
            return -1;
        }
        // Traverse the list until we reach the index or the end of the list
        ListNode curr = head;
        int i = 0;
        while (i < index && curr != null) {
            curr = curr.next;
            i++;
        }
        // If we reached the end of the list without finding the index, return -1
        return curr == null ? -1 : curr.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        // Create a new node with the given value
        ListNode newNode = new ListNode(val);
        // Set the new node's next pointer to the current head of the list
        newNode.next = head;
        // Set the head of the list to the new node
        head = newNode;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        // Create a new node with the given value
        ListNode newNode = new ListNode(val);
        // If the list is empty, set the head to the new node and return
        if (head == null) {
            head = newNode;
            return;
        }
        // Traverse the list to find the last node
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        // Set the last node's next pointer to the new node
        curr.next = newNode;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        // If the index is 0, add the new node to the head of the list
        if (index == 0) {
            addAtHead(val);
            return;
        }
        // Create a new node with the given value
        ListNode newNode = new ListNode(val);
        // Traverse the list to find the node before the index
        ListNode curr = head;
        int i = 0;
        while (i < index - 1 && curr != null) {
            curr = curr.next;
            i++;
        }
        // If we reached the end of the list before finding the node before the index, do nothing
        if (curr == null) {
            return;
        }
        // Set the new node's next pointer to the node at the index
        newNode.next = curr.next;
        // Set the node before the index's next pointer to the new node
        curr.next = newNode;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        // If the list is empty, do nothing
        if (head == null) {
            return;
        }
        // If the index is 0, remove the head of the list
        if (index == 0) {
            head = head.next;
            return;
        }
        // Traverse the list to find the node before the index
        ListNode curr = head;
        int i = 0;

        while (i < index - 1 && curr != null) {
            curr = curr.next;
            i++;
        }

        // If we reached the end of the list before finding the node before the index, do nothing
        if (curr == null || curr.next == null) {
            return;
        }
        // Set the node before the index's next pointer to the node after the index
        curr.next = curr.next.next;
    }

}

