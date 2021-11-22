/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
impl Solution {
    pub fn merge_two_lists(l1: Option<Box<ListNode>>, l2: Option<Box<ListNode>>) -> Option<Box<ListNode>> {
        match (l1, l2) {
            (None, None) => None,
            (Some(l), None) | (None, Some(l)) => Some(l),
            (Some(l1), Some(l2)) => {
                if(l1.val < l2.val) {
                    Some(Box::new(ListNode {
                        val: l1.val,
                        next: Solution::merge_two_lists(l1.next, Some(l2))
                    }))
                }
                else {
                    Some(Box::new(ListNode {
                        val: l2.val,
                        next: Solution::merge_two_lists(Some(l1), l2.next)
                    }))
                }
            },
            _ => None
        }
        
    }
}