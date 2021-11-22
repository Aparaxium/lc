/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        bool b = new bool();
        rec(p, q, b);
        return b.getB();
    }

    private void rec(TreeNode p, TreeNode q, bool b) {
        if (p == null && q == null) {
            return;
        }
        if ((p == null && q != null) || (q == null && p != null)) {
            b.setB(false);
            return;
        }
        if (p.val != q.val) {
            b.setB(false);
            return;
        }

        rec(p.left, q.left, b);
        rec(p.right, q.right, b);
    }

    private class bool {
        boolean b;

        bool() {
            b = true;
        }

        public boolean getB() {
            return b;
        }

        public void setB(boolean b) {
            this.b = b;
        }
    }
}