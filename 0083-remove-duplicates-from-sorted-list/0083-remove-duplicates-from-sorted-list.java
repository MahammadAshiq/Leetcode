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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode nxt = head;

        while (temp != null) {
            nxt = temp.next;
            while (nxt != null && temp.val == nxt.val) {
                nxt = nxt.next;
            }
            temp.next = nxt;
            temp = temp.next;
        }
        return head;
    }
}