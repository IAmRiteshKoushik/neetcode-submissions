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
            return head;
        }

        ListNode ptr = new ListNode(head.val);
        head = head.next;
        while(head != null) {
            ListNode ptr2 = new ListNode(head.val);
            head = head.next;
            ptr2.next = ptr;
            ptr = ptr2;
        }

        return ptr;
    }
}
