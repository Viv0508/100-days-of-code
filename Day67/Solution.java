class Solution {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
        
    }
    public static void invert(TreeNode root) {
        if (root == null) return;
        TreeNode temp1 = root.left;
        TreeNode temp2 =root.right;
        root.left = temp2;
        root.right = temp1;
        invert(root.left);
        invert(root.right);
    }
}
