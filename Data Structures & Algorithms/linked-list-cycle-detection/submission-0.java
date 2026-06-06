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
    public boolean hasCycle(ListNode head) {
        Set<Integer> hashSet = new HashSet<>();

        while(head != null) {
            if (hashSet.contains(head.val)) {
                return true;
            } else {
                hashSet.add(head.val);
            }
            head = head.next;
        }

        return false;
    }
}
