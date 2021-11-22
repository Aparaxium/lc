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
    int maxDepth(TreeNode *root)
    {

        return s(root);
    }

    int s(TreeNode *node)
    {

        if (node == NULL)
        {
            return 0;
        }

        return 1 + max(s(node->left), s(node->right));
    }
};