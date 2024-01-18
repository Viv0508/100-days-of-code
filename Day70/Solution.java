class Solution {
    int index;
    Map<Integer,Integer>map;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map=new HashMap<>();
        index=inorder.length-1;
        for(int i =0; i<postorder.length;i++)
        map.put(inorder[i],i);
        return helper(postorder,inorder,0,postorder.length-1);
    }
    public TreeNode helper(int[]pre,int[]in,int left,int right) {
        if(left>right)return null;

        int mid= map.get(pre[index]);
        TreeNode curr=new TreeNode(pre[index--]);

        curr.right=helper(pre,in,mid+1,right);
        curr.left=helper(pre,in,left,mid-1);
        return curr;
    }
}
