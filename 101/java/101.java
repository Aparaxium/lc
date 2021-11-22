/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {

    public boolean isSymmetric(TreeNode root) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        if (root == null)
            return true;
        checkl(root.left, list1);
        checkr(root.right, list2);

        System.out.println(list1 + " " + list2);
        return list1.equals(list2);

    }

    private static void checkl(TreeNode root, ArrayList<Integer> list) {

        if (root == null) {
            list.add(null);
        } else {
            list.add(root.val);
            if (root.left != null || root.right != null) {
                checkl(root.left, list);
                checkl(root.right, list);
            }
        }

        return;
    }

    private static void checkr(TreeNode root, ArrayList<Integer> list) {
    
    if(root == null) {
        list.add(null);
    }
    else {
        list.add(root.val);

        if(root.left != null || root.right != null) {
        checkr(root.right, list);
        checkr(root.left, list);
        }
    }
    return;
}

/*
 * public boolean isSymmetric(TreeNode root) { LinkedList<TreeNode> q = new
 * LinkedList<TreeNode>(); ArrayList<Integer> list = new ArrayList<>();
 * generate(root, q, list); System.out.println(list); return true;
 * 
 * }
 * 
 * private void generate(TreeNode root, LinkedList<TreeNode> q,
 * ArrayList<Integer> list) { //System.out.println(root.val + " " + q);
 * list.add((Integer)root.val); if(root.left != null) q.add(root.left);
 * if(root.right != null) q.add(root.right);
 * 
 * if(q.peek() != null) generate(q.poll(), q,list);
 * 
 * return; }
 */