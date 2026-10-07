class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        if(root.left==null&& root.right==null){
            if(targetSum==root.val)return true;
            return false;
        }
        int val=targetSum-root.val;
        return hasPathSum(root.left,val)||hasPathSum(root.right,val);
        
    }
}