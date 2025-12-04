class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return inorder(p, q);
    }
    public boolean inorder(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        boolean left = inorder(p.left, q.left);
        if (!left) return false;
        boolean right = inorder(p.right, q.right);
        if (!right) return false;
        return true;
    }
}
