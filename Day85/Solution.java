class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
        
    }
    boolean helper(TreeNode node , Integer low , Integer high){

        if(node==null) return true;
        if (high!=null && node.val>=high)return false;

        if(low!=null && node.val<=low) return false;

        boolean left = helper(node.left,low,node.val);
        boolean right = helper(node.right,node.val,high);

        return left && right;
    }
}
