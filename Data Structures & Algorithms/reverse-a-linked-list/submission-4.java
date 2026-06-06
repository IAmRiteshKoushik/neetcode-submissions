/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        // Store the head
        ListNode newHead = head;
        // If there is a next node then the head would come from there
        // run the reverse list and setup the new head
        // reconnect the tail
        if (head.next != null) {
            newHead = reverseList(head.next);
            ListNode tail = head.next;
            tail.next = head;
            head.next = null;
        }

        return newHead;
    }
}
