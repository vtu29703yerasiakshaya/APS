class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int lb=maxDepth(root.left);
        int rb=maxDepth(root.right);
        return 1+Math.max(lb,rb);
        
    }
}