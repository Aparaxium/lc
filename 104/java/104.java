/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return dfs(root);
    }

    private int dfs(TreeNode node) {

        if (node == null) {
            return 0;
        }

        return 1 + Math.max(dfs(node.left), dfs(node.right));
    }
}