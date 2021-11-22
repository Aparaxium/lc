/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution
{
public:
    bool isSameTree(TreeNode *p, TreeNode *q)
    {
        bool b = true;
        rec(p, q, b);
        return b;
    }

private:
    void rec(TreeNode *p, TreeNode *q, bool &b)
    {
        if (p == NULL && q == NULL)
        {
            return;
        }
        if ((p == NULL && q != NULL) || (q == NULL && p != NULL))
        {
            b = false;
            return;
        }
        if (p->val != q->val)
        {
            b = false;
            return;
        }

        rec(p->left, q->left, b);
        rec(p->right, q->right, b);
    }
};