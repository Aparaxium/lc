/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

//LEARN DOUBLE POINTER SOLUTION?

class Solution
{
public:
    ListNode *deleteDuplicates(ListNode *head)
    {

        ListNode *runner = new ListNode(-1, head);
        ListNode *ret = runner;
        ListNode *del;

        if (!head || !head->next)
            return head;

        //iterate
        while (runner)
        {
            //check bounds for p1 and p2, check if p1 val == p2 val
            if (runner->next && runner->next->next && runner->next->val == runner->next->next->val)
            {
                //loop while in bounds and p1 == p2
                while (runner->next && runner->next->next && runner->next->val == runner->next->next->val)
                {
                    //grab p2 for deletion
                    del = runner->next->next;
                    // point p1 to p2 -> next
                    runner->next->next = runner->next->next->next;
                    delete (del);
                }
                //grab p1 for deletion
                del = runner->next;
                //point p0 to p1 -> next, which now points to non repeating number
                runner->next = runner->next->next;
                delete (del);
            }
            else
            {
                //increment, non-repeating found
                runner = runner->next;
            }
        }
        //delete sentinal head
        del = ret;
        ret = ret->next;
        delete (del);
        return ret;
    }
};