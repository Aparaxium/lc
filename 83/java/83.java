/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode it = head;

        if (head == null) {
            return null;
        }

        while (it.next != null) {
            if (it.val == it.next.val) {
                it.next = it.next.next;
            }
            if (it.next != null && it.val != it.next.val) {
                it = it.next;
            }
        }
        return head;
    }
}